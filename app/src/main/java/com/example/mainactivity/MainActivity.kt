package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickMe(view:View){
        if (txtNome.text.trim().isEmpty()){
        Toast.makeText(this, "Inform your name: ", Toast.LENGTH_LONG).show()
        }
        else{
            val msg = "Hello ${txtNome.text}!"
            showMessage("HEYYA!", msg)
        }
    }

    fun showMessage(title:String, message:String){
        val builder = AlertDialog.Builder(this)

        builder
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("OK", null)
        builder.create().show()
    }
}