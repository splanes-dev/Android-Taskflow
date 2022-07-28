package com.splanes.apps.taskflow.ui.common.resources

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import kotlinx.parcelize.Parcelize

/*
 * Created on 28/07/2022 at 1:09
 * @author Sergi Planes
 * @since 1.0.0
 */

@Parcelize
data class StringOrRes(
    override val value: String? = null,
    @StringRes override val res: Int? = null
) : ValueOrRes<String>

@Composable
inline fun text(str: () -> Int) = stringResource(id = str())
