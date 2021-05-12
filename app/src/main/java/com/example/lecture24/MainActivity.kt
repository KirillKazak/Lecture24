package com.example.lecture24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val editTextEmail : EditText by lazy {findViewById<EditText>(R.id.edit_text_email)}
    val editTextPassword : EditText by lazy {findViewById<EditText>(R.id.edit_text_password)}
    val button : Button by lazy {findViewById<Button>(R.id.button)}

    companion object obj {
        val EMAIL = "email"
        val PASSWORD = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(View.OnClickListener {
            val intent = Intent(baseContext, MainActivity2::class.java)
            intent.putExtra(EMAIL, editTextEmail.text.toString())
            intent.putExtra(PASSWORD, editTextPassword.text.toString())
            startActivity(intent)
        })
    }
}