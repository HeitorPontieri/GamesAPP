package br.senai.sp.jandira.games.dao

import android.content.Context
import br.senai.sp.jandira.games.model.Game

class HolderDao {
    companion object {

        fun getJogos(context: Context): List<Game>{

            val g1 = Game()

            g1.id = 1
            g1.nome = "Valorant"
            g1.estudio = "Riot Games"
            g1.descricao = "Valorant é um FPS tático 5x5 que tem como objetivo plantar ou desarmar a Spike. Os jogadores têm apenas uma vida por rodada e a partida é vencida pela equipe que ganhar 13 rodadas (de 25) primeiro."
            g1.foto = "https://s2.glbimg.com/CnHlwtKtIAGBtwvbTxMKJrOtWPU=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2020/4/G/xXHeVfTGe4bMldoEdMRQ/valorant-riot-games.jpg"
            g1.anoLancamento = "2020"

            val g2 = Game()

            g2.id = 2
            g2.nome = "Valorant"
            g2.estudio = "Riot Games"
            g2.descricao = "Valorant é um FPS tático 5x5 que tem como objetivo plantar ou desarmar a Spike. Os jogadores têm apenas uma vida por rodada e a partida é vencida pela equipe que ganhar 13 rodadas (de 25) primeiro."
            g2.foto = "https://s2.glbimg.com/CnHlwtKtIAGBtwvbTxMKJrOtWPU=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2020/4/G/xXHeVfTGe4bMldoEdMRQ/valorant-riot-games.jpg"
            g2.anoLancamento = "2020"

            val g3 = Game()

            g3.id = 3
            g3.nome = "Valorant"
            g3.estudio = "Riot Games"
            g3.descricao = "Valorant é um FPS tático 5x5 que tem como objetivo plantar ou desarmar a Spike. Os jogadores têm apenas uma vida por rodada e a partida é vencida pela equipe que ganhar 13 rodadas (de 25) primeiro."
            g3.foto = "https://s2.glbimg.com/CnHlwtKtIAGBtwvbTxMKJrOtWPU=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2020/4/G/xXHeVfTGe4bMldoEdMRQ/valorant-riot-games.jpg"
            g3.anoLancamento = "2020"

            val g4 = Game()

            g4.id = 4
            g4.nome = "Valorant"
            g4.estudio = "Riot Games"
            g4.descricao = "Valorant é um FPS tático 5x5 que tem como objetivo plantar ou desarmar a Spike. Os jogadores têm apenas uma vida por rodada e a partida é vencida pela equipe que ganhar 13 rodadas (de 25) primeiro."
            g4.foto = "https://s2.glbimg.com/CnHlwtKtIAGBtwvbTxMKJrOtWPU=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2020/4/G/xXHeVfTGe4bMldoEdMRQ/valorant-riot-games.jpg"
            g4.anoLancamento = "2020"

            val g5 = Game()

            g5.id = 5
            g5.nome = "Valorant"
            g5.estudio = "Riot Games"
            g5.descricao = "Valorant é um FPS tático 5x5 que tem como objetivo plantar ou desarmar a Spike. Os jogadores têm apenas uma vida por rodada e a partida é vencida pela equipe que ganhar 13 rodadas (de 25) primeiro."
            g5.foto = "https://s2.glbimg.com/CnHlwtKtIAGBtwvbTxMKJrOtWPU=/1200x/smart/filters:cover():strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2020/4/G/xXHeVfTGe4bMldoEdMRQ/valorant-riot-games.jpg"
            g5.anoLancamento = "2020"

            val pontosTuristicos = listOf<Game>(g1,g2,g3,g4,g5)

            return pontosTuristicos

        }
    }
}