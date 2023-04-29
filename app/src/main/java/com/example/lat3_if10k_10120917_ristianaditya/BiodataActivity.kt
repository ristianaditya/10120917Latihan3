//TGL   : Sabtu, 29-04-2023
//Nama  : Ristian Aditya
//Kelas : IF10K
//NIM   : 10120917

package com.example.lat3_if10k_10120917_ristianaditya

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class BiodataActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val buttonSelanjutnya : Button = findViewById(R.id.buttonSelanjutnya)
        buttonSelanjutnya.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonSelanjutnya -> {
                val editTextNama = findViewById<EditText>(R.id.editTextNama)
                if (editTextNama.text.isEmpty()){
                    val dialog = Dialog(this)
                    dialog.setContentView(R.layout.activity_warning_dialog_bio)
                    val buttonOke = dialog.findViewById<Button>(R.id.buttonOkeKembali)
                    buttonOke?.setOnClickListener {
                        dialog.dismiss()
                    }
                    dialog.show()
                }else{
                    val editTextNama = findViewById<EditText>(R.id.editTextNama)
                    val moveIntent = Intent(this@BiodataActivity, DoneActivity::class.java)
                    moveIntent.putExtra("username", editTextNama.text.toString())
                    startActivity(moveIntent)
                }
            }
        }
    }
}