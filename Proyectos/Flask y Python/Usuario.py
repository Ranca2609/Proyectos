class Usu:
    def __init__(self, id, correo, password, nombre, edad):
        
        self.id = id
        self.nombre = nombre
        self.correo = correo
        self.password = password
        self.edad = edad
        
    def dump(self):
        
        return {
            'id': self.id,
            'correo': self.correo,
            'password': self.password,
            'nombre': self.nombre,
            'edad': self.edad
        }
        