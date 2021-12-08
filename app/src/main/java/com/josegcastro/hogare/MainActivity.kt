package com.josegcastro.hogare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.josegcastro.hogare.contexts.LoginContext
import com.josegcastro.hogare.ui.theme.HogareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HogareTheme {
                LoginContext(appCTX = this.baseContext)
            }
        }
    }
}
