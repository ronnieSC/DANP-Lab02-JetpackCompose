package com.example.laboratorio2.Image

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio2.R
import androidx.navigation.NavController

@Composable
fun platos(navController: NavController, region: String?){
    Scaffold (topBar = {
        TopAppBar {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow back", modifier = Modifier.clickable { navController.popBackStack() } )
            Spacer(modifier = Modifier.width(8.dp))
            region?.let {
                Text("Platos de la " + it)
            }
        }
    }){
        PlatosBodyContent(region)
    }
}

@Composable
fun PlatosBodyContent(region: String?){
    Column{
        region?.let {
            Text(it,fontSize = 20.sp, modifier = Modifier.padding(all = 15.dp))
        }
        Spacer(modifier = Modifier.height(15.dp))
        Platos(platos = platos, region)
    }
}
@Composable
fun Platos(platos: List<platoData>, code: String?){
    LazyColumn(){
        items(platos){plato ->
            if(plato.cod == code) {
                Plato(plato.title, plato.img)
            }
        }
    }
}
@Composable
fun Plato(title: String, img: Int){
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(all = 16.dp)
            .fillMaxWidth()
            .shadow(375.dp)
    ) {
        Row(
            modifier = Modifier.padding(all = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(img), contentDescription = null, modifier = Modifier.size(50.dp))
            Spacer(modifier = Modifier.width(15.dp))
            Text(title, fontSize = 15.sp)
        }

    }
}

@Preview(showSystemUi = true)
@Preview(showBackground = true)
@Composable
fun PlatosDefaultPreview() {
    //Platos
}

data class  platoData (val cod: String, val  img:  Int , val  title:  String )

private val platos: List<platoData> = listOf(
    platoData("Costa", R.drawable.ceviche,"Ceviche"),
    platoData("Costa",R.drawable.lomosaltado,"Lomo Saltado"),
    platoData("Costa", R.drawable.escabeche, "Escabeche"),
    platoData("Sierra", R.drawable.cuychactado, "Cuy Chactado"),
    platoData("Sierra", R.drawable.papa, "Papa huancaina"),
    platoData("Sierra", R.drawable.adobo, "Adobo Arequipeño"),
    platoData("Selva", R.drawable.juane, "Juane"),
    platoData("Selva", R.drawable.cazuela, "Cazuela de Pescado"),
    platoData("Selva", R.drawable.patarashca, "Patarascha"),

    )