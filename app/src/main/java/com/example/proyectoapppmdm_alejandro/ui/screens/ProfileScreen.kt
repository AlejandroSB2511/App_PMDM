package com.example.proyectoapppmdm_alejandro.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.compose.LocalExtendedColorScheme
import com.example.proyectoapppmdm_alejandro.R
import com.example.proyectoapppmdm_alejandro.ui.components.MedHeaderComp
import com.example.proyectoapppmdm_alejandro.ui.components.StandardButton
import com.example.proyectoapppmdm_alejandro.ui.components.StandardButtonColorRed
import com.example.proyectoapppmdm_alejandro.ui.components.StandardText
import com.example.proyectoapppmdm_alejandro.ui.components.StandardTextDetailFav

@Composable
fun ProfileScreenAppCompact(
    navController: NavController
) {
    var isLogged by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary).padding(top = 40.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MedHeaderComp("User Information")
        Spacer(Modifier.height(40.dp))
        Image(
            painter = painterResource(id = R.drawable.forky),
            contentDescription = stringResource(id = R.string.imagen_perfil),
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        StandardTextDetailFav(stringResource(R.string.nombreUsuario))
        StandardTextDetailFav(stringResource(R.string.contraseñaUsuario))
        StandardTextDetailFav(stringResource(R.string.correo))
        StandardTextDetailFav(stringResource(R.string.direccion))
        StandardTextDetailFav(stringResource(R.string.idioma))
        StandardButtonColorRed(
            if (isLogged) stringResource(R.string.logout) else stringResource(R.string.login),
            Modifier.padding(8.dp),
            onClick = { isLogged = !isLogged })


        }

    }