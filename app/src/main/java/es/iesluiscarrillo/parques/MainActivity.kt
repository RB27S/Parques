package es.iesluiscarrillo.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import es.iesluiscarrillo.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val Tag = "PARQUE"
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bGuardar.setOnClickListener {
            val cd = CuadroDeDialogo()
            cd.show(supportFragmentManager, "CuadroDialogo")

            Log.d(Tag, "Parque: ${binding.etNombre.text}")
            Log.d(Tag, "Descripción: ${binding.etDescripcion.text}")
            Log.d(Tag, "Teléfono: ${binding.etTelefono.text}")
            Log.d(Tag, "Web: ${binding.etWeb.text}")

            Log.d(Tag, "Hora Apertura: ${binding.spinnerHoraApertura.selectedItem.toString()} Hora Cierre: ${binding.spinnerHoraCierre.selectedItem.toString()}")

            Log.d(Tag, "Actividades:")
            if(binding.cbDeportes.isChecked) Log.d(Tag, binding.cbDeportes.text.toString())
            if(binding.cbParqueInfantil.isChecked) Log.d(Tag, binding.cbParqueInfantil.text.toString())
            if(binding.cbRestaurante.isChecked) Log.d(Tag, binding.cbRestaurante.text.toString())
            if(binding.cbZonaMascotas.isChecked) Log.d(Tag, binding.cbZonaMascotas.text.toString())
        }
    }
}