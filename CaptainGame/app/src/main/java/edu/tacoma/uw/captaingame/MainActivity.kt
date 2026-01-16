package edu.tacoma.uw.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.tacoma.uw.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CaptainGameTheme {
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ){
                    CaptainGame()
               }
            }
        }
    }

    @Composable
    fun CaptainGame(){
        val treauresFound by remember{mutableStateOf(0)}
        val direction = remember{ mutableStateOf("North")}
        val stormOrTreasure = remember{mutableStateOf("")}

        Column{
            Text(text = "treasure Found ${treauresFound}")
            Text(text = "Current Direction: ${direction.value}")
            Text(text = "${stormOrTreasure.value}")
            Button(onClick = {
                direction.value = "East"
                if (Random.nextBoolean()){
                    treauresFound +=1
                    stormOrTreasure.value = "WE FOUND A TREASURE"
                }else{
                    stormOrTreasure.value = "Storm AHEAD"
                }
            }){
                Text("sail East")
            }

            Button(onClick = {
                direction.value = "West"
                if (Random.nextBoolean()){
                    treauresFound +=1
                }
            }){
                Text("sail West")
            }

            Button(onClick = {
                direction.value = "North"
                if (Random.nextBoolean()){
                    treauresFound +=1
                    stormOrTreasure.value = "WE FOUND A TREASURE"
                }else{
                    stormOrTreasure.value = "Storm AHEAD"
                }
            }){
                Text("sail North")
            }

            Button(onClick = {
                direction.value = "South"
                if (Random.nextBoolean()){
                    treauresFound +=1
                    stormOrTreasure.value = "WE FOUND A TREASURE"
                }else{
                    stormOrTreasure.value = "Storm AHEAD"
                }
            }){
                Text("sail South")
            }
        }

    }
}


