package com.example.quizapp2.presentation.home.component

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.quizapp2.presentation.common.AppDropDownMenu
import com.example.quizapp2.presentation.common.ButtonBox
import com.example.quizapp2.presentation.home.EventHomeScreen
import com.example.quizapp2.presentation.home.StateHomeScreen
import com.example.quizapp2.presentation.nav_graph.Routes
import com.example.quizapp2.presentation.util.Constants
import com.example.quizapp2.presentation.util.Dimens.MediumPaddingPadding
import com.example.quizapp2.presentation.util.Dimens.MediumSpacerHeight
import com.example.quizapp2.presentation.util.Dimens.SmallSpacerHeight

@Composable
fun HomeScreen(
    state : StateHomeScreen,
    event : (EventHomeScreen) -> Unit,
    navController: NavController
) {

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),) {


        HomeHeader()

        Spacer(modifier = Modifier.height(MediumSpacerHeight))
        AppDropDownMenu(
            menuName = "Number of Questions:",
            menuList = Constants.numberAsString,
            text = state.numberOfQuiz.toString(),
            onDropDownClick = { event(EventHomeScreen.SetNumberOfQuizzes(it.toInt())) })

        Spacer(modifier = Modifier.height(SmallSpacerHeight))
        AppDropDownMenu(
            menuName = "Select Category",
            menuList = Constants.categories,
            text = state.category,
            onDropDownClick = { event(EventHomeScreen.SetQuizCategory(it)) })

        Spacer(modifier = Modifier.height(SmallSpacerHeight))
        AppDropDownMenu(
            menuName = "Select Difficulty",
            menuList = Constants.difficulty,
            text = state.difficulty,
            onDropDownClick = { event(EventHomeScreen.SetQuizDifficulty(it)) })

        Spacer(modifier = Modifier.height(SmallSpacerHeight))
        AppDropDownMenu(
            menuName = "Select Type",
            menuList = Constants.type,
            text = state.type,
            onDropDownClick = { event(EventHomeScreen.SetQuizType(it)) })

        Spacer(modifier = Modifier.height(SmallSpacerHeight))

        ButtonBox(text = "Generate Quiz", padding = MediumPaddingPadding) {

            navController.navigate(
                route = Routes.QuizScreen.passQuizParams(state.numberOfQuiz,state.difficulty, state.category, state.type)

            )

        }
    }
}