package com.splanes.apps.taskflow.ui.component.snackbar

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.splanes.apps.taskflow.ui.common.theme.color.ColorToken

/*
 * Created on 26/07/2022 at 23:51
 * @author Sergi Planes
 * @since 1.0.0
 */

object Snackbars {
    
    sealed class UiModel : SnackbarData {
        override val visuals: SnackbarVisuals = VisualsImpl(message = "")
    }
    
    sealed class Style(
        open val actionOnNewLine: Boolean = false,
        open val shape: Shape = RoundedCornerShape(16.dp),
        open val containerColor: ColorToken,
        open val contentColor: ColorToken,
        open val actionColor: ColorToken,
        open val actionContentColor: ColorToken,
        open val dismissActionContentColor: ColorToken,
    ) {
        object Success : Style(
            containerColor = ColorToken.Success,
            contentColor = ColorToken.OnSuccess,
            actionColor = ColorToken.Success,
            actionContentColor = ColorToken.OnSuccess,
            dismissActionContentColor = ColorToken.OnSuccess,
        )
        
        object Warning : Style(
            containerColor = ColorToken.Warning,
            contentColor = ColorToken.OnWarning,
            actionColor = ColorToken.Warning,
            actionContentColor = ColorToken.OnWarning,
            dismissActionContentColor = ColorToken.OnWarning,
        )
        
        object Information : Style(
            containerColor = ColorToken.Information,
            contentColor = ColorToken.OnInformation,
            actionColor = ColorToken.Information,
            actionContentColor = ColorToken.OnInformation,
            dismissActionContentColor = ColorToken.OnInformation,
        )
        
        data class Custom internal constructor(
            override val actionOnNewLine: Boolean,
            override val shape: Shape,
            override val containerColor: ColorToken,
            override val contentColor: ColorToken,
            override val actionColor: ColorToken,
            override val actionContentColor: ColorToken,
            override val dismissActionContentColor: ColorToken,
        ) : Style(
            actionOnNewLine = actionOnNewLine,
            shape = shape,
            containerColor = containerColor,
            contentColor = contentColor,
            actionColor = actionColor,
            actionContentColor = actionContentColor,
            dismissActionContentColor = dismissActionContentColor,
        )
    }
    
    private data class VisualsImpl(
        override val message: String,
        override val actionLabel: String? = null,
        override val duration: SnackbarDuration = SnackbarDuration.Long,
        override val withDismissAction: Boolean = true
    ) : SnackbarVisuals
}
