package com.smartherd.musicapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontVariation.weight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Suppress("ktlint:standard:function-naming")
@Preview
@Composable
fun Calculator(
    state: CalculatorStates,
    modifier: Modifier = Modifier,
    onAction: (CalculatorActions) -> Unit,
) {
    Box {
        Column(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Text(
                text = state.number1 + (state.operation ?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2,
            )
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier =
                        Modifier
                            .background(color = Color.LightGray)
                            .aspectRatio(2f)
                            .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Clear)
                    },
                )

                CalculatorButton(
                    symbol = "DEL",
                    modifier =
                        Modifier
                            .background(color = Color.LightGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Delete)
                    },
                )
                CalculatorButton(
                    symbol = "AC",
                    modifier =
                        Modifier
                            .background(color = Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    },
                )
            }
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    },
                )

                CalculatorButton(
                    symbol = "8",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    },
                )
                CalculatorButton(
                    symbol = "9",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    },
                )
                CalculatorButton(
                    symbol = "x",
                    modifier =
                        Modifier
                            .background(color = Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Multiplication))
                    },
                )
            }
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    },
                )

                CalculatorButton(
                    symbol = "5",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    },
                )
                CalculatorButton(
                    symbol = "6",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    },
                )
                CalculatorButton(
                    symbol = "-",
                    modifier =
                        Modifier
                            .background(color = Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    },
                )
            }
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    },
                )

                CalculatorButton(
                    symbol = "2",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    },
                )
                CalculatorButton(
                    symbol = "3",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    },
                )
                CalculatorButton(
                    symbol = "0",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(2f)
                            .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    },
                )
                CalculatorButton(
                    symbol = ".",
                    modifier =
                        Modifier
                            .background(color = Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Decimal)
                    },
                )

                CalculatorButton(
                    symbol = "=",
                    modifier =
                        Modifier
                            .background(color = Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    },
                )
            }
        }
    }
}
