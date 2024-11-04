import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun KmpApp() {
    Scaffold(
        bottomBar = {
            BottomBarItems()
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

    }
}


