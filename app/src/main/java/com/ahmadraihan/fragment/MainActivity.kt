package com.ahmadraihan.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnf1: Button = findViewById(R.id.fragment1)
        val btnf2: Button = findViewById(R.id.fragment2)
        val btnf3: Button = findViewById(R.id.fragment3)
        var fm = supportFragmentManager
        var ft = fm.beginTransaction()
        ft
                .add(R.id.fragmentdisini, FragmentProfil())
                .commit()
        btnf1.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft
                    .replace(R.id.fragmentdisini, FragmentProfil())
                    .commit()
        }
        btnf2.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft
                    .replace(R.id.fragmentdisini, FragmentHome())
                    .commit()
        }

        btnf3.setOnClickListener {
            var fm = supportFragmentManager
            var ft = fm.beginTransaction()
            ft
                    .replace(R.id.fragmentdisini, FragmentShop())
                    .commit()
        }
    }
}