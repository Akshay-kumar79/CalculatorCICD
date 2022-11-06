package com.akshaw.calculatorcicd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.akshaw.calculatorcicd.ui.theme.CalculatorCICDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorCICDTheme {

            }
        }
    }
}
