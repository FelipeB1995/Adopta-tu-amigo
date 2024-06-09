package com.ibero.adoptaunamigo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DogDetailActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_detail)

        val imageViewDog = findViewById<ImageView>(R.id.imageViewDog)
        val textViewName = findViewById<TextView>(R.id.textViewName)
        val textViewBreed = findViewById<TextView>(R.id.textViewBreed)
        val textViewAge = findViewById<TextView>(R.id.textViewAge)
        val textViewSize = findViewById<TextView>(R.id.textViewSize)
        val textViewVaccination = findViewById<TextView>(R.id.textViewVaccination)
        val textViewSterilization = findViewById<TextView>(R.id.textViewSterilization)
        val textViewLocation = findViewById<TextView>(R.id.textViewLocation)
        val textViewDescription = findViewById<TextView>(R.id.textViewDescription)
        val buttonConfirmAdoption = findViewById<Button>(R.id.buttonConfirmAdoption)

        val dogImage = intent.getIntExtra("dogImage", R.drawable.default_dog_image)
        val dogName = intent.getStringExtra("dogName") ?: "Nombre desconocido"
        val dogBreed = intent.getStringExtra("dogBreed") ?: "Raza desconocida"
        val dogAge = intent.getStringExtra("dogAge") ?: "Edad desconocida"
        val dogSize = intent.getStringExtra("dogSize") ?: "Tamaño desconocido"
        val dogVaccination = intent.getStringExtra("dogVaccination") ?: "Vacunación desconocida"
        val dogSterilization = intent.getStringExtra("dogSterilization") ?: "Esterilización desconocida"
        val dogLocation = intent.getStringExtra("dogLocation") ?: "Ubicación desconocida"
        val dogDescription = intent.getStringExtra("dogDescription") ?: "Descripción no disponible"

        imageViewDog.setImageResource(dogImage)
        textViewName.text = "Nombre: $dogName"
        textViewBreed.text = "Raza: $dogBreed"
        textViewAge.text = "Edad: $dogAge"
        textViewSize.text = "Tamaño: $dogSize"
        textViewVaccination.text = "Vacunado: $dogVaccination"
        textViewSterilization.text = "Esterilizado: $dogSterilization"
        textViewLocation.text = "Ubicación: $dogLocation"
        textViewDescription.text = "Descripción: $dogDescription"

        buttonConfirmAdoption.setOnClickListener {
            // Lógica para confirmar la adopción
            // Por ejemplo, mostrar un mensaje de éxito y regresar al menú principal
        }
    }
}
