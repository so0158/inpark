# 베이스 이미지: JDK 17을 포함한 경량 이미지 (여기서는 Eclipse Temurin 사용)
FROM openjdk:17-jdk-alpine

# 작업 디렉터리 설정
WORKDIR /app

# 빌드된 JAR 파일을 복사합니다. (빌드시 target 폴더에 생성된 JAR)
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 컨테이너 실행 시 애플리케이션 시작 (기본 포트 8080 사용)
ENTRYPOINT ["java", "-jar", "app.jar"]
