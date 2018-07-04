FROM python:3.6

MAINTAINER Marlon Baptista de Quadros(marlonbquadros@gmail.com)

ENV PYTHONUNBUFFERED 1

RUN apt-get update -y
RUN apt-get -y install binutils libproj-dev postgresql-client python3-lxml libmemcached-dev

RUN mkdir /code
WORKDIR /code

ADD requirements.txt /code/

RUN pip install -r requirements.txt

ADD . /code/

EXPOSE 8080

CMD ["/bin/bash", "./.dev/run_web.sh"]