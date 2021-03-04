package br.senai.sp.jandira.calculadoraimc

class imc {

    var peso = 0.0
    var altura = 0.0

    fun calcularImc(): Double {
        return peso / Math.pow(altura, 2.0)
    }

}