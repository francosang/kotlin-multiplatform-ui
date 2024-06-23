import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.jfranco.shared.Greeting

@Composable
fun GreetingUi() {
    Box(Modifier.fillMaxSize()) {
        Text(Greeting.greet(), Modifier.align(Alignment.Center))
    }
}