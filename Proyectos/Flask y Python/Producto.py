class Produc:
    
 
    def __init__(self, id, nombre, precio, categoria, descripcion):
        self.id = id
        self.nombre = nombre
        self.precio = precio
        self.categoria = categoria 
        self.descripcion = descripcion 


    def dump(self):
        return {
            "id" : self.id,
            "nombre" : self.nombre,
            "precio" : self.precio,
            "categoria" : self.categoria, 
            "descripcion" : self.descripcion
        }