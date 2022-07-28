package com.splanes.apps.taskflow.ui.common.theme.utils

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.takeOrElse
import com.splanes.apps.taskflow.ui.common.theme.AppUi
import com.splanes.apps.taskflow.ui.common.theme.color.AppThemeColors
import com.splanes.apps.taskflow.ui.common.theme.color.ColorToken

/*
 * Created on 13/07/2022 at 19:46
 * @author Sergi Planes
 * @since 1.0.0
 */

typealias ThemeColorScheme = AppThemeColors.Scheme

inline val ColorPrimary @Composable get() = themeColor { primary }
inline val ColorOnPrimary @Composable get() = themeColor { onPrimary }
inline val ColorPrimaryContainer @Composable get() = themeColor { primaryContainer }
inline val ColorOnPrimaryContainer @Composable get() = themeColor { onPrimaryContainer }
inline val ColorInversePrimary @Composable get() = themeColor { inversePrimary }
inline val ColorSecondary @Composable get() = themeColor { secondary }
inline val ColorOnSecondary @Composable get() = themeColor { onSecondary }
inline val ColorSecondaryContainer @Composable get() = themeColor { secondaryContainer }
inline val ColorOnSecondaryContainer @Composable get() = themeColor { onSecondaryContainer }
inline val ColorTertiary @Composable get() = themeColor { tertiary }
inline val ColorOnTertiary @Composable get() = themeColor { onTertiary }
inline val ColorTertiaryContainer @Composable get() = themeColor { tertiaryContainer }
inline val ColorOnTertiaryContainer @Composable get() = themeColor { onTertiaryContainer }
inline val ColorBackground @Composable get() = themeColor { background }
inline val ColorOnBackground @Composable get() = themeColor { onBackground }
inline val ColorSurface @Composable get() = themeColor { surface }
inline val ColorOnSurface @Composable get() = themeColor { onSurface }
inline val ColorSurfaceVariant @Composable get() = themeColor { surfaceVariant }
inline val ColorOnSurfaceVariant @Composable get() = themeColor { onSurfaceVariant }
inline val ColorInverseSurface @Composable get() = themeColor { inverseSurface }
inline val ColorInverseOnSurface @Composable get() = themeColor { inverseOnSurface }
inline val ColorError @Composable get() = themeColor { error }
inline val ColorOnError @Composable get() = themeColor { onError }
inline val ColorErrorContainer @Composable get() = themeColor { errorContainer }
inline val ColorOnErrorContainer @Composable get() = themeColor { onErrorContainer }
inline val ColorOutline @Composable get() = themeColor { outline }
inline val ColorSurfaceTint @Composable get() = themeColor { surfaceTint }
inline val ColorSuccess @Composable get() = themeColor { success }
inline val ColorOnSuccess @Composable get() = themeColor { onSuccess }
inline val ColorWarning @Composable get() = themeColor { warning }
inline val ColorOnWarning @Composable get() = themeColor { onWarning }
inline val ColorInformation @Composable get() = themeColor { information }
inline val ColorOnInformation @Composable get() = themeColor { onInformation }

@Composable
inline fun themeColor(color: AppThemeColors.Scheme.() -> Color) = AppUi.colorScheme().color()

@Composable
fun ColorToken.toColor() = when (this) {
    ColorToken.Primary -> ColorPrimary
    ColorToken.OnPrimary -> ColorOnPrimary
    ColorToken.PrimaryContainer -> ColorPrimaryContainer
    ColorToken.OnPrimaryContainer -> ColorOnPrimaryContainer
    ColorToken.InversePrimary -> ColorInversePrimary
    ColorToken.Secondary -> ColorSecondary
    ColorToken.OnSecondary -> ColorOnSecondary
    ColorToken.SecondaryContainer -> ColorSecondaryContainer
    ColorToken.OnSecondaryContainer -> ColorOnSecondaryContainer
    ColorToken.Tertiary -> ColorTertiary
    ColorToken.OnTertiary -> ColorOnTertiary
    ColorToken.TertiaryContainer -> ColorTertiaryContainer
    ColorToken.OnTertiaryContainer -> ColorOnTertiaryContainer
    ColorToken.Background -> ColorBackground
    ColorToken.OnBackground -> ColorOnBackground
    ColorToken.Surface -> ColorSurface
    ColorToken.OnSurface -> ColorOnSurface
    ColorToken.SurfaceVariant -> ColorSurfaceVariant
    ColorToken.OnSurfaceVariant -> ColorOnSurfaceVariant
    ColorToken.InverseSurface -> ColorInverseSurface
    ColorToken.InverseOnSurface -> ColorInverseOnSurface
    ColorToken.Error -> ColorError
    ColorToken.OnError -> ColorOnError
    ColorToken.ErrorContainer -> ColorErrorContainer
    ColorToken.OnErrorContainer -> ColorOnErrorContainer
    ColorToken.Outline -> ColorOutline
    ColorToken.SurfaceTint -> ColorSurfaceTint
    ColorToken.Information -> ColorInformation
    ColorToken.OnInformation -> ColorOnInformation
    ColorToken.OnSuccess -> ColorOnSuccess
    ColorToken.OnWarning -> ColorOnWarning
    ColorToken.Success -> ColorSuccess
    ColorToken.Warning -> ColorWarning
    is ColorToken.Custom -> color(isSystemInDarkTheme())
}

fun ColorToken.Companion.of(light: Color, dark: Color) =
    ColorToken.Custom(color = { isDarkTheme -> if (isDarkTheme) dark else light })

@Composable
fun Color.findContentColor(fallback: Color = ColorOnSurface): Color = themeColor {
    contentColorFor(backgroundColor = this@findContentColor).takeOrElse { fallback }
}

@Composable
fun Color.findBackgroundColor(fallback: Color = ColorSurface): Color = themeColor {
    when (this@findBackgroundColor) {
        onPrimary -> primary
        onSecondary -> secondary
        onTertiary -> tertiary
        onBackground -> background
        onError -> error
        onSurface -> surface
        onSurfaceVariant -> surfaceVariant
        onPrimaryContainer -> primaryContainer
        onSecondaryContainer -> secondaryContainer
        onTertiaryContainer -> tertiaryContainer
        onErrorContainer -> errorContainer
        inverseOnSurface -> inverseSurface
        else -> Color.Unspecified
    }.takeOrElse { fallback }
}

fun Color.alpha(alpha: Double) = copy(alpha = alpha.toFloat())

@Composable
fun Color.merge(color: AppThemeColors.Scheme.() -> Color) = compositeOver(themeColor(color))
