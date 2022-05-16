package com.example.laboratorio2.navegacion

sealed class AppScreens (val route: String){
    object regiones: AppScreens("regiones")
    object platos: AppScreens("platos")
}