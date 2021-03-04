package br.senai.sp.jandira.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calcular.setOnClickListener {

            var imc = imc()
            imc.peso = edit_peso.text.toString().toDouble()
            imc.altura = edit_altura.text.toString().toDouble()

            text_resultado.text = imc.calcularImc().toString()

            Toast.makeText(this,"Meu primeiro programa Android",Toast.LENGTH_LONG).show()

        }


    }
}