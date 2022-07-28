package com.splanes.apps.taskflow.ui.common.theme.typo

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import com.splanes.apps.taskflow.ui.R.font as Fonts

/*
 * Created on 13/07/2022 at 19:26
 * @author Sergi Planes
 * @since 1.0.0
 */

object AppFonts {
    val AmaticSC by lazy {
        FontFamily(
            Font(Fonts.amatic_sc_bold, FontWeight.Bold)
        )
    }
    val MangoSticky by lazy {
        FontFamily(
            Font(Fonts.mango_sticky, FontWeight.Light),
            Font(Fonts.mango_sticky, FontWeight.Normal),
            Font(Fonts.mango_sticky, FontWeight.Medium),
            Font(Fonts.mango_sticky, FontWeight.Bold)
        )
    }
    val BentonSansCondensed by lazy {
        FontFamily(
            Font(Fonts.benton_sans_condensed_regular, FontWeight.Light),
            Font(Fonts.benton_sans_condensed_regular, FontWeight.Normal),
            Font(Fonts.benton_sans_condensed_medium, FontWeight.Medium),
            Font(Fonts.benton_sans_condensed_bold, FontWeight.Bold)
        )
    }
    val ApercuPro by lazy {
        FontFamily(
            Font(Fonts.apercu_pro_light, FontWeight.Light),
            Font(Fonts.apercu_pro_regular, FontWeight.Normal),
            Font(Fonts.apercu_pro_medium, FontWeight.Medium),
            Font(Fonts.apercu_pro_bold, FontWeight.Bold)
        )
    }
}
