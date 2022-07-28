package com.splanes.apps.taskflow.ui.component.spacer.row

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
 * Created on 28/07/2022 at 13:48
 * @author Sergi Planes
 * @since 1.0.0
 */

@Composable
fun RowScope.Space(width: Int) = Spacer(modifier = Modifier.width(width.dp))

@Composable
fun RowScope.Space(weight: Double = 1.0) = Spacer(modifier = Modifier.weight(weight.toFloat()))
