package org.example.projetojuquery_v2



import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import projetojuquery_v2.shared.generated.resources.Res
import projetojuquery_v2.shared.generated.resources.ic_home
import projetojuquery_v2.shared.generated.resources.ic_news
import projetojuquery_v2.shared.generated.resources.ic_weather

enum class Destination(
    val route: String,
    val icon: DrawableResource,
    val contentDescription: String,
    val label: String) {

    HOME("home", Res.drawable.ic_home, "Tela de início", "Início"),
        WHEATER("weather", Res.drawable.ic_weather, "Tela de clima", "Clima"),
        NEWS("news", Res.drawable.ic_news, "Tela de notícias", "Notícias"),
}

@Composable
@Preview
fun App() {
     NavigationBarExample()
}

    @Preview()
    @Composable
    fun NavigationBarExample(modifier: Modifier = Modifier) {
        val navController = rememberNavController()
        val startDestination = Destination.HOME
        var selectedDestination by rememberSaveable { mutableIntStateOf(startDestination.ordinal) }

        Scaffold(
            modifier = modifier,
            bottomBar = {
                NavigationBar(windowInsets = NavigationBarDefaults.windowInsets, containerColor = Color.LightGray) {
                Destination.entries.forEachIndexed { index, destination ->
                        NavigationBarItem(
                            selected = selectedDestination == index,
                            onClick = {
                                navController.navigate(route = destination.route)
                                selectedDestination = index
                            },
                            icon = {
                                Icon(
                                    painterResource(destination.icon),
                                    contentDescription = destination.contentDescription,
                                    modifier = Modifier.size(24.dp)
                                )
                            },
                            label = { Text(destination.label) },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = Color.Magenta,
                                unselectedIconColor = Color.Gray,
                                selectedTextColor = Color(0xFF6C63FF),
                                unselectedTextColor = Color(0xFF6C63FF)
                            )
                        )
                    }
                }
            }
        ) { contentPadding ->
            AppNavHost(navController, startDestination, modifier = Modifier.padding(contentPadding))
        }
    }
@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: Destination,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = startDestination.route,
        modifier = modifier
    ) {
        composable(Destination.HOME.route) { Text("Tela Início") }
        composable(Destination.WHEATER.route) { Text("Tela Clima") }
        composable(Destination.NEWS.route) { Text("Tela Notícias") }
    }
}



