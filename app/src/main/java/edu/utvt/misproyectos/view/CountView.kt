package edu.utvt.misproyectos.view

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import edu.utvt.misproyectos.components.ChangeCounter
import edu.utvt.misproyectos.components.CurrentValueCounter
import edu.utvt.misproyectos.components.GoBackButtonIcon
import edu.utvt.misproyectos.components.MainButton
import edu.utvt.misproyectos.components.MainTitle
import edu.utvt.misproyectos.components.TitleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CountView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Contador") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.tertiaryContainer
                ),
                navigationIcon = {
                    GoBackButtonIcon {
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {
        ContentCounter()
    }
}

@Composable
private fun ContentCounter() {
    var counter by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        CurrentValueCounter(counter = counter)
        ChangeCounter(counter = counter) {
            counter = it + 1
        }
    }
}
