package mobile.engsoft.ufrn.com.br.atividade01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = "atividade01"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate()")

        btn01.setOnClickListener{
            Toast.makeText(this, "Cliquei", Toast.LENGTH_LONG).show()

            var intent = Intent(this,
                Main2Activity::class.java)

            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy()")
    }
}
