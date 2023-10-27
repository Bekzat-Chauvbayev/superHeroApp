package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
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
                1-> TextAndImages(
                    textLabel = stringResource(R.string.tap),
                    image = R.drawable.lemon_tree,
                    onClick = {
                    current = 2
                    squeze=(2..4).random()
                }
                )
                2-> TextAndImages(
                    textLabel = stringResource(R.string.keeptaping),
                    image = R.drawable.lemon_squeeze,
                    onClick = {
                        squeze--
                        if(squeze==0) current= 3
                    }
                )
                3-> TextAndImages(
                    textLabel = stringResource(R.string.drink),
                    image = R.drawable.lemon_drink,
                    onClick = {
                        current = 4
                    }
                )
                4-> TextAndImages(
                    textLabel = stringResource(R.string.empty),
                    image = R.drawable.lemon_restart,
                    onClick = {
                        current = 1

                    }
                )
            }
        }
    }


}

@Composable
fun TextAndImages(
    textLabel:String,
    image: Int,
    onClick: ()-> Unit,
    modifier: Modifier = Modifier
){
    Box(modifier = modifier){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(
                onClick = onClick,
                shape = RoundedCornerShape(dimensionResource(androidx.core.R.dimen.compat_button_inset_vertical_material))
                ) {
                Text(text = textLabel)
                Image(painter = painterResource(image),
                    contentDescription = null)
            }
        }
    }



}





@Preview(showBackground = true)
@Composable
fun ClickBehaviorPreview() {
    ClickBehaviorTheme(){
        ClickBehavior()
    }



}