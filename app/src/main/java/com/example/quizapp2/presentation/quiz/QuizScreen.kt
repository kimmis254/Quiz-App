package com.example.quizapp2.presentation.quiz

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.quizapp2.R
import com.example.quizapp2.presentation.common.QuizAppBar
import com.example.quizapp2.presentation.util.Dimens
import com.example.quizapp2.presentation.util.Dimens.LargeSpacerHeight
import com.example.quizapp2.presentation.util.Dimens.MediumCornerRadius

@Preview
@Composable
fun Prevquiz() {
    QuizScreen(numOfQuiz = 12, quizCategory = "GK", quizDifficulty = "Easy")

}

@Composable
fun QuizScreen(
    numOfQuiz : Int,
    quizCategory : String,
    quizDifficulty : String,
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        QuizAppBar(quizCategory = quizCategory) {
            
        }
        
        Column(
            modifier = Modifier
                .padding(Dimens.SmallPadding)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(LargeSpacerHeight))

            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = "Questions : $numOfQuiz",
                    color = colorResource(id = R.color.blue_grey)
                )

                Spacer(modifier = Modifier.height(Dimens.SmallSpacerHeight))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens.VerySmallViewHeight)
                        .clip(RoundedCornerShape(MediumCornerRadius))
                        .background(
                            colorResource(id = R.color.blue_grey)
                        ),
                ) 
                
                Spacer(modifier = Modifier.height(LargeSpacerHeight))


            }
        }
    }


}