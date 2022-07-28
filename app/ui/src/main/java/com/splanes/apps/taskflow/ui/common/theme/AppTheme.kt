package com.splanes.apps.taskflow.ui.common.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat
import com.splanes.apps.taskflow.ui.common.theme.color.AppThemeColors
import com.splanes.apps.taskflow.ui.common.theme.color.AppThemeColors.toMaterial
import com.splanes.apps.taskflow.ui.common.theme.typo.AppTypography

/*
 * Created on 13/07/2022 at 19:03
 * @author Sergi Planes
 * @since 1.0.0
 */

object AppUi {

    val isDarkMode: Boolean
        @Composable
        @ReadOnlyComposable
        get() = isSystemInDarkTheme()

    @Composable
    fun colorScheme() = when {
        isDarkMode -> AppThemeColors.Dark
        else -> AppThemeColors.Light
    }
}

@Composable
fun AppUi.Theme(content: @Composable () -> Unit) {
    val darkMode = isDarkMode
    val colorScheme = colorScheme()
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkMode
        }
    }

    MaterialTheme(
        colorScheme = colorScheme.toMaterial(),
        typography = AppTypography.model(),
        content = content
    )
}
