package com.splanes.apps.taskflow.ui.common.theme.utils

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.splanes.apps.taskflow.ui.common.theme.typo.AppFonts
import com.splanes.apps.taskflow.ui.common.theme.typo.AppTypography

/*
 * Created on 13/07/2022 at 20:08
 * @author Sergi Planes
 * @since 1.0.0
 */

inline val DisplayLarge get() = AppTypography.DisplayLarge
inline val DisplayMedium get() = AppTypography.DisplayMedium
inline val DisplaySmall get() = AppTypography.DisplaySmall
inline val HeadlineLarge get() = AppTypography.HeadlineLarge
inline val HeadlineMedium get() = AppTypography.HeadlineMedium
inline val HeadlineSmall get() = AppTypography.HeadlineSmall
inline val TitleLarge get() = AppTypography.TitleLarge
inline val TitleMedium get() = AppTypography.TitleMedium
inline val TitleSmall get() = AppTypography.TitleSmall
inline val BodyLarge get() = AppTypography.BodyLarge
inline val BodyMedium get() = AppTypography.BodyMedium
inline val BodySmall get() = AppTypography.BodySmall
inline val LabelLarge get() = AppTypography.LabelLarge
inline val LabelMedium get() = AppTypography.LabelMedium
inline val LabelSmall get() = AppTypography.LabelSmall

operator fun TextUnit.plus(other: TextUnit): TextUnit = (value + other.value).sp
operator fun TextUnit.plus(value: Double): TextUnit = (this.value + value).sp
operator fun TextUnit.minus(other: TextUnit): TextUnit = (value - other.value).sp
operator fun TextUnit.minus(value: Double): TextUnit = (this.value - value).sp

fun TextStyle.bold() = copy(fontWeight = FontWeight.Bold)
fun TextStyle.medium() = copy(fontWeight = FontWeight.Medium)
fun TextStyle.normal() = copy(fontWeight = FontWeight.Normal)
fun TextStyle.light() = copy(fontWeight = FontWeight.Light)

fun TextStyle.size(size: TextUnit) = copy(fontSize = size)
fun TextStyle.size(size: Double) = copy(fontSize = size.sp)
fun TextStyle.sizeBy(size: TextUnit) = this + size
fun TextStyle.sizeBy(size: Double) = this + size.sp

inline fun fontStyle(font: AppFonts.() -> FontFamily) = AppFonts.font()
fun TextStyle.font(font: AppFonts.() -> FontFamily) = copy(fontFamily = fontStyle { font() })

operator fun TextStyle.plus(unit: TextUnit) = copy(fontSize = fontSize + unit)
operator fun TextStyle.minus(unit: TextUnit) = copy(fontSize = fontSize - unit)
