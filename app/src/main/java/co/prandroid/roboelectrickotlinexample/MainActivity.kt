package co.prandroid.robolectricexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import co.prandroid.roboelectrickotlinexample.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClickTest(view: View){
        val intent= Intent(applicationContext, SecondActivity::class.java)
        startActivity(intent)
    }
}
