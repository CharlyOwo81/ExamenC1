package mx.edu.itson.examenc1

import android.os.Bundle
import android.widget.Button
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
        val calcular:Button=findViewById(R.id.btnCalcular)

        calcular.setOnClickListener {
            try {
                var polizaTipo = tipoPoliza.text.toString()
                var aniosPoliza = anios.text.toString().toInt()

                if (polizaTipo == "Autos Sedan") {
                    costo.setText("$"+polizaSedan)
                    var totalImprimir=calcularPoliza(aniosPoliza,polizaSedan)
                    total.setText("$"+totalImprimir)

                }else if (polizaTipo == "Autos Deportivos") {
                    costo.setText("$"+polizaDeportivos)
                    var totalImprimir=calcularPoliza(aniosPoliza,polizaDeportivos)
                    total.setText("$"+totalImprimir)

                }else if (polizaTipo == "Camionetas") {
                    costo.setText("$"+polizaCamioneta)
                    var totalImprimir=calcularPoliza(aniosPoliza,polizaCamioneta)
                    total.setText("$"+totalImprimir)
                }
            }catch (e:java.lang.Exception){
                total.setText("Algo salio mal")
            }
        }
    }
    fun calcularPoliza(anios:Int, costoPoliza:Float):Float{
        var result = anios*costoPoliza
        return result
    }
}