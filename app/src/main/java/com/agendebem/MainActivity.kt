package com.agendebem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.agendebem.ui.theme.AgendeBemTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AgendeBemTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomAppBar {
                            NavigationBarItem(
                                selected = false,
                                onClick = {

                                },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_home),
                                        contentDescription = null
                                    )
                                },
                                label = {
                                    Text(text = "Meu perfil")
                                }
                            )
                            NavigationBarItem(
                                selected = false,
                                onClick = {

                                },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_clipboard),
                                        contentDescription = null
                                    )
                                },
                                label = {
                                    Text(text = "Consultas")
                                }
                            )
                            NavigationBarItem(
                                selected = true,
                                onClick = {

                                },
                                icon = {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_user),
                                        contentDescription = null
                                    )
                                },
                                label = {
                                    Text(text = "Meu perfil")
                                }
                            )
                        }
                    }) { innerPadding ->
                    UsuarioScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}