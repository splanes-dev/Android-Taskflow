package com.splanes.apps.taskflow.ui.common.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

/*
 * Created on 26/07/2022 at 20:59
 * @author Sergi Planes
 * @since 1.0.0
 */

abstract class ScreenViewModel : ViewModel(), CoroutineScope {
    
    override val coroutineContext: CoroutineContext
        get() = SupervisorJob() + Dispatchers.Main.immediate
}

fun <VM : ScreenViewModel> VM.launch(
    context: CoroutineContext = Dispatchers.IO,
    block: suspend CoroutineScope.() -> Unit
) = viewModelScope.launch(context = context, block = block)
