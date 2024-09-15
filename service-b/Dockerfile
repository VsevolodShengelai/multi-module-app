# Используем официальный образ OpenJDK 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем файл JAR в контейнер
COPY target/service-b-1.0-SNAPSHOT.jar service-b.jar

EXPOSE 8082

# Указываем команду для запуска приложения
ENTRYPOINT ["java", "-jar", "service-b.jar"]
