package com.example.quizapp2.presentation.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import com.example.quizapp2.R
import kotlin.math.max

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizAppBar(
    quizCategory : String,
    onBackClick : () -> Unit,
) {
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = colorResource(id = R.color.dark_blue_slate),
            actionIconContentColor = colorResource(id = R.color.blue_grey)
        ),
        title = {
            Text(
                text = quizCategory,
                color = colorResource(id = R.color.blue_grey),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        
        
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(painterResource(id = R.drawable.baseline_menu_open_24) , contentDescription = "")
                
            }
        }
        )


}