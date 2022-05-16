package com.example.laboratorio2.Image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.laboratorio2.R
import com.example.laboratorio2.navegacion.AppScreens

@Composable
fun regiones(navController: NavController){
    Scaffold (
        modifier = Modifier.padding(20.dp)
    ){
        BodyContent(navController)
    }
}
@Composable
fun BodyContent(navController: NavController){
    Column() {
        Text("Regiones y Platos Típicos", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(50.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row() {
                RegionCosta(navController)
            }
            Row() {
                RegionSierra(navController)
            }
            Row(){
                RegionSelva(navController)
            }
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegionCosta(navController: NavController){
    Card(
        shape = RoundedCornerShape(20),
        elevation = 4.dp,
        modifier = Modifier.padding(5.dp),
        onClick = {
            navController.navigate(route = AppScreens.platos.route + "/Costa")
        }
    ) {

        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painterResource(R.drawable.ceviche),"Principal", modifier = Modifier
                    .padding(1.dp)
                    .size(100.dp))
            Text("Costa", fontSize = 20.sp)
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegionSierra(navController: NavController){
    Card(
        shape = RoundedCornerShape(20),
        elevation = 4.dp,
        modifier = Modifier.padding(5.dp),
        onClick = {
            navController.navigate(route = AppScreens.platos.route + "/Sierra")
        }
    ) {

        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(
                painterResource(R.drawable.adobo),"Principal", modifier = Modifier
                    .padding(1.dp)
                    .size(100.dp))
            Text("Sierra", fontSize = 20.sp)
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun RegionSelva(navController: NavController){
    Card(
        shape = RoundedCornerShape(20),
        elevation = 4.dp,
        modifier = Modifier.padding(5.dp),
        onClick = {
            navController.navigate(route = AppScreens.platos.route + "/Selva")
        }
    ) {

        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Image(painterResource(R.drawable.cazuela),"Principal", modifier = Modifier
                .padding(1.dp)
                .size(100.dp))
            Text("Selva", fontSize = 20.sp)
        }
    }
}
@Preview(showSystemUi = true)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    //regiones()
}