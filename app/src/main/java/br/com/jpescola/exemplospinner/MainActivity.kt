package br.com.jpescola.exemplospinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // instancia o objeto Spinner
        val spinner = findViewById<Spinner>(R.id.spnEstados)

        // adaptador de array
        val dados = arrayOf("São Paulo", "Minas Gerais", "Bahia")
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dados)

        // cria o objeto adaptador
//        var adapter = ArrayAdapter.createFromResource(this,
//            R.array.estados_array,
//            R.layout.meu_spinner)

        // vincula o adaptador ao spinner
        spinner.adapter = adapter

        // define a Activity atual como Listener do Spinner
        spinner.onItemSelectedListener = this

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(this, "posição: $p2", Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


}