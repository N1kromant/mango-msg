package com.n1kromant.nikromsg

import android.os.Bundle
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
import com.n1kromant.nikromsg.ui.navigation.auth.AuthPage
import com.n1kromant.nikromsg.ui.theme.NikroMsgTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NikroMsgTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    AuthPage(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
