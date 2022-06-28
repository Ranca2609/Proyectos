from flask import Flask
from flask import Flask, request, jsonify
import json
from Metodos_Usuarios import Metodos_Usuario
from Metodos_Productos import Metodos_Productos
from Metodos_Clientes import Metodos_Clientes
from flask import render_template, make_response
MetUsuarios = Metodos_Usuario()
MetProductos  = Metodos_Productos()
MetClientes = Metodos_Clientes()

app = Flask(__name__)

Array_Clientes = []

@app.route("/", methods=["GET"])
def login_home():
    
    return render_template("LoginAdmin.html")

@app.route('/Administrador/Inicio_admin', methods=["GET"])
def inicioAdmin():
    return render_template("InicioAdmin.html")

@app.route('/ClientesLogin', methods=["GET"])
def LoginCli():
    return render_template("LoginClientes.html")
@app.route('/ClientesInicio', methods=["GET"])
def inicioClientes():
    return render_template("InicioClientes.html")

@app.route('/CrearClientes', methods=["GET"])
def PaginaCrearCliente():
    return render_template("CrearCliente.html")

@app.route('/CargasP', methods=["GET"])
def CargaProductos():
    return render_template("CargaProductos.html")

@app.route('/Login', methods=['POST'])
def Admin():
    usarme = request.json['usuario']
    password = request.json['password']
    if usarme == 'admin@ipc1.com' and  password == 'admin':
                            Dato = {
                'tipoUs': 'Admin',
                'message': 'Succes',
                'usuario': 'Admin'
            }

    else:
        Dato = {
                'message': 'Failed',
                'usuario': ' '
            }
        
    respuesta = jsonify(Dato)
    return (respuesta)


    
@app.route('/auth', methods=["POST"])
def LoginUsuario():
    correo = request.json["correo"]
    password = request.json["password"]
    #peticion = MetClientes.LoginClientes(correo, password)
    for i in MetClientes.lista_clientes:
        if (correo == i.correo) and ( password == i.password):
            Dato = {
                'tipoUs': 'Cliente',
                'message': 'Succes',
                'usuario': correo
            }

        else:
            Dato = {
                'message': 'Failed',
                'usuario': correo
                }
        
    respuesta = jsonify(Dato)
    return (respuesta)
  
    
#------------------Usuarios-------------------------------------------

@app.route('/usuario', methods=["PUT"])
def CreacionUsuario():
    nombre = request.json["nombre"]
    correo = request.json["correo"]
    password = request.json["password"]
    edad = request.json["edad"]
    peticion = MetUsuarios.CrearUsuario(nombre, correo, password, edad)
    return jsonify({ "mensaje": "El usuario fue creado con exito", "data": peticion}), 201

@app.route('/usuario', methods=["GET"])
def getUsuarios():
    return jsonify({"data": MetUsuarios.LecturaUsuarios()})
    #return jsonify({"data": crudUsuarios.readUsers()})

@app.route('/usuario', methods=["POST"])
def updateUsuario():
    id_u = request.json["id"]
    nombre = request.json["nombre"]
    correo = request.json["correo"]
    password = request.json["password"]
    edad = request.json["edad"]
    peticion = MetUsuarios.ActualizarUsuario(id_u, nombre, correo, password, edad)
    #resultado = crudUsuarios.updateUser(id_u, nombre, correo, pwd, edad)

    if peticion:
        return jsonify({ "mensaje": "Usuario " + nombre + " modificado con éxito" }), 200
    
    return jsonify({ "mensaje": "Usuario no encontrado" }), 404

@app.route('/usuario', methods=["DELETE"])
def deleteUsuario():
    id_u = request.json["id"]
    peticion = MetUsuarios.EliminarUsuario(id_u)
    
    if peticion:
        return jsonify({ "mensaje": "Usuario con id " + str(id_u) + " eliminado con éxito" }), 200
    
    return jsonify({ "mensaje": "Usuario no encontrado" }), 404    
 
