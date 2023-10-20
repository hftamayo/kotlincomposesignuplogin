package com.hftamayo.signuplogin.app


import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.hftamayo.signuplogin.navigation.PostOfficeAppRouter
import com.hftamayo.signuplogin.navigation.Screen
import com.hftamayo.signuplogin.screens.SignupScreen
import com.hftamayo.signuplogin.screens.TermAndConditScreen

@Composable
fun PostOfficeApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ){
        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState->
            when(currentState.value){
                is Screen.SignUpScreen -> {
                    SignupScreen()
                }
                is Screen.TermAndConditScreen -> {
                    TermAndConditScreen()
                }
            }
        }
    }
}