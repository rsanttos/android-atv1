package mobile.engsoft.ufrn.com.br.atividade01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_activity1_exercicio3.*

class Activity1Exercicio3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1_exercicio3)
        Log.d("ex3Activity1","onCreate")
    }

    override fun onStart() {
        Log.d("ex3Activity1","onStart")

        var cont: Int
        cont = IntentUtil.getContador(intent)
        Log.i("cont", cont.toString())

        btn1Ex3.setOnClickListener{
            var newIntent = Intent(this,
                Activity2Exercicio3::class.java)
            IntentUtil.inputContador(newIntent, cont)
            startActivity(newIntent)
        }
        IntentUtil.setBtnText(btn1Ex3, cont)
        super.onStart()
    }

    override fun onStop(){
        Log.d("ex3Activity1","onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("ex3Activity1","onResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d("ex3Activity1","onRestart")
        super.onRestart()
    }
}
