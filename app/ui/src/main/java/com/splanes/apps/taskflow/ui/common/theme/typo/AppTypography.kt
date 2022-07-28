package com.splanes.apps.taskflow.ui.common.theme.typo

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

/*
 * Created on 13/07/2022 at 19:28
 * @author Sergi Planes
 * @since 1.0.0
 */

object AppTypography {
    val DisplayLarge: TextStyle =
        DisplayLargeM3.copy(fontFamily = AppFonts.MangoSticky)
    val DisplayMedium: TextStyle =
        DisplayMediumM3.copy(fontFamily = AppFonts.MangoSticky)
    val DisplaySmall: TextStyle =
        DisplaySmallM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Light)
    val HeadlineLarge: TextStyle =
        HeadlineLargeM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Light)
    val HeadlineMedium: TextStyle =
        HeadlineMediumM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Medium)
    val HeadlineSmall: TextStyle =
        HeadlineSmallM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Normal)
    val TitleLarge: TextStyle =
        TitleLargeM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Normal)
    val TitleMedium: TextStyle =
        TitleMediumM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Normal)
    val TitleSmall: TextStyle =
        TitleSmallM3.copy(fontFamily = AppFonts.BentonSansCondensed, fontWeight = FontWeight.Medium)
    val BodyLarge: TextStyle =
        BodyLargeM3.copy(fontFamily = AppFonts.BentonSansCondensed, fontWeight = FontWeight.Normal)
    val BodyMedium: TextStyle =
        BodyMediumM3.copy(fontFamily = AppFonts.BentonSansCondensed, fontWeight = FontWeight.Normal)
    val BodySmall: TextStyle =
        BodySmallM3.copy(fontFamily = AppFonts.BentonSansCondensed, fontWeight = FontWeight.Normal)
    val LabelLarge: TextStyle =
        LabelLargeM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Normal)
    val LabelMedium: TextStyle =
        LabelMediumM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Normal)
    val LabelSmall: TextStyle =
        LabelSmallM3.copy(fontFamily = AppFonts.ApercuPro, fontWeight = FontWeight.Normal)

    fun model() = androidx.compose.material3.Typography(
        displayLarge = DisplayLarge,
        displayMedium = DisplayMedium,
        displaySmall = DisplaySmall,
        headlineLarge = HeadlineLarge,
        headlineMedium = HeadlineMedium,
        headlineSmall = HeadlineSmall,
        titleLarge = TitleLarge,
        titleMedium = TitleMedium,
        titleSmall = TitleSmall,
        bodyLarge = BodyLarge,
        bodyMedium = BodyMedium,
        bodySmall = BodySmall,
        labelLarge = LabelLarge,
        labelMedium = LabelMedium,
        labelSmall = LabelSmall,
    )
}
