"""App URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from Aplicacion import views
urlpatterns = [
    path('admin/', admin.site.urls),
    path('', views.inicio),
    path('cargar/', views.cargar_archivo, name='cargar'),
    path('cargarXML/', views.cargar_archivoXML, name='cargarXML'),
    path('enviar', views.enviar, name='enviar'),
    path('enviarXML', views.enviarXML, name='enviarXML'),    
    path('for', views.For, name='for'),
    path('ayuda/', views.ayuda, name='ayuda'),
    path('RC/', views.ReproduccionCanciones, name='RC'), #RC = Reproduccion de Canciones
    path('RXML/', views.ReproduccionXML, name='RXML'),   
    path('CC/', views.ClasificacionCanciones, name='CC'), #CC = Clasificacion de Canciones
    path('CME/', views.CancionesMasEscuchadas, name='CME'), #CME = Canciones Mas escuchadas
    path('Clasificacion/', views.Clasificacion, name='Clasificacion'),
    path('reset', views.reset, name='reset'),    
    path('resetXML', views.resetXML, name='resetXML'),      
    path('Clasi/', views.Peticion_Calificacion, name='Clasificacion')
]
