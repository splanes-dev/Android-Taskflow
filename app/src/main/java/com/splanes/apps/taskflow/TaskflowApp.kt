package com.splanes.apps.taskflow

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/*
 * Created on 26/07/2022 at 20:31
 * @author Sergi Planes
 * @since 1.0.0
 */

@HiltAndroidApp
class TaskflowApp : Application() {
    
    override fun onCreate() {
        super.onCreate()
        
        Timber.plant(Timber.DebugTree())
    }
}
