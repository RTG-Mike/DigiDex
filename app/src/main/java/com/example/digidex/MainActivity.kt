package com.example.digidex

import android.R
import android.os.Bundle
import android.view.MotionEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.digidex.ui.theme.DigiDexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DigiDexTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    lifeCounter(
                        counter = 4,
                        modifier = Modifier.padding(innerPadding)
                    )
                    override fun onTouchEvent(event: MotionEvent): Boolean {
                        when (event.action) {
                            MotionEvent.ACTION_DOWN -> {
                                counter = counter + 1


                            }
                        }

                        return super.onTouchEvent(event)
                    }


                }
            }
        }
    }
}

@Composable
fun lifeCounter(counter: R.integer , modifier: Modifier = Modifier) {
    Text(
        score = counter.toString()



    )
}


@Preview(showBackground = true)

@Composable
fun GreetingPreview() {
    DigiDexTheme {
        Greeting("score")
    }
}