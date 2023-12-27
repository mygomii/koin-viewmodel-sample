package com.mygomii.koin_viewmodel_sample.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mygomii.koin_viewmodel_sample.android.user.UserViewModel
import com.mygomii.koin_viewmodel_sample.presentations.DefaultData
import com.mygomii.koin_viewmodel_sample.presentations.KMPUserPresenter
import org.koin.androidx.compose.get
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme { App() }
        }
    }
}

@Composable
fun App() {
    Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center) {
        val userName = DefaultData.DEFAULT_USER.name
        FactoryInject()
        ViewModelInject(userName)
    }
}

@Composable
fun ViewModelInject(userName: String, viewModel: UserViewModel = koinViewModel()) {
    Text(text = viewModel.sayHello(userName), modifier = Modifier.padding(8.dp))
}


@Composable
fun FactoryInject(presenter: KMPUserPresenter = get()) {
    Text(text = presenter.sayHello(), modifier = Modifier.padding(8.dp))
}
