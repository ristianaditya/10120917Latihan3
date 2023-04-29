//TGL   : Sabtu, 29-04-2023
//Nama  : Ristian Aditya
//Kelas : IF10K
//NIM   : 10120917

package com.example.lat3_if10k_10120917_ristianaditya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

    val buttonMulai : Button = findViewById(R.id.buttonMulai)
    buttonMulai.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonMulai -> {
                val moveIntent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}