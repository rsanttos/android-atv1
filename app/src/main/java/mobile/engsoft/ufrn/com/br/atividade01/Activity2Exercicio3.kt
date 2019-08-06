package mobile.engsoft.ufrn.com.br.atividade01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_activity2_exercicio3.*

class Activity2Exercicio3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity2_exercicio3)

        Log.d("ex3Activity2","onCreate")

    }

    override fun onStart() {
        Log.d("ex3Activity2","onStart")

        var cont: Int?
        cont = IntentUtil.getContador(intent)

        Log.i("cont", cont.toString())

        btn2Ex3.setOnClickListener{
            var newIntent = Intent(this,
                Activity1Exercicio3::class.java)
            IntentUtil.inputContador(newIntent, cont)
            startActivity(newIntent)
            finish()
        }

        IntentUtil.inputContador(intent, cont)
        IntentUtil.setBtnText(btn2Ex3, cont)

        super.onStart()
    }

    override fun onStop(){
        Log.d("ex3Activity2","onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("ex3Activity2","onResume")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d("ex3Activity2","onDestroy")
        super.onDestroy()
    }

    override fun onBackPressed() {
        Log.d("ex3Activity2","onBackPressed")
        super.onBackPressed()
    }
}
