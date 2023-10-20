package com.hftamayo.signuplogin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hftamayo.signuplogin.R
import com.hftamayo.signuplogin.components.HeadingTextComponent

@Composable
fun TermAndConditScreen(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)){
        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions))
        }
}

@Preview
@Composable
fun TermAndConditScreenPreview(){
    TermAndConditScreen()
}