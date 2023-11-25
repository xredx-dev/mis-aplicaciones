package edu.utvt.misproyectos.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CurrentValueCounter(counter :Int){
    Text(
        text = "$counter",
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.padding(bottom = 20.dp)
    )
}

@Composable
fun ChangeCounter(counter: Int = 0, updateCounter: (Int)-> Unit){
    Button(onClick = { updateCounter(counter) }) {
        Text(text = "Actualizar Contador")
    }
}