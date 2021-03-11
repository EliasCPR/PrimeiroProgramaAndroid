package br.senai.sp.jandira.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button_limpar.setOnClickListener {

            limparIMC()

        }

        button_calcular.setOnClickListener {

            if (validacao() == true) {
                calcularIMC()
            }

        }




    }

    fun validacao(): Boolean {
        if (edit_peso.text.isEmpty()) {
            edit_peso.error = "PREENCHA ISSO!!"
            return false
        } else if (edit_altura.text.isEmpty()) {
            edit_altura.error = "PREENCHA ISSO!!"
            return false
        }else {
            return true
        }
    }

    fun calcularIMC(){


        var imc = imc()
        imc.peso = edit_peso.text.toString().toDouble()
        imc.altura = edit_altura.text.toString().toDouble()

        text_resultado.text = imc.calcularImc().toString()

        Toast.makeText(this,"Meu primeiro programa Android",Toast.LENGTH_LONG).show()
    }

    fun limparIMC(){

        var limpar = null

        text_resultado.text = limpar
        edit_altura.text = limpar
        edit_peso.text = limpar
        edit_peso.requestFocus()

    }

}