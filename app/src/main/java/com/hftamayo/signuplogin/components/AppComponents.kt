package com.hftamayo.signuplogin.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hftamayo.signuplogin.R
import com.hftamayo.signuplogin.ui.theme.TextColor


@Composable
fun NormalTextComponent(value:String){
    Text(text = value,
    modifier = Modifier
        .fillMaxWidth()
        .heightIn(min = 80.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
        )
    , color = colorResource(id = R.color.colorText)
    )
}