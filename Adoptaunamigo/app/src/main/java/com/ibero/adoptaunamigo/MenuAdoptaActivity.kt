package com.ibero.adoptaunamigo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuAdoptaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_adopta)

        val buttonAdopt1 = findViewById<Button>(R.id.buttonAdopt1)
        val buttonAdopt2 = findViewById<Button>(R.id.buttonAdopt2)

        buttonAdopt1.setOnClickListener {
            val intent = Intent(this, DogDetailActivity::class.java).apply {
                putExtra("dogImage", R.drawable.default_dog_image) // Reemplaza con una imagen existente
                putExtra("dogName", getString(R.string.nombre_firulais))
                putExtra("dogBreed", getString(R.string.raza_labrador))
                putExtra("dogAge", getString(R.string.edad_2_a_os))
                putExtra("dogSize", "Grande")
                putExtra("dogVaccination", "Sí")
                putExtra("dogSterilization", "Sí")
                putExtra("dogLocation", "Refugio ABC, Ciudad XYZ")
                putExtra("dogDescription", getString(R.string.descripcion_firulais))
            }
            startActivity(intent)
        }

        buttonAdopt2.setOnClickListener {
            val intent = Intent(this, DogDetailActivity::class.java).apply {
                putExtra("dogImage", R.drawable.default_dog_image) // Reemplaza con una imagen existente
                putExtra("dogName", getString(R.string.nombre_rex))
                putExtra("dogBreed", getString(R.string.raza_pastor_aleman))
                putExtra("dogAge", getString(R.string.edad_3_a_os))
                putExtra("dogSize", "Grande")
                putExtra("dogVaccination", "Sí")
                putExtra("dogSterilization", "Sí")
                putExtra("dogLocation", "Refugio DEF, Ciudad ABC")
                putExtra("dogDescription", getString(R.string.descripcion_rex))
            }
            startActivity(intent)
        }
    }
}


