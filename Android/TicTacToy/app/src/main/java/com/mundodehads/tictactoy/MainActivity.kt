package com.mundodehads.tictactoy

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
    var playerTurn:Int = 1
    var turns:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View){
        val btnSelected = view as Button
        var id:Int = 0
        when(btnSelected.id){
            R.id.btn1 -> id = 1
            R.id.btn2 -> id = 2
            R.id.btn3 -> id = 3
            R.id.btn4 -> id = 4
            R.id.btn5 -> id = 5
            R.id.btn6 -> id = 6
            R.id.btn7 -> id = 7
            R.id.btn8 -> id = 8
            R.id.btn9 -> id = 9
        }
        PlayTurn(id, btnSelected)
    }

    fun PlayTurn (id:Int, btnSelected:Button){
        if(playerTurn == 1){
            btnSelected.text="X"
            btnSelected.setBackgroundColor(Color.BLUE)
            player1.add(id)
            playerTurn = 2
            btnSelected.isEnabled=false
            CheckWiner()
            AutoPlay()
        }else if(playerTurn == 2){
            btnSelected.text="O"
            btnSelected.setBackgroundColor(Color.YELLOW)
            player2.add(id)
            playerTurn = 1
            btnSelected.isEnabled=false
            CheckWiner()
        }
    }

    fun AutoPlay(){
        var emptyCells=ArrayList<Int>()
        for(id in 1..9) {
            if (!(player1.contains(id) || player2.contains(id))) {
                emptyCells.add(id)
            }
        }
        val r=Random()
        if(emptyCells.size > 0) {
            val index = r.nextInt(emptyCells.size - 0) + 0
            val id = emptyCells[index]
            var btn: Button?
            when (id) {
                1 -> btn = btn1
                2 -> btn = btn2
                3 -> btn = btn3
                4 -> btn = btn4
                5 -> btn = btn5
                6 -> btn = btn6
                7 -> btn = btn7
                8 -> btn = btn8
                9 -> btn = btn9
                else -> btn = btn1
            }
            PlayTurn(id, btn)
        }else {
            Toast.makeText(this, "Draw!", Toast.LENGTH_LONG).show()
            ResetGame()
        }
    }

    fun CheckWiner(){
        var winer:Int = 0
        //Player1 ...
        //row 1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winer=1
        }
        //row 2
        else if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winer=1
        }
        //row 3
        else if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winer=1
        }
        //col 1
        else if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winer=1
        }
        //col 2
        else if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winer=1
        }
        //col 3
        else if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winer=1
        }
        //dia 1
        else if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winer=1
        }
        //dia 2
        else if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winer=1
        }
        //Player1 ...
        //Player2 ...
        //row 1
        else if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winer=2
        }
        //row 2
        else if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winer=2
        }
        //row 3
        else if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winer=2
        }
        //col 1
        else if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winer=2
        }
        //col 2
        else if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winer=2
        }
        //col 3
        else if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winer=2
        }
        //dia 1
        else if(player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winer=2
        }
        //dia 2
        else if(player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winer=2
        }
        //Player2 ...
        if(winer != 0){
            if(winer == 1){
                Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_LONG).show()
                ResetGame()
            }else if(winer ==2){
                Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_LONG).show()
                ResetGame()
            }
        }
    }

    fun ResetGame () {
        var clearList=ArrayList<Int>()
        this.player1=clearList
        this.player2=clearList
        this.playerTurn = 1
        this.recreate()
    }
}
