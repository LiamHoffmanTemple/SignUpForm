package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            val username = findViewById<TextView>(R.id.inputUsername)
            val email = findViewById<TextView>(R.id.inputEmail)
            val password = findViewById<TextView>(R.id.inputEmail)
            val passwordConfirm = findViewById<TextView>(R.id.inputPasswordConfirm)
            var passwordMatch = true
            var valid = true

            if (username.text.toString().isNotEmpty()){

            } else{
                username.error = "Username is a required field"
                valid = false
            }

            if (email.text.toString().isNotEmpty()){

            } else{
                email.error = "Email is a required field"
                valid = false
            }

            if (password.text.toString().isNotEmpty() && passwordConfirm.text.toString().isNotEmpty()){
                if(password.text.toString() == passwordConfirm.text.toString()){

                }else{
                    passwordMatch = false
                    valid = false
                }
            } else{
                username.error = "Password is a required field"
                valid = false
                passwordMatch = false
            }



        }


    }
}