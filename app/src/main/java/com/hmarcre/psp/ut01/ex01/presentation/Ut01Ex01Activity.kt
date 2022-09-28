package com.hmarcre.psp.ut01.ex01.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.hmarcre.psp.R

class Ut01Ex01Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex01)

        val label: TextView = findViewById(R.id.label)
        // val label = findViewById<TextView>(R.id.label)
        label.text = getString(R.string.title)


        Thread{
            Thread.sleep(2000)
            runOnUiThread {
                label.text = "Cambiado!"
            }
        }.start()
    }
}