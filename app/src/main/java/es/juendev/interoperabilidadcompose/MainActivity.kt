package es.juendev.interoperabilidadcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val composeView = findViewById<ComposeView>(R.id.compose_view)

        composeView.setContent {
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Compose!!!!!!",
                    style= MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.primary
                )
            }

        }
    }
}