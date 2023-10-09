package com.hftamayo.signuplogin.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun NormalTextComponent(value:String){
    Text(text = value,
    modifier = Modifier.fillMaxWidth().heightIn()
}