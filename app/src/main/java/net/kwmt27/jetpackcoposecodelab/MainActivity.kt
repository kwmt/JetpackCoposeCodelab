package net.kwmt27.jetpackcoposecodelab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Spacing
import androidx.ui.material.Button
import androidx.ui.material.ContainedButtonStyle
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun MyApp(child: @Composable() () -> Unit) {
    MaterialTheme() {
        Surface(color = Color.Yellow) {
            child()
        }
    }
}

@Composable
fun MyScreenContent() {
    Column {
        Greeting(name = "Android")
        Divider(color = Color.Black)
        Greeting(name = "there")

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Spacing(24.dp))
}

val myNames = listOf("Manuel", "Nick", "Jose", "Florina", "Yacine")

@Composable
fun MyExampleFunction(names: List<String> = myNames) {
    Column {
        for (name in names) {
            Text(text = name)
        }
    }
}

@Composable
fun EnabledButton(text: String, enabled: Boolean) {
    Button(
        text = text,
        style = ContainedButtonStyle(
            color = if (enabled) Color.White else Color.Gray
        )
    )
}

@Composable
fun MyExampleEnabledButtonList() {
    Column {
        myNames.forEachIndexed { index, name ->
            EnabledButton(text = name, enabled = index % 2 == 0)
        }
    }
}

@Preview("Text Preview")
@Composable
fun DefaultPreview() {
    MyApp {
        MyExampleEnabledButtonList()
    }
}
