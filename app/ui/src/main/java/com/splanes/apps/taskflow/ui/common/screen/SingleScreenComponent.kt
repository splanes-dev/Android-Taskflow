package com.splanes.apps.taskflow.ui.common.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.splanes.apps.taskflow.ui.common.theme.AppUi
import com.splanes.apps.taskflow.ui.common.theme.Theme
import kotlinx.coroutines.CoroutineScope

/*
 * Created on 26/07/2022 at 20:42
 * @author Sergi Planes
 * @since 1.0.0
 */

fun ComponentActivity.themeContent(content: @Composable () -> Unit) {
    setContent {
        AppUi.Theme { content() }
    }
}

abstract class SingleScreenComponent : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            AppUi.Theme {
                val coroutineScope = rememberCoroutineScope()
                val systemUiController = rememberSystemUiController()
                //val screenViewModel = rememberSystemUiController()
                ScreenContainer(
                    coroutineScope = coroutineScope,
                    systemUiController = systemUiController,
                    //screenViewModel = screenViewModel
                ) {
                
                }
            }
        }
    }
    
    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    private fun ScreenContainer(
        coroutineScope: CoroutineScope,
        systemUiController: SystemUiController,
        //screenViewModel:
        content: @Composable () -> Unit
    ) {
        /*val snackbarState = remember { SnackbarHostState() }
        snackbarState.
        val bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed)
        val scaffoldState = rememberBottomSheetScaffoldState(
            bottomSheetState = bottomSheetState,
            snackbarHostState = snackbarState
        )
        BottomSheetScaffold(
            scaffoldState = scaffoldState,
            topBar = { ScreenTopBar() },
            snackbarHost = { hostState -> SnackbarHost(modifier = Modifier.padding(horizontal = 20.dp), hostState = hostState) },
            sheetContent = { },
        ) {
        
        }*/
    }
    
    @Composable
    protected open fun ScreenTopBar() {
    
    }
    
    @Composable
    protected open fun ScreenBottomBar() {
    
    }
    
    @Composable
    abstract fun ScreenContent()
}
