package org.example.projetojuquery_v2

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource

import projetojuquery_v2.shared.generated.resources.Res
import projetojuquery_v2.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold(
            // 1. Passe a barra EXATAMENTE neste parâmetro nomeado:
            bottomBar = {
                BottomAppBar(modifier = Modifier.fillMaxWidth()) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Hello World",
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            color = Color.Red,
                            fontWeight = FontWeight.ExtraBold
                        )
                    }
                }
            }
        ) { innerPadding ->
            // 2. O conteúdo do seu aplicativo (o resto da tela) vem AQUI.
            // O Compose exige que você use esse 'innerPadding' para o conteúdo não sumir debaixo da barra.
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding) // Aplica o espaçamento automático da barra
            ) {
                Text("Bem vindo ao Projeto Juquery v2",
                    fontSize = 20.sp, textAlign = TextAlign.Center
                , style = MaterialTheme.typography.titleLarge
                )
                TextField(value = "",
                    onValueChange = {},
                    textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center),
                    label = { Text("Digite seu nome") ; TextAlign.Center ; Modifier.fillMaxWidth()},
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))


            }
        }
    }
}