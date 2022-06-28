import json


class AnalizadorJSON():
    def __init__(self):
        self.lista = []
    def analiza_P(self, ruta):
        archivo = open(ruta, 'r',encoding='utf-8')
        info = json.load(archivo)
        for user in info['usuarios']:
            carnet = user['carnet']
            nombre = cursos['Nombre']
            creditos = cursos['Creditos']
            pre = cursos['Prerequisitos']
            obli = cursos['Obligatorio']
            self.lista_apuntes([codigo, nombre, creditos, pre, obli])