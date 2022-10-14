package br.senai.sp.jandira.games.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.idCreateAccount.setOnClickListener(){
            var openSignupActivity = Intent(this,SignupActivity::class.java)

            startActivity(openSignupActivity)
        }
        binding.idButtonLogin.setOnClickListener(){
            login()
        }






    }
    private fun login (){
        if(validate()){
            val email = binding.idInputEmail.text.toString()
            val password = binding.idInputPassword.text.toString()

            val data = getSharedPreferences("data", MODE_PRIVATE)
            val email_not_found = data.getString("email", "Email não encontrado")
            val pass_not_found = data.getString("password","Senha não encontrada" )

            if(email == email_not_found && password == pass_not_found){
                val openProfileGamer = Intent(this, activity_games::class.java)
                    startActivity(openProfileGamer)
            }
            else{
                Toast.makeText(this,"A autenticação falhou", Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun validate():Boolean{
        if(binding.idInputEmail.text.isEmpty()){
            binding.idInputEmail.error = "O email é obrigatório"
            return false
        }
        if(binding.idInputPassword.text.isEmpty()){
            binding.idInputPassword.error = "A senha é obrigatória"
            return false
        }
        return true
    }

}

