# Usa JDK 17, compatível com seu pom.xml
FROM eclipse-temurin:17-jdk

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia apenas os arquivos Maven primeiro (para cache)
COPY pom.xml mvnw ./
COPY .mvn .mvn


# Copia o restante do código-fonte
COPY src src

# Roda o build do Maven (ignora os testes para acelerar)
RUN ./mvnw clean install -DskipTests -DskipSonar

# Expõe a porta que o backend usa (geralmente 8080)
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["sh", "-c", "java -jar $(ls target/*.jar | head -n 1)"]
