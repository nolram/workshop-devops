# Template Django

## Requisitos para construir a imagem

- Imagem: python:3.6
- Váriavel de Ambiente: PYTHONUNBUFFERED=1
- Executar: apt-get update -y
- Executar: apt-get -y install binutils libproj-dev postgresql-client python3-lxml libmemcached-dev
- Criar e definir como diretório principal o /code
- Adicionar o arquivo requirements.txt na pasta /code
- Executar: pip install -r requirements.txt
- Adicionar todo o código fonte em /code
- Comando CMD: /bin/bash ./.dev/run_web.sh


## Requisitos para rodar a imagem:
- PostgreSQL rodando na porta 5432 na mesma rede (Docker network)
- Váriaveis de ambiente:
    -- POSTGRES_PASSWORD
    -- POSTGRES_USER
    -- POSTGRES_DB
    -- POSTGRES_HOST
    -- ENV_DEV=true
