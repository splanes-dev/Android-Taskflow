package com.splanes.apps.taskflow.ui.common.resources

import android.os.Parcelable

/*
 * Created on 28/07/2022 at 13:31
 * @author Sergi Planes
 * @since 1.0.0
 */

interface ValueOrRes<out T> : Parcelable {
    val value: T? get() = null
    val res: Int? get() = null
}

fun <T> ValueOrRes<T>.valueOrThrow(): T = value ?: throw NullPointerException()
fun <T> ValueOrRes<T>.resOrThrow(): Int = res ?: throw NullPointerException()
