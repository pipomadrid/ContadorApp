package com.example.contadorapp.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.contadorapp.viewmodels.ContadorViewModel


@Composable
fun Contador(contadorViewModel: ContadorViewModel) {
    val contador:Int  by contadorViewModel.contador.observeAsState(initial = 0)

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()

    ) {
        Text(
            text = contador.toString(),
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp
        )

        FloatingActionButton(
            onClick = { contadorViewModel.addContador()}, modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(15.dp),

            ) {
            Icon(imageVector = Icons.Default.KeyboardArrowUp,contentDescription = " ")
        }

        FloatingActionButton(
            onClick = { contadorViewModel.minusContador() }, modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(15.dp),

            ) {
            Icon(imageVector = Icons.Default.KeyboardArrowDown,contentDescription = " ")
        }


    }

}