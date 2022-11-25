package br.senai.sp.jandira.games.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import androidx.room.Room
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.adapter.GamesAdapter
import br.senai.sp.jandira.games.dao.GamesDB
import br.senai.sp.jandira.games.databinding.ActivityGamesBinding
import br.senai.sp.jandira.games.databinding.ActivityMainBinding
import br.senai.sp.jandira.games.model.User
import br.senai.sp.jandira.games.repository.GamesRepository
import br.senai.sp.jandira.games.ui.activity_games

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var adapter :GamesAdapter
    lateinit var repository: GamesRepository


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

        val email = binding.idInputEmail.text.toString()
        val password = binding.idInputPassword.text.toString()
        val db = GamesRepository(this)

        val login = db.login(email,password)

        if(login != null){
            val opGames = Intent(this,ActivityGamesBinding::class.java)
            startActivity(opGames)
        }
        else{
            Toast.makeText(this, "Algo deu errado",Toast.LENGTH_LONG)
        }
    }
    }

