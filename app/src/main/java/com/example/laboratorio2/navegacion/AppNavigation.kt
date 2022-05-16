package com.example.laboratorio2.navegacion


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.laboratorio2.Image.platos
import com.example.laboratorio2.Image.regiones

@Composable
fun AppNavigation (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.regiones.route){
        composable(route = AppScreens.regiones.route){
            regiones(navController)
        }
        composable(route = AppScreens.platos.route + "/{region}", arguments = listOf(
            navArgument(name = "region"){
                type = NavType.StringType
            })){
            platos(navController, it.arguments?.getString("region"))
        }
    }
}
