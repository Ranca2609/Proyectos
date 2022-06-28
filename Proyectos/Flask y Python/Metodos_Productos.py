from Producto import Produc

class Metodos_Productos:
    
    def __init__(self):
        
        self.lista_productos = []
        
        
    def cargaMasiva(self, productos_cm):
        try:
            for i in productos_cm:
                
                self.createProducto(len(self.lista_productos), i['nombre'], i['precio'], i['categoria'], i['descripcion'])
           
            return self.readProductos()
        
        except Exception as e:
            
            print('\nOcurrió un error durante la carga masiva')
            print(e)
            print('\n')
            return False    


    def readProductos(self):
        ProductosJSON = []
        
        for i in self.lista_productos:
            
            ProductosJSON.append(i.dump())
            
        return ProductosJSON

    def createProducto(self, id, nombre, precio, categoria, descripcion):
        nuevoProducto = Produc(id, nombre, precio, categoria, descripcion)
        self.lista_productos.append(nuevoProducto)
        return nuevoProducto.dump()


    def ModificarProductos(self, id, nombre, precio, categoria, descripcion):
        for producto in self.lista_productos:
            if producto.id == id:
                producto.id = id
                producto.nombre = nombre
                producto.precio = precio
                producto.categoria = categoria
                producto.descripcion = descripcion
                return True
        return False
    
    def EliminarProducto(self, id):
        for i in self.lista_productos:
            if i.id == id:
                self.lista_productos.remove(i)
                return True
        return False

