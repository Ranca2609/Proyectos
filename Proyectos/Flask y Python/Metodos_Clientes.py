
from Clientes import Client

class Metodos_Clientes:
    
    # Constructor
    def __init__(self):

        # Arreglo para clientes (simular base de datos)
        self.lista_clientes = []

    def CrearClientes(self, dpi, nombre, apellido, correo, password, edad, compras):
        nuevoCliente = Client(dpi, nombre, apellido, correo, password, edad, compras)
        self.lista_clientes.append(nuevoCliente)
        return nuevoCliente.dump()

    def LecturaClientes(self):
        JSONClientes = []
        for cliente in self.lista_clientes:
            JSONClientes.append(cliente.dump())
        return JSONClientes

    def ModificarClientes(self, dpi, nombre, apellido, correo, password, edad, compras):
        for cliente in self.lista_clientes:
            if cliente.dpi == dpi:
                cliente.dpi = dpi
                cliente.nombre = nombre
                cliente.apellido = apellido 
                cliente.correo = correo 
                cliente.password = password 
                cliente.edad = edad 
                cliente.compras = compras 
                return True
        return False

    def LoginClientes(self, correo, password):
        for i in self.lista_clientes:
            if (correo == i.correo) and ( password == i.password):
                return i.dump()
        return None


    def EliminarClientes(self, dpi):
        for cliente in self.lista_clientes:
            if cliente.dpi == dpi:
                self.lista_clientes.remove(cliente)
                return True
        return False

    def loginCliente(self, correo, password):
        for cliente in self.lista_clientes:
            if cliente.correo == correo and cliente.password == password:
                return cliente.dump()
        return None