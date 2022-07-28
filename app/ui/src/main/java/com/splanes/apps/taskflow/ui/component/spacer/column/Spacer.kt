package com.splanes.apps.taskflow.ui.component.spacer.column

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
 * Created on 28/07/2022 at 13:54
 * @author Sergi Planes
 * @since 1.0.0
 */


@Composable
fun ColumnScope.Space(height: Int) = Spacer(modifier = Modifier.height(height.dp))

@Composable
fun ColumnScope.Space(weight: Double = 1.0) = Spacer(modifier = Modifier.weight(weight.toFloat()))
