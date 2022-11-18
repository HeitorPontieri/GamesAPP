package br.senai.sp.jandira.games.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tbl_user")
class User {

    @PrimaryKey(autoGenerate = true)  var id = 0

    var nome = ""
    var email = ""
    var senha = ""
    var data_nascimento = 0
    var cidade = ""
    var nivel = LevelEnum.Noob
    var console = ""
    var sexo  = 'I'
}