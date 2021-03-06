"""
WSGI config for mywebsite project.

It exposes the WSGI callable as a module-level variable named ``application``.

For more information on this file, see
https://docs.djangoproject.com/en/2.0/howto/deployment/wsgi/
"""

import os

from django.core.wsgi import get_wsgi_application

if os.environ.get('ENV_DEV'):
    os.environ.setdefault("DJANGO_SETTINGS_MODULE", "mywebsite.settings.dev")
else:
    os.environ.setdefault("DJANGO_SETTINGS_MODULE", "mywebsite.settings.prod")

application = get_wsgi_application()
