# Usa JDK 17, compatível com seu pom.xml
FROM openjdk:17

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia todos os arquivos do seu backend para dentro do container
COPY . .

# Roda o build do Maven (ignora os testes para acelerar)
RUN ./mvnw clean install -DskipTests

# Expõe a porta que o backend usa (geralmente 8080)
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "target/*.jar"]
