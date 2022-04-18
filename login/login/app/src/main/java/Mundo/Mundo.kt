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

}
fun agregarlibros(): MutableList<Libros> {
    var lista_de_libros = ArrayList<Libros>().toMutableList()
    lista_de_libros.add(Libros(1,"libro 1","auto1",1000.0))
    lista_de_libros.add(Libros(1,"libro 2","auto2",100000.0))
    lista_de_libros.add(Libros(1,"libro 3","auto3",1000.0))
    lista_de_libros.add(Libros(1,"libro 4","auto4",10.0))
    lista_de_libros.add(Libros(1,"libro 5","auto5",100.0))
    lista_de_libros.add(Libros(1,"libro 6","auto6",1000000.0))
    lista_de_libros.add(Libros(1,"libro 7","auto7",100000.0))
    return lista_de_libros
}




