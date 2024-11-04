import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmpproject.kmp.generated.resources.Res
import kmpproject.kmp.generated.resources.bottom_nav_1
import kmpproject.kmp.generated.resources.bottom_nav_2
import kmpproject.kmp.generated.resources.bottom_nav_3
import kmpproject.kmp.generated.resources.bottom_nav_4
import kmpproject.kmp.generated.resources.home
import kmpproject.kmp.generated.resources.notice
import kmpproject.kmp.generated.resources.profile
import kmpproject.kmp.generated.resources.search
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun BottomBarItems() {
    val bottomBarItems = derivedStateOf {
        buildBottomBarItems()
    }

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        repeat(bottomBarItems.value.size) { index ->
            Column(
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        bottomBarItems.value[index].onClick()
                    }
                ,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(bottomBarItems.value[index].icon),
                    contentDescription = stringResource(bottomBarItems.value[index].text)
                )
                Text(
                    text = stringResource(bottomBarItems.value[index].text)
                )
            }
        }
    }
}

fun buildBottomBarItems(): List<BottomBarItem> {
    return listOf(
        BottomBarItem(
            icon = Res.drawable.home,
            text = Res.string.bottom_nav_1,
            onClick = {

            }
        ),
        BottomBarItem(
            icon = Res.drawable.search,
            text = Res.string.bottom_nav_2,
            onClick = {

            }
        ),
        BottomBarItem(
            icon = Res.drawable.notice,
            text = Res.string.bottom_nav_3,
            onClick = {

            }
        ),
        BottomBarItem(
            icon = Res.drawable.profile,
            text = Res.string.bottom_nav_4,
            onClick = {

            }
        ),
    )
}

class BottomBarItem(
    val icon: DrawableResource,
    val text: StringResource,
    val onClick: () -> Unit,
)

