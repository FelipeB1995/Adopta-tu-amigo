package com.ibero.adoptaunamigo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar Firebase Authentication
        auth = FirebaseAuth.getInstance()

        val buttonLogin = findViewById<Button>(R.id.buttonLogin)
        val editTextUser = findViewById<EditText>(R.id.User)

        buttonLogin.setOnClickListener {
            val username = editTextUser.text.toString()

            // Verificar el nombre de usuario
            if (username.isNotEmpty()) {
                // Iniciar sesión con el nombre de usuario
                signIn(username)
            } else {
                // Mostrar mensaje de error si el nombre de usuario está vacío
                Toast.makeText(this, "Por favor ingrese un nombre de usuario", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun signIn(username: String) {
        // Autenticar al usuario con el nombre de usuario
        auth.signInAnonymously()
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Inicio de sesión exitoso, actualizar el nombre de usuario en Firestore o Realtime Database si es necesario
                    val user: FirebaseUser? = auth.currentUser
                    // Navegar a la actividad principal u otra actividad según sea necesario
                    val intent = Intent(this, MenuAdoptaActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // El inicio de sesión falló, mostrar un mensaje de error
                    Toast.makeText(this, "Error en el inicio de sesión: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
