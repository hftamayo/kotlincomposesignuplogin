package com.hftamayo.signuplogin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import com.hftamayo.signuplogin.R
import com.hftamayo.signuplogin.components.*
import com.hftamayo.signuplogin.navigation.PostOfficeAppRouter
import com.hftamayo.signuplogin.navigation.Screen

@Composable
fun SignupScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.firstName),
                painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.lastName),
                painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.message)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.ic_lock)
            )
            CheckBoxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermAndConditScreen)
                })
            Spacer(modifier = Modifier.height(80.dp))
            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(onTextSelected = {

            })
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignupScreen()
}