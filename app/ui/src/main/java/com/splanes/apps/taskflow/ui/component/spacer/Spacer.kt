package com.splanes.apps.taskflow.ui.component.spacer

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
 * Created on 28/07/2022 at 13:55
 * @author Sergi Planes
 * @since 1.0.0
 */


@Composable
fun Space(h: Int = 0, w: Int = 0) = Spacer(modifier = Modifier.size(width = w.dp, height = h.dp))
