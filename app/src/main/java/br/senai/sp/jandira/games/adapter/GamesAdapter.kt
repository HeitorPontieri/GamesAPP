package br.senai.sp.jandira.games.adapter

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.model.Game
import br.senai.sp.jandira.games.ui.activity_games

import java.util.Collections.list

class GamesAdapter(val context: Context) : RecyclerView.Adapter<GamesAdapter.HolderGame>() {

    private lateinit var gameList:List<Game>

    fun updateGamesList(games:List<Game>){
        this.gameList = games
        notifyDataSetChanged()
    }
    class HolderGame(view: View) : RecyclerView.ViewHolder(view) {
        val textTitulo = view.findViewById<TextView>(R.id.nome_game)
        val textDescricao = view.findViewById<TextView>(R.id.decricao_game)

        val AnoLancamento = view.findViewById<TextView>(R.id.ano_lancamento_game)
        val textEstudio = view.findViewById<TextView>(R.id.nome_studio)

        fun bind (game: Game){
            textTitulo.text = game.nome
            textDescricao.text = game.descricao
            textEstudio.text = game.estudio

            AnoLancamento.text = game.anoLancamento

        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderGame {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_holder_layout, parent, false)
        return HolderGame(view)
    }

    override fun onBindViewHolder(holder: HolderGame, position: Int) {
        holder.bind(gameList.get(position))
    }

    override fun getItemCount(): Int {
        return gameList.size
    }




}

