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
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var polizaSedan:Float=500F
        var polizaDeportivos:Float=1200F
        var polizaCamioneta:Float=700F

        val tipoPoliza:EditText=findViewById(R.id.etTipoPoliza)
        val costo:TextView=findViewById(R.id.tvCosto)
        val anios:EditText=findViewById(R.id.etAnios)
        val total:TextView=findViewById(R.id.tvTotal)

        try {
            var polizaTipo = tipoPoliza.text.toString()
            var aniosObtener = anios.text.toString().toInt()

        }catch (e:java.lang.Exception){
            print("Error en la compilación")
        }
    }
}
fun calcularTotalPoliza(aniosPoliza:Int,polizaCosto:Float){

}