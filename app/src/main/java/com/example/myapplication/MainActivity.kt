package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.ClickBehaviorTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickBehaviorTheme {
                // A surface container using the 'background' color from the theme
                ClickBehavior()


            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClickBehavior(){
    var current by remember { mutableStateOf(1)}
    var squeze by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Lemonade")
                        },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.onPrimaryContainer)
        ) {
            when(current){
                1-> TextAndImages(textLabel = , image = , onClick = { /*TODO*/ })
                2-> TextAndImages(textLabel = , image = , onClick = { /*TODO*/ })
                3-> TextAndImages(textLabel = , image = , onClick = { /*TODO*/ })
            }
        }
    }


}

@Composable
fun TextAndImages(
    textLabel:String,
    image: Painter,
    onClick: ()-> Unit,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier){

    }



}





@Preview(showBackground = true)
@Composable
fun ClickBehaviorPreview() {
    ClickBehaviorTheme(){
        ClickBehavior()
    }



}