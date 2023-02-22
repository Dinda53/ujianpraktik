package com.example.upa_pplg1_2972

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnbiodata = findViewById<Button>(R.id.button1)
        val btnpendidikan = findViewById<Button>(R.id.button2)
        val btnportofolio = findViewById<Button>(R.id.button3)

        btnbiodata.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            startActivity(intent)
        }

        btnpendidikan.setOnClickListener {
            val intent= Intent( this, PendidikanActivity::class.java)
            startActivity(intent)
        }
        btnportofolio.setOnClickListener {
            val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)
        }
    }
}