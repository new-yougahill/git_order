package com.example.order

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopView(onTapButton: () -> Unit){
    Column(modifier = Modifier.background(Color.Yellow)){
        Box{
            //Image()
            Text(text= "Colbar's burger",
                modifier = Modifier
                    .background(color =Color.Red)
                    .width(300.dp)
            )
        }
        //Image()
        Row{}
    }
}

@Preview(showBackground = true, widthDp = 400, heightDp=100)
@Composable
fun TopViewPreView(){
    TopView(onTapButton ={})
}