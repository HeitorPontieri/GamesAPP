package br.senai.sp.jandira.games.model

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tbl_console")
class Console {
    @PrimaryKey(autoGenerate = true) var id = 0
    var nome = ""
    var fabricante = ""
    var descricao = ""
    var ano_Nascimento = 0

}