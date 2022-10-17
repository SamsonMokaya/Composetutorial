package com.example.composetutorial

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import androidx.compose.foundation.clickable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                   // MessageCard(Message("Android", "Jetpack Compose"))
                    val conversations = SampleData()
                    val messages = conversations.getAllMessages()
                    Conversations(messages = messages)

                }
            }
        }
    }
}



@Composable
private fun MessageCard(msg: Message) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp),
     //   verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(msg.profilePicture),
            contentDescription = null,
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.primary, CircleShape),
                contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(8.dp))

        var isExpanded by remember {
            mutableStateOf(false)
        }

        val surfaceColor by animateColorAsState(
            if(isExpanded) MaterialTheme.colors.onSecondary else MaterialTheme.colors.surface
        )

        Column(modifier = Modifier.clickable { isExpanded = !isExpanded }) {
            Text(
                text = msg.author,
                //color = MaterialTheme.colors.secondary,
                color = when(msg.author){
                    "Abby" -> MaterialTheme.colors.onSurface
                    "Samson" -> MaterialTheme.colors.onSecondary
                    else -> MaterialTheme.colors.secondary

                },
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Surface(
                shape = MaterialTheme.shapes.medium,
                elevation = 3.dp,
                color = surfaceColor,
            modifier = Modifier.animateContentSize().padding(1.dp),
            ){
                Text(
                    text = msg.body,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.subtitle1,
                    maxLines = if (isExpanded) Int.MAX_VALUE else 2,
                )
            }

        }
    }
}



@Composable
fun Conversations(messages: List<Message>){
    LazyColumn{
        items(messages) {
                message -> MessageCard(
            msg = message
        )
        }
    }
}


@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun PreviewMessageCard() {
    ComposeTutorialTheme {
        Surface {
            val messages = remember{
                SampleData().getAllMessages()
            }
            Conversations(
                messages
            )
        }
    }
}




