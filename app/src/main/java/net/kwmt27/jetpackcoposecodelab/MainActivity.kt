package net.kwmt27.jetpackcoposecodelab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.graphics.Color
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                Greeting(name = "Android")
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
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Spacing(24.dp))
}

@Preview("Text Preview")
@Composable
fun DefaultPreview() {
    MyApp {
        Greeting("Android")
    }
}
