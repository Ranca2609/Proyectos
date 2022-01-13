from django.shortcuts import render, redirect
import requests
import requests as req

endpoint = 'http://127.0.0.1:5000/'


#-------Renders de las  Paginas-----------
def inicio(x):
    return render(x, 'Inicio.html')

def ayuda(request):
    
    return render(request, 'Ayuda.html')

def ReproduccionCanciones(request):
    
    return render(request, 'ReproduccionCanciones.html')

def ClasificacionCanciones(request):
    
    return render(request, 'ClasificacionCanciones.html')

def CancionesMasEscuchadas(request):
    
    return render(request, 'CancionesMasEscuchadas.html')

def Clasificacion(request):
    
    return render(request, 'Clasificacion.html')

def ReproduccionXML(request):
    
    return render(request, 'ReproduccionXML.html')

def For(request):
    
    return render(request, 'PruebaFor.html')

#---------------Carga CSV_XML-------------
xml = ''
xml2 = ''
def cargar_archivo(request):
    contexto = {}
    global xml
    global xml2
    if request.method == 'POST':
        print("post")
        xml = request.FILES['File'].read()
        xml = xml.decode('utf-8')
    contexto = {
        'xml': xml,
        'xml2': xml2,
    }

    return render(request, 'CargarArchivos.html', contexto)

#---------------Carga XML_JSON-------------

json = ''
json2 = ''
def cargar_archivoXML(request):
    contexto = {}
    global json
    global json2
    if request.method == 'POST':
        print("post")
        json = request.FILES['File'].read()
        json = json.decode('utf-8')
    contexto = {
        'json': json,
        'json2': json2,
    }

    return render(request, 'CargaXML.html', contexto)

#------------------Envio de CSV----------------------
def enviar(request):
    if request.method == 'POST':
        global xml2
        req.post('http://127.0.0.1:5000/xml', xml)
        xml2 = req.get('http://127.0.0.1:5000/xml')
        xml2 = xml2.text
    return redirect('cargar')

#---------------Envio de XML------------------------

def enviarXML(request):
    if request.method == 'POST':
        global json2
        req.post('http://127.0.0.1:5000/json', json)
        json2 = req.get('http://127.0.0.1:5000/json')
        json2 = json2.text
    return redirect('cargarXML')

#------------Reset CSV--------------------------------
def reset(request):
    req.post('http://127.0.0.1:5000/reset')
    global xml
    global xml2
    xml = ''
    xml2 = ''
    return redirect('cargar')
    
#-------------Reset XML----------------------------
def resetXML(request):
    req.post('http://127.0.0.1:5000/resetXML')
    global json
    global json2
    json = ''
    json2 = ''
    return redirect('cargarXML')
    
#----------------Calificacion de Canciones----------------
   
def Peticion_Calificacion(request):
    if request.method == 'GET':
        nombre = request.GET['fname']
        estrellas = request.GET['estrellas']
        nombre2 = request.GET['fname2']
        estrellas2 = request.GET['estrellas2']
        nombre3 = request.GET['fname3']
        estrellas3 = request.GET['estrellas3']        
        peticion = requests.get('http://127.0.0.1:5000/Clasi/' + str(nombre)+'/'+ str(estrellas) + '/'+ str(nombre2) +'/'+str(estrellas2) +'/'+ str(nombre3) + '/' + str(estrellas3));
    
    return render(request, 'Clasificacion.html')        















