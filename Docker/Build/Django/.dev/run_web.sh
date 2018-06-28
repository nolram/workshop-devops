#!/bin/sh

# prepare init migration
su -m root -c "python manage.py makemigrations"
# migrate db, so we have the latest db schema
su -m root -c "python manage.py migrate"
# start development server on public ip interface, on port 8080
su -m root -c "python manage.py runserver 0.0.0.0:8080"