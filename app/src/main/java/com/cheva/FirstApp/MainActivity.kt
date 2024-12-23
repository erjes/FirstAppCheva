package com.cheva.FirstApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.cheva.FirstApp.ui.theme.FirstAppTheme
import com.cheva.FirstApp.ui.theme.GreenGrey80

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = stringResource(R.string.app_name))
                            },
                            colors = TopAppBarDefaults.mediumTopAppBarColors(
                                containerColor = GreenGrey80,
                                titleContentColor = Color.White
                            )
                        )
                    }) { innerPadding ->
                    tampilkanTeks("Radja Mahesa Waluya", "607062400054", "\"Ini adalah preview teks yang sangat-sangat panjang, seperti antrian di warung kopi saat akhir pekan. Sebaiknya, Anda tidak usah membacanya, karena isinya hanya sekumpulan kata-kata yang berusaha keras untuk terdengar pintar, padahal sebenarnya mereka hanya ingin berlibur di pantai. Jadi, mari kita anggap ini sebagai pelengkap semata, seperti garam di dalam kue—ada, tapi tidak terlalu penting.", Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun tampilkanTeks(nama: String, nim: String,pesan: String, modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Halo ini $nama", style = MaterialTheme.typography.bodyLarge, color = Color.Black)
            Text(text = "NIM: $nim", style = MaterialTheme.typography.labelMedium, color = Color.Black)
            Text(text = pesan, style = MaterialTheme.typography.bodyMedium, color = Color.Black)
            Text(text = "Sekian Terima Kasih!", style = MaterialTheme.typography.bodyLarge, color = Color.Black)
        }
    }
}
