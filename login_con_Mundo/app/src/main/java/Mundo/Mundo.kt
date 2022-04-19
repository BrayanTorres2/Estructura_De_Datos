package Mundo


import ean.collections.*
import kotlin.collections.ArrayList

fun contraseñas_iguales(contraseña1:String,contraseña2:String):Boolean{
    if(contraseña1==contraseña2){
        return true
    }
    return false
}

class Libros{
    private var codigo=0
    private var nombre=""
    private var autor=""
    private  var precio=0.0

    constructor()
    constructor(codigo: Int, nombre: String, autor: String, precio: Double) {
        this.codigo = codigo
        this.nombre = nombre
        this.autor = autor
        this.precio = precio
    }
    //analizadoras
    fun darcodigo()=codigo
    fun darnombre()=nombre
    fun darautor()=autor
    fun darprecio()=precio
    override fun toString(): String {
        return "Libros(codigo=$codigo, nombre='$nombre', autor='$autor', precio=$precio)"
    }

}

class Tienda{

    private var nombre:String=""
    private var libros=ArrayList<Libros>()
    constructor()
    constructor(nombre: String, libros: ArrayList<Libros>) {
        this.nombre = nombre
        this.libros = libros
    }
    //analizadores
    fun darnombre()=nombre
    fun darlibros()=libros

    fun eliminar_libro(codigo: Int){
        for (l in 0 until  libros.size){
            var elem=libros[l]
            if(codigo==elem.darcodigo()){
                libros.remove(elem)
            }
        }
    }

    fun añadir_libro(numero:Int,nombre: String,autor: String,precio: Double){
        libros.add(Libros(numero,nombre,autor,precio))
    }

}

object Tiendas_objeto{
    var lista_de_libros = ArrayList<Libros>()
    var tienda=Tienda("tienda 1",lista_de_libros)
    fun mostrar_libros():ArrayList<Libros>{
        tienda.añadir_libro(1,"libro 1","auto1",1000.0)
        tienda.añadir_libro(2,"libro 2","auto2",100000.0)
        tienda.añadir_libro(3,"libro 3","auto3",1000.0)
        tienda.añadir_libro(4,"libro 4","auto4",100000.0)
        tienda.añadir_libro(5,"libro 5","auto5",1000.0)
        return tienda.darlibros()
    }

}

