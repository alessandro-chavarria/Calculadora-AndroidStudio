package enrique.chavarria.programacinenrique

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtResultado)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1. Mandar a llamar a todos los elementos
        val txtResultado = findViewById<TextView>(R.id.txtResultado2)
        val num1 = findViewById<EditText>(R.id.txtNum1)
        val num2 = findViewById<EditText>(R.id.txtNum2)
        val btnSumar = findViewById<Button>(R.id.btnSumar)

        //Crepo un objeto de la clase calculadora para con ese objeto, si llamar al metodo sumar
        val objCalculadora = Calculadora()

        //2. Programar los elementos
        btnSumar.setOnClickListener {
           val result = objCalculadora.Sumar(num1.text.toString().toInt(), num2.text.toString().toInt())
            Toast.makeText(this,"este es el resultado $result", Toast.LENGTH_LONG).show()

            txtResultado.text = "El resultado es $result"
        }
    }
}
