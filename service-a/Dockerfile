# Используем официальный образ OpenJDK 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем файл JAR в контейнер
COPY target/service-a-1.0-SNAPSHOT.jar service-a.jar

EXPOSE 8081

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "service-a.jar"]
