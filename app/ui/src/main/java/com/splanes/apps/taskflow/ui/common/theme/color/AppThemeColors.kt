package com.splanes.apps.taskflow.ui.common.theme.color

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/*
 * Created on 27/07/2022 at 21:17
 * @author Sergi Planes
 * @since 1.0.0
 */

object AppThemeColors {
    
    val Light
        get() = Scheme(
            primary = ColorPalette.Red.Tosca,
            onPrimary = ColorPalette.Basic.WhiteSoapstone,
            primaryContainer = ColorPalette.Red.LightCoral,
            onPrimaryContainer = ColorPalette.Gray.MineShaft,
            inversePrimary = ColorPalette.Red.Tosca,
            secondary = ColorPalette.Red.CrownOfThrones,
            onSecondary = ColorPalette.Basic.WhiteSoapstone,
            secondaryContainer = ColorPalette.Red.ChestnutRose,
            onSecondaryContainer = ColorPalette.Gray.Mercury,
            tertiary = ColorPalette.Orange.Koromiko,
            onTertiary = ColorPalette.Gray.MineShaft,
            tertiaryContainer = ColorPalette.Orange.NavajoWhite,
            onTertiaryContainer = ColorPalette.Gray.MineShaft,
            background = ColorPalette.Basic.WhiteSoapstone,
            onBackground = ColorPalette.Gray.RaisinBlack,
            surface = ColorPalette.Basic.WhiteSoapstone,
            onSurface = ColorPalette.Gray.RaisinBlack,
            surfaceVariant = ColorPalette.Orange.Champagne,
            onSurfaceVariant = ColorPalette.Orange.CapePalliser,
            inverseSurface = ColorPalette.Gray.RaisinBlack,
            inverseOnSurface = ColorPalette.Basic.WhiteSoapstone,
            error = ColorPalette.Red.MexicanRed,
            onError = ColorPalette.Basic.WhiteSoapstone,
            errorContainer = ColorPalette.Red.CornflowerLilac,
            onErrorContainer = ColorPalette.Red.DarkChocolate,
            outline = ColorPalette.Gray.DimGray,
            success = ColorPalette.Green.FernGreen,
            onSuccess = ColorPalette.Basic.WhiteSoapstone,
            warning = ColorPalette.Red.DarkTan,
            onWarning = ColorPalette.Basic.WhiteSoapstone,
            information = ColorPalette.Blue.Royal,
            onInformation = ColorPalette.Gray.Silver,
            surfaceTint = ColorPalette.Red.Tosca,
        )
 
    val Dark get() = Scheme(
        primary = ColorPalette.Red.ChestnutRose,
        onPrimary = ColorPalette.Basic.WhiteSoapstone,
        primaryContainer = ColorPalette.Red.LightCoral,
        onPrimaryContainer = ColorPalette.Gray.MineShaft,
        inversePrimary = ColorPalette.Red.ChestnutRose,
        secondary = ColorPalette.Red.ChestnutRose,
        onSecondary = ColorPalette.Gray.Dove,
        secondaryContainer = ColorPalette.Red.CrownOfThrones,
        onSecondaryContainer = ColorPalette.Red.DelRio,
        tertiary = ColorPalette.Orange.Rajah,
        onTertiary = ColorPalette.Gray.MineShaft,
        tertiaryContainer = ColorPalette.Orange.DiSerria,
        onTertiaryContainer = ColorPalette.Gray.RaisinBlack,
        background = ColorPalette.Gray.MineShaft,
        onBackground = ColorPalette.Gray.Mercury,
        surface = ColorPalette.Gray.Dove,
        onSurface = ColorPalette.Gray.Mercury,
        surfaceVariant = ColorPalette.Orange.CapePalliser,
        onSurfaceVariant = ColorPalette.Orange.Champagne,
        inverseSurface = ColorPalette.Gray.Mercury,
        inverseOnSurface = ColorPalette.Gray.Dove,
        error = ColorPalette.Red.ChestnutRose,
        onError = ColorPalette.Gray.Mercury,
        errorContainer = ColorPalette.Red.CornflowerLilac,
        onErrorContainer = ColorPalette.Red.Ferra,
        outline = ColorPalette.Gray.Silver,
        success = ColorPalette.Green.Coriander,
        onSuccess = ColorPalette.Gray.RaisinBlack,
        warning = ColorPalette.Red.NewYorkPink,
        onWarning = ColorPalette.Gray.RaisinBlack,
        information = ColorPalette.Blue.VistaBlue,
        onInformation = ColorPalette.Gray.DimGray,
        surfaceTint = ColorPalette.Red.ChestnutRose
    )
    
    class Scheme(
        val primary: Color,
        val onPrimary: Color,
        val primaryContainer: Color,
        val onPrimaryContainer: Color,
        val inversePrimary: Color,
        val secondary: Color,
        val onSecondary: Color,
        val secondaryContainer: Color,
        val onSecondaryContainer: Color,
        val tertiary: Color,
        val onTertiary: Color,
        val tertiaryContainer: Color,
        val onTertiaryContainer: Color,
        val background: Color,
        val onBackground: Color,
        val surface: Color,
        val onSurface: Color,
        val surfaceVariant: Color,
        val onSurfaceVariant: Color,
        val surfaceTint: Color,
        val inverseSurface: Color,
        val inverseOnSurface: Color,
        val error: Color,
        val onError: Color,
        val errorContainer: Color,
        val onErrorContainer: Color,
        val outline: Color,
        val success: Color,
        val onSuccess: Color,
        val warning: Color,
        val onWarning: Color,
        val information: Color,
        val onInformation: Color,
    )
    
    fun Scheme.toMaterial() = ColorScheme(
        primary = primary,
        onPrimary = onPrimary,
        primaryContainer = primaryContainer,
        onPrimaryContainer = onPrimaryContainer,
        inversePrimary = inversePrimary,
        secondary = secondary,
        onSecondary = onSecondary,
        secondaryContainer = secondaryContainer,
        onSecondaryContainer = onSecondaryContainer,
        tertiary = tertiary,
        onTertiary = onTertiary,
        tertiaryContainer = tertiaryContainer,
        onTertiaryContainer = onTertiaryContainer,
        background = background,
        onBackground = onBackground,
        surface = surface,
        onSurface = onSurface,
        surfaceVariant = surfaceVariant,
        onSurfaceVariant = onSurfaceVariant,
        surfaceTint = surfaceTint,
        inverseSurface = inverseSurface,
        inverseOnSurface = inverseOnSurface,
        error = error,
        onError = onError,
        errorContainer = errorContainer,
        onErrorContainer = onErrorContainer,
        outline = outline,
    )
}