#-----------------------------------------------------------------------------
#@app.route('/cliente',methods=['PUT'])

#def CrearCliente():
    
#    nombre = request.json['nombre']
#    apellido = request.json['apellido']
#    dpi = request.json['dpi']
#    correo = request.json['correo']
#    password = request.json['password']
#    edad = request.json['edad']
#    compras = request.json['compras']
#    Array_Clientes.append([nombre, apellido, dpi, correo, password, edad, compras])
#    for i in Array_Clientes:
#        print(i)
#    return 'Se realizo con exito'

#-----------------------------------Clientes--------------------------------- 
@app.route('/cliente', methods=["PUT"])
def CrearCliente():
    dpi = request.json["dpi"]
    username = request.json["username"]
    apellido = request.json["apellido"] 
    correo = request.json["correo"] 
    password = request.json["password"] 
    edad = request.json["edad"] 
    compras = request.json["compras"] 
    peticion = MetClientes.CrearClientes(dpi, username, apellido, correo, password, edad, compras)
    
    return jsonify({ "mensaje": "Cliente creado con exito", "data": peticion}), 201

@app.route('/cliente', methods=["GET"])
def ObtenerListado():
    return jsonify({"data": MetClientes.LecturaClientes()})
   

@app.route('/cliente', methods=["DELETE"])
def EliminarClientes():
    dpi = request.json["dpi"]
    peticion = MetClientes.EliminarClientes(dpi)
    
    if peticion:
        return jsonify({ "mensaje": "Usuario con id " + str(dpi) + " eliminado con éxito" }), 200
    
    return jsonify({ "mensaje": "Cliente no encontrado" }), 404    


@app.route('/cliente', methods=["POST"])
def ModificarCliente():
    dpi = request.json["dpi"]
    nombre = request.json["nombre"]
    apellido = request.json["apellido"] 
    correo = request.json["correo"] 
    password = request.json["password"] 
    edad = request.json["edad"] 
    compras = request.json["compras"] 
    peticion = MetClientes.ModificarClientes(dpi, nombre, apellido, correo, password, edad, compras)

    if peticion:
        return jsonify({ "mensaje": "Cliente " + nombre + " modificado con éxito" }), 200
    
    return jsonify({ "mensaje": "Cliente no encontrado" }), 404


#--------------------------Productos-------------------------------

@app.route('/producto', methods=["PUT"])
def cargaMasiva():
    productos = request.json["Productos"]
    peticion = MetProductos.cargaMasiva(productos)
    if not peticion:
        return jsonify({ "mensaje": "Ocurrió un error durante la carga masiva" }), 500

    return jsonify({ "mensaje": "Carga masiva exitosa", "data": peticion})

@app.route('/producto', methods=["GET"])
def ObtenerListadoProducto():
    return jsonify({"data": MetProductos.readProductos()})


@app.route('/producto', methods=["DELETE"])
def EliminarProductos():
    id = request.json["id"]
    
    peticion = MetProductos.EliminarProducto(id)
    
    if peticion:
        return jsonify({ "mensaje": "Producto con id " + str(id) + " eliminado con éxito" }), 200
    
    return jsonify({ "mensaje": "Producto no encontrado" }), 404    

@app.route('/producto', methods=["POST"])
def ModificarProducto():
    id = request.json["id"]
    nombre = request.json["nombre"]
    precio = request.json["precio"] 
    categoria = request.json["categoria"] 
    descripcion = request.json["descripcion"] 
    peticion = MetProductos.ModificarProductos(id, nombre, precio, categoria, descripcion)

    if peticion:
        return jsonify({ "mensaje": "El producto  " + nombre + " fue modificado con éxito" }), 200
    
    return jsonify({ "mensaje": "Producto no encontrado" }), 404


        


if __name__ == '__main__':
    app.run(debug=True, port=3000)
    
    
    
    
   