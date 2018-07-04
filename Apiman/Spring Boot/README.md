# Template Spring Boot

## Requisitos para construir a imagem
Usando Multi-stage build 
Primeira etapa
- Usar imagem maven:alpine
- Executar: mkdir /code
- Usar o diretório /code (workdir)
- Copiar os arquivos da raiz para o /code
- Executar: mvn clean install

Segunda etapa
- Usar imagem openjdk:8-jdk-alpine
- Usar o volume /tmp
- Copiar o artefato gerado na etapa anterior e colar com o nome de app.jar
- ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

## Requisitos para rodar a imagem:
- Mongo rodando na mesma rede (Docker network)
- Váriaveis de ambiente:
    -- MONGO_HOST
    -- MONGO_PORT
    -- MONGO_DATABASE
