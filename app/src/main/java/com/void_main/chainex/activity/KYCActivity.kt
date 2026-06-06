package com.void_main.chainex.activity

import com.void_main.chainex.ui.screen.ForeignUserKycScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.void_main.chainex.activity.ui.theme.ChainEXTheme

class KYCActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChainEXTheme {
                ForeignUserKycScreen()
            }
        }
    }
}
