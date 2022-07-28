package com.splanes.apps.taskflow.ui.feature.user.signin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.SnackbarHostState
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.material.rememberBottomSheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.splanes.apps.taskflow.ui.R
import com.splanes.apps.taskflow.ui.common.resources.text
import com.splanes.apps.taskflow.ui.common.theme.utils.ColorPrimary
import com.splanes.apps.taskflow.ui.common.theme.utils.DisplayLarge
import com.splanes.apps.taskflow.ui.common.theme.utils.font
import com.splanes.apps.taskflow.ui.component.spacer.column.Space

/*
 * Created on 28/07/2022 at 0:53
 * @author Sergi Planes
 * @since 1.0.0
 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SignInComponent() {
    
    val snackbarState = remember { SnackbarHostState() }
    val bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed)
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = bottomSheetState,
        snackbarHostState = snackbarState
    )
    
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        snackbarHost = {},
        sheetContent = {},
    ) { paddings ->
        
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddings),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Space(weight = 1.0)
            Text(
                text = text { R.string.taskflow },
                style = DisplayLarge.font { AmaticSC },
                color = ColorPrimary
            )
            Spacer(modifier = )
        }
    }
}
