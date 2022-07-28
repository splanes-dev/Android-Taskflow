package com.splanes.apps.taskflow.ui.common.theme.color

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/*
 * Created on 28/07/2022 at 0:36
 * @author Sergi Planes
 * @since 1.0.0
 */

sealed class ColorToken(open val color: @Composable (Boolean) -> Color) {
 object Primary : ColorToken(color = { ColorPrimary })
 object OnPrimary : ColorToken(color = { ColorOnPrimary })
 object PrimaryContainer : ColorToken(color = { ColorPrimaryContainer })
 object OnPrimaryContainer : ColorToken(color = { ColorOnPrimaryContainer })
 object InversePrimary : ColorToken(color = { ColorInversePrimary })
 object Secondary : ColorToken(color = { ColorSecondary })
 object OnSecondary : ColorToken(color = { ColorOnSecondary })
 object SecondaryContainer : ColorToken(color = { ColorSecondaryContainer })
 object OnSecondaryContainer : ColorToken(color = { ColorOnSecondaryContainer })
 object Tertiary : ColorToken(color = { ColorTertiary })
 object OnTertiary : ColorToken(color = { ColorOnTertiary })
 object TertiaryContainer : ColorToken(color = { ColorTertiaryContainer })
 object OnTertiaryContainer : ColorToken(color = { ColorOnTertiaryContainer })
 object Background : ColorToken(color = { ColorBackground })
 object OnBackground : ColorToken(color = { ColorOnBackground })
 object Surface : ColorToken(color = { ColorSurface })
 object OnSurface : ColorToken(color = { ColorOnSurface })
 object SurfaceVariant : ColorToken(color = { ColorSurfaceVariant })
 object OnSurfaceVariant : ColorToken(color = { ColorOnSurfaceVariant })
 object InverseSurface : ColorToken(color = { ColorInverseSurface })
 object InverseOnSurface : ColorToken(color = { ColorInverseOnSurface })
 object Error : ColorToken(color = { ColorError })
 object OnError : ColorToken(color = { ColorOnError })
 object ErrorContainer : ColorToken(color = { ColorErrorContainer })
 object OnErrorContainer : ColorToken(color = { ColorOnErrorContainer })
 object Outline : ColorToken(color = { ColorOutline })
 object SurfaceTint : ColorToken(color = { ColorSurfaceTint })
 object Success : ColorToken(color = { ColorSuccess })
 object OnSuccess : ColorToken(color = { ColorOnSuccess })
 object Warning : ColorToken(color = { ColorWarning })
 object OnWarning : ColorToken(color = { ColorOnWarning })
 object Information : ColorToken(color = { ColorInformation })
 object OnInformation : ColorToken(color = { ColorOnInformation })
 data class Custom internal constructor(override val color: @Composable (Boolean) -> Color) : ColorToken(color)
 companion object
}
