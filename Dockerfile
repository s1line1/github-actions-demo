# ==================== Stage 1: Build ====================
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app

# 先只拷贝 pom.xml，利用 docker layer cache 避免每次重复下载依赖
COPY pom.xml .
RUN mvn -B dependency:go-offline

# 拷贝源码并打包（跳过测试，测试在 workflow 中单独执行）
COPY . .
RUN mvn -B package -DskipTests

# ==================== Stage 2: Runtime ====================
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
