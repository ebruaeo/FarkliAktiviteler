package com.example.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class IkinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)

        val intent = intent
        val alinanVeri=intent.getStringExtra("yollananVeri")
        val textView2: TextView =findViewById(R.id.textView2)
        textView2.text =alinanVeri
    }


    fun geriDon(view: View) {
        val intent= Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}