from Usuario import Usu

class Metodos_Usuario:
    
    def __init__(self):
        
        self.lista_usuarios = []
        
    
    def CrearUsuario(self, nombre, correo, password, edad):
        id = len(self.lista_usuarios)
        UsuarioNuevo = Usu(id, correo, password, nombre, edad)
        self.lista_usuarios.append(UsuarioNuevo)
        return UsuarioNuevo.dump()
        
    def ActualizarUsuario(self, id, nombre, correo, password, edad):
        for i in self.lista_usuarios:
            if i.id == id:
                i.nombre = nombre
                i.correo = correo
                i.password = password
                i.edad = edad
                return True
        return False 
     
        
    def LecturaUsuarios(self):
        UsuariosJSON = []
        
        for i in self.lista_usuarios:
            UsuariosJSON.append(i.dump())
        return UsuariosJSON        
        
    def LoginUsuarios(self, correo, password):
        for i in self.lista_usuarios:
            if (correo == i.correo) and ( password == i.password):
                return i.dump()
        return None
        
    def EliminarUsuario(self, idU):
        for i in self.lista_usuarios:
            if i.id == idU:
                self.lista_usuarios.remove(i)
                return True
        return False
    