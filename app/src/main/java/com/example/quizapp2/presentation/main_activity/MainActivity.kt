package com.example.quizapp2.presentation.main_activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.quizapp2.R
import com.example.quizapp2.presentation.home.HomeScreenViewModel
import com.example.quizapp2.presentation.home.component.HomeScreen
import com.example.quizapp2.presentation.nav_graph.SetNavGraph
import com.example.quizapp2.ui.theme.QuizApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            QuizApp2Theme {
            }
            Box(modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.mid_night_blue)),
                contentAlignment = Alignment.Center) {

                SetNavGraph()
            }

 }
    }
}

