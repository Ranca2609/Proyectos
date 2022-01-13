from flask import Flask, request, jsonify
from flask_cors import CORS
from xml.dom import minidom
from xml.etree import ElementTree as ET
import matplotlib.pyplot as plt
import json
app = Flask(__name__)
app.config["DEBUG"] = True

CORS(app)


@app.route('/xml', methods=['POST'])
def post_xml():
    csv_escrito = open('C:/Users/Carlos Rangel/Desktop/Proyectoo/IPC2_Proyecto3_201907636-main/Backend/Entrada.csv', 'w')
    informacion =request.data.decode('utf-8')
    csv_escrito.write(informacion)
    csv_escrito.close()
    xml = request.data.decode('utf-8')
    return xml 
    #print(xml)
 
@app.route("/xml", methods=['GET'])
def get_xml():
    VecesR = []
    Array = []
    ArraySaltos = []
    Arreglo = []
    Arreglo2 = []
    Canciones = []
    with open('C:/Users/Carlos Rangel/Documents/GitHub/IPC2_Proyecto3_201907636/Backend/Entrada.csv') as File:
        x = File.readlines()
        for  i in x:
            if i == "\n":
                ArraySaltos.append(i)
            else:
                Array.append(i)
        for i in Array:
            Spliteado  = i.split(',')       
            Arreglo.append(Spliteado)
        print(Arreglo)
        for i in Arreglo[1:]:
            Arreglo2.append([i[0], i[1], i[2], i[3], i[4],i[5], i[6]])
        document = minidom.Document()
        root = document.createElement('ListasReproduccion')
        document.appendChild(root)
        Etiqueta_Lista = document.createElement('Lista')
        root.appendChild(Etiqueta_Lista)
        Etiqueta_Lista.setAttribute("nombre", "MiLista")    
        for k in Arreglo2:
            cancion = document.createElement('cancion')
            root.appendChild(cancion)
            cancion.setAttribute("nombre",i[1])
            Canciones.append(i[1])
            ##----------Artista--------------------
            Artista = document.createElement('artista')
            cancion.appendChild(Artista)
            Artista.appendChild(document.createTextNode(i[2])) 
            #----------Album--------------------------- 
            Album = document.createElement('album')
            cancion.appendChild(Album)
            Album.appendChild(document.createTextNode(i[3])) 
            #---------Veces Reproducida-------------  
            VR = document.createElement('vecesReproducida')
            cancion.appendChild(VR)
            VR.appendChild(document.createTextNode(i[4])) 
            VecesR.append(i[4])
            #--------Imagen------------------------  
            Imagen = document.createElement('imagen')
            cancion.appendChild(Imagen)
            Imagen.appendChild(document.createTextNode(i[5])) 
            #---------Ruta-------------------------------
            Ruta = document.createElement('ruta')
            cancion.appendChild(Ruta)
            Removido = i[6].replace("\n", "")
            Ruta.appendChild(document.createTextNode(Removido)) 
        xml_output = document.toprettyxml(indent='\t', newl='\n', encoding='utf-8')
        xml_output = xml_output.decode('utf-8')
        archivo = open('C:/Users/Carlos Rangel/Desktop/Proyectoo/Pruebas/Prueba.xml', 'w')
        archivo.write(xml_output)
        archivo.close()
        VecesRF = []
        for o in VecesR:
            nuevo = o.replace(" ", "")
            VecesRF.append(int(nuevo))
        print(VecesRF)
        colores = ['#025DE0', '#0BC1B9', '#ACDC0A', '#F6920B', '#F0FF00', '#E01002', '#3C3B3D']
        fechas = Canciones
        primas = VecesRF
        plt.autoscale()
        plt.bar(range(len(Canciones)), primas, edgecolor='black', color=colores)
        plt.xticks(range(len(Canciones)), fechas, rotation = 'vertical')
        plt.margins(0.2)
        plt.subplots_adjust(bottom=0.45)
        plt.title(str('Grafica'))
        plt.ylim(int(min(primas)) - 1, int(max(primas)) + 1)
        plt.savefig("C:/Users/Carlos Rangel/Desktop/Proyectoo/Grafica_fechas.png")
        return xml_output
    
@app.route("/reset", methods=['POST'])
def reset():
    global xml2
    return 'Datos Borrados'

@app.route("/resetXML", methods=['POST'])
def resetXML():
    global json2
    return 'Datos Borrados'

@app.route('/Clasi/<nombre>/<estrellas>/<nombre2>/<estrellas2>/<nombre3>/<estrellas3>', methods=['GET'])
def Clasificacion(nombre, estrellas, nombre2, estrellas2, nombre3, estrellas3):
    print(nombre)
    print(estrellas)
    Clasificacion_Canciones = [nombre, nombre2, nombre3]
    Estrellas = [estrellas, estrellas2, estrellas3]
    colores = ["#EE6055","#60D394","#AAF683","#FFD97D","#FF9B85"]
    plt.pie(Estrellas, labels=Clasificacion_Canciones, autopct="%0.1f %%", colors=colores)
    plt.axis("equal")
    plt.savefig("C:/Users/Carlos Rangel/Documents/GitHub/IPC2_Proyecto3_201907636/App/Aplicacion/static/Clasificacion.png")
    return "Grafica Generada"
    
    
    
#-----------------------------------------
@app.route('/json', methods=['POST'])
def post_json():
    csv_escrito = open('C:/Users/Carlos Rangel/Desktop/Proyectoo/IPC2_Proyecto3_201907636-main/Backend/Entrada.xml', 'w')
    informacion =request.data.decode('utf-8')
    csv_escrito.write(informacion)
    csv_escrito.close()
    xml = request.data.decode('utf-8')
    return xml 



#-----------------------------------------    
@app.route("/json", methods=['GET'])    
def RetornaJSON():
    Array_Elementos = []
    with open('C:/Users/Carlos Rangel/Desktop/Proyectoo/IPC2_Proyecto3_201907636-main/Backend/Entrada.xml') as File:
        xml = ET.parse(File)
        root = xml.getroot()
        for elem in root:
            for subelemento in elem:
                for subsub in subelemento:
                    if subsub.tag == 'artista':
                        Artista = subsub.text
                        continue
                    if subsub.tag == 'album':
                        Album = subsub.text
                        continue
                    if subsub.tag == 'vecesReproducida':
                        VecesReproducidas = subsub.text  
                        continue
                    if subsub.tag == 'imagen':
                        Imagen = subsub.text  
                        continue      
                    if subsub.tag == 'ruta':
                        Ruta = subsub.text                                   
                    Array_Elementos.append([Artista, Album, VecesReproducidas, Imagen, Ruta])
        Informacion = {}
        Informacion['Lista'] = []
        for i in Array_Elementos:
            Informacion['Lista'].append({
            'Artista': i[0],
            'Album': i[1],
            'VecesReproducidas': i[2],
            'Imagen': i[3],
            'Ruta': i[4]})
        with open('data.json', 'w') as file:
            json.dump(Informacion, file, indent=4)
    return Informacion    
        

if __name__ == "__main__":
    app.run(debug=True)


