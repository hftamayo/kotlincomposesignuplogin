package com.hftamayo.signuplogin.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import com.hftamayo.signuplogin.R
import com.hftamayo.signuplogin.components.NormalTextComponent

@Composable
fun SignupScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ){
        NormalTextComponent(value = stringResource(id = R.string.hello))

    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignupScreen()
}