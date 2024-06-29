package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
//-- forrás: https://developer.android.com/develop/ui/compose/tutorial
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MessageCard(Message("Android","Jetpack Compose"))
        }
    }
}
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(painter = painterResource(id = R.drawable.profile_picture), contentDescription = "Contact profile picture",
            modifier = Modifier.padding(all = 16.dp))
    }
    Column {
        Text(text = msg.author)
        Text(text = msg.body)
    }

}
@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!"))
    }
