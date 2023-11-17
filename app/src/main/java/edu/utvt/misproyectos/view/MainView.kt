package edu.utvt.misproyectos.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import edu.utvt.misproyectos.components.BottomTitleBar
import edu.utvt.misproyectos.components.CustomFloatingActionButton
import edu.utvt.misproyectos.components.MainButton
import edu.utvt.misproyectos.components.MainTitle
import edu.utvt.misproyectos.components.TitleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView(){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar()},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        },

        bottomBar ={
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                BottomTitleBar()
            }
        },

        floatingActionButton = {
            CustomFloatingActionButton()
        }

    ){
        ContentDetails()
    }
}

@Composable
private fun ContentDetails(){

    Column(
        modifier =  Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainTitle()
        MainButton {
            println("Hola Mundo")
        }
    }
}