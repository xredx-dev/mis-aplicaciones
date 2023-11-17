package edu.utvt.misproyectos.view

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import edu.utvt.misproyectos.components.GoBackButtonIcon
import edu.utvt.misproyectos.components.MainButton
import edu.utvt.misproyectos.components.MainTitle
import edu.utvt.misproyectos.components.TitleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExampleView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Vista Simple") },
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
        ContentDetails(navController)
    }
}
@Composable
private fun ContentDetails(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        MainTitle("Boton para regresar")
        MainButton("regresar") {
           navController.popBackStack()
        }
    }
}