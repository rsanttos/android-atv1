package mobile.engsoft.ufrn.com.br.atividade01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button

class IntentUtil {

    companion object{
        var NAME_CONTADOR = "contador"
        fun getContador(intent: Intent): Int {
            var contador: Int?
            contador = intent.getIntExtra(NAME_CONTADOR, 0)
            return contador + 1
        }

        fun getContador(savedInstance: Bundle): Int {
            var contador: Int?
            contador = savedInstance.getInt(NAME_CONTADOR, 0)
            return contador + 1
        }

        fun inputContador(intent: Intent, cont: Int){
            intent.putExtra(NAME_CONTADOR, cont)
        }

        fun setBtnText(btn: Button, cont: Int){
            var btnText = "cont = $cont"
            btn.setText(btnText)
        }

    }
}