package br.senai.sp.jandira.games.model

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_games")
class Game {

    @PrimaryKey(autoGenerate = true) var id = 0
    var nome = ""
    var titulo = ""
    var descricao = ""
    var estudio = ""
   @ColumnInfo (name = "ano_lancamento")var anoLancamento = ""
    var statusGame = ""
    var foto = ""

}