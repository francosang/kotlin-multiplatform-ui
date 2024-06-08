import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import java.io.File

@Composable
fun Greeting() {
    Box(Modifier.fillMaxSize()) {
        Text("Hola!", Modifier.align(Alignment.Center))
    }
}