package mx.edu.itson.examenc1

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tipoPoliza:EditText=findViewById(R.id.etTipoPoliza)
        val costo:EditText=findViewById(R.id.etCosto)
        val anios:EditText=findViewById(R.id.etAnios)
        val total:TextView=findViewById(R.id.tvTotalPoliza)

        tipoPoliza.text.toString()


        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
fun calcularTotalPoliza(){

}