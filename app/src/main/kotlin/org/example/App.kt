package org.example

class Complejo(private var real: Double=0.0, private var imagin: Double=0.0) {
    fun inicializar(real:Double,imagin:Double){
        this.real=real
        this.imagin=imagin
    }
    override fun toString():String{
        return "(${real}, ${imagin})"
    }
    fun suma(otro: Complejo): Complejo {
        val re= real + otro.real
        val im= imagin + otro.imagin 
        return Complejo(re, im)
    }
    fun resta(otro: Complejo): Complejo {
        val r= real - otro.real
        val i= imagin - otro.imagin
        return Complejo(r, i)
    }
    fun multa(otro: Complejo): Complejo {
        val rer= (real * otro.real) - (imagin * otro.imagin)
        val igag= (real * otro.imagin) + (imagin * otro.real)
        return Complejo(rer, igag)
    }
    fun divina(otro: Complejo): Complejo {
        val denom= (otro.real * otro.real) + (otro.imagin * otro.imagin)
        if (denom== 0.0) throw ArithmeticException("No puede dividir por 0")
        val reri= (real * otro.real + imagin * otro.imagin) / denom
        val igagi= (imagin * otro.real - real * otro.imagin) / denom
        return Complejo(reri, igagi)
    }
    fun mostrar(){
        println(this.toString())
    }
}
fun main() {
    var complejo: Complejo
    complejo= Complejo()
    complejo.inicializar(3.0,4.0)
    println("mi número complejo es ${complejo.toString()}")
    var c2:Complejo= Complejo(1.0,2.0)
    var c3:Complejo
    c3=complejo.resta(c2)
    c3.mostrar()
    var c4=complejo.multa(c2)
    c4.mostrar()
    var c5=complejo.divina(c2)
    c5.mostrar()
}
 