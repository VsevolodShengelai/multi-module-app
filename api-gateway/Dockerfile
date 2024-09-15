# Используем официальный образ OpenJDK 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем файл JAR в контейнер
COPY target/api-gateway-1.0-SNAPSHOT.jar api-gateway.jar

EXPOSE 8080

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
