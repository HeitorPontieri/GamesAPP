package br.senai.sp.jandira.games.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.adapter.GamesAdapter
import br.senai.sp.jandira.games.dao.HolderDao

import br.senai.sp.jandira.games.databinding.ActivityGamesBinding
import br.senai.sp.jandira.games.model.Game


class activity_games : AppCompatActivity() {

    lateinit var binding: ActivityGamesBinding
    lateinit var rvGames:RecyclerView
    lateinit var adapter: GamesAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_games)

        supportActionBar!!.hide()

        binding = ActivityGamesBinding.inflate(layoutInflater)

        setContentView(binding.root)

        rvGames = findViewById(R.id.rv_games)
        rvGames.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        adapter = GamesAdapter(this)
        adapter.updateGamesList(HolderDao.getJogos(this))

        rvGames.adapter = adapter

        var name = intent.getStringExtra("nome")
        binding.nomeGames.text = name.toString()

        var email = intent.getStringExtra("email")
        binding.emailGames.text = email.toString()

        var nivel = intent.getStringExtra("nivel")
        binding.lvlGamerText.text = nivel.toString()







    }


}