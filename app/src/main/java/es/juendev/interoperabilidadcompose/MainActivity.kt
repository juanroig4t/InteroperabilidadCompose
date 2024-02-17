package es.juendev.interoperabilidadcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Compose Fullscreen!!",
                    style= MaterialTheme.typography.headlineLarge,
                    color = MaterialTheme.colorScheme.primary
                )

                AndroidView(
                    modifier = Modifier.fillMaxSize(), // Occupy the max size in the Compose UI tree
                    factory = { context ->
                        // Creates view
                        val myView = LayoutInflater.from(context).inflate(R.layout.activity_main, null, false)
                       // do things
                        myView
                    },
                    update = { view ->
                        // View's been inflated or state read in this block has been updated
                        // Add logic here if necessary

                        // As selectedItem is read here, AndroidView will recompose
                        // whenever the state changes
                        // Example of Compose -> View communication

                    }
                )
            }

        }
    }
}