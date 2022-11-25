package br.senai.sp.jandira.games.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import br.senai.sp.jandira.games.R
import br.senai.sp.jandira.games.databinding.SignupActivityBinding
import br.senai.sp.jandira.games.model.Game
import br.senai.sp.jandira.games.model.LevelEnum
import br.senai.sp.jandira.games.model.User
import br.senai.sp.jandira.games.repository.GamesRepository


class SignupActivity : AppCompatActivity() {
    lateinit var editName:EditText
    lateinit var editEmail:EditText
    lateinit var editPassword:EditText
    lateinit var editCity:EditText
    lateinit var editBirthDate:EditText
    lateinit var seekBar: SeekBar
    lateinit var spinnerGamerLevel:Spinner
    lateinit var checkboxMale:CheckBox
    lateinit var checkboxFemale:CheckBox
    private var id = 0
    lateinit var binding: SignupActivityBinding
    lateinit var Game:Game
    var user=User()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = SignupActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Game = Game()

        id = intent.getIntExtra("id", 0)
        setContentView(R.layout.signup_activity)
        supportActionBar!!.show()
        supportActionBar!!.title = "Games"

        editName = findViewById(R.id.edit_name)
        editEmail = findViewById(R.id.edit_email)
        editPassword = findViewById(R.id.edit_password)
        editCity = findViewById(R.id.edit_city)
        editBirthDate = findViewById(R.id.edit_birth_date)
        spinnerGamerLevel =findViewById(R.id.spinner_console)
        seekBar = findViewById(R.id.seekbar)
        checkboxFemale = findViewById(R.id.checkbox_female)
        checkboxMale = findViewById(R.id.checkBox_male)

        spinnerGamerLevel.adapter


        seekbar()
    }
    private fun saveUser(){

        val user = User()

        user.id = 0
        user.nome = editName.text.toString()
        user.email = editEmail.text.toString()
        user.senha = editPassword.text.toString()
        user.cidade = editCity.text.toString()



        var GamesRepository = GamesRepository(this)

        if(id>0){
            user.id = id
           GamesRepository.save(user)
        }
        else{
            id = GamesRepository.save(user).toInt()
        }

        Toast.makeText(this,"ID : $id", Toast.LENGTH_LONG).show()

        finish()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.menu_save) {
            saveUser()
             id = intent.getIntExtra("id", 0)
        }
        else if(item.itemId == R.id.menu_settings) {
            Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show()
                return true
            }
        else{

            Toast.makeText(this, "Sair", Toast.LENGTH_SHORT).show()
            return true
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true

    }
    private fun seekbar (){
        var seekBar:SeekBar
        var lvl: TextView
        lvl = findViewById(R.id.level_gamer)
        seekBar = findViewById(R.id.seekbar)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1>15 && p1 <30){
                    lvl.setText("Basic")
                    user.nivel = LevelEnum.Basic
                }
               else if (p1>31 && p1 <45){
                    lvl.setText("Casual")
                    user.nivel = LevelEnum.Casual
                }
                else if (p1>41 && p1 <55){
                    lvl.setText("SemiPro")
                    user.nivel = LevelEnum.SemiPro
                }
                else if (p1>56 && p1 <65){
                    lvl.setText("Pro")
                    user.nivel = LevelEnum.Pro
                }
                else if (p1>66 && p1 <75){
                    lvl.setText("Hacker")
                    user.nivel = LevelEnum.Hacker
                }
                else if (p1>76 && p1 <100){
                    lvl.setText("Legendary")
                    user.nivel = LevelEnum.Legendary
                }


            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })


    }
}
