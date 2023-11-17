package edu.utvt.misproyectos.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainTitle(
    message:String = "Aplicaciones",
    fontSize: TextUnit = 30.sp,
    fontWeight: FontWeight = FontWeight.Bold,
    modifier: Modifier = Modifier.padding(10.dp)

){
    Text(text = message,fontSize = fontSize,fontWeight =fontWeight, modifier =modifier);
}

@Composable
fun MainButton(
    message: String = "Default",
    backColor : Color = Color.DarkGray,
    color : Color = Color.White,
    onClick : () -> Unit
){
    Button(
        onClick = onClick,colors = ButtonDefaults.buttonColors(
            contentColor = color,
            containerColor = backColor
        )
    ){
        Text(text = message)
    }
}

@Composable
fun GoBackButtonIcon(
    description:String = "Default",
    color: Color = Color.White,
    icon:ImageVector = Icons.Default.ArrowBack,
    onClick: ()-> Unit
){
    IconButton(onClick = onClick) {
        Icon(imageVector = icon, contentDescription = description, tint = color)
    }
}

@Composable
fun CustomFloatingActionButton(
    contentDescription: String = "",
    icon: ImageVector = Icons.Default.Add
) {
    FloatingActionButton(onClick = {}) {
        Icon(imageVector = icon, contentDescription = contentDescription)
    }
}