package com.splanes.apps.taskflow.ui.feature.user.signin

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.splanes.apps.taskflow.ui.common.screen.themeContent
import dagger.hilt.android.AndroidEntryPoint

/*
 * Created on 26/07/2022 at 20:40
 * @author Sergi Planes
 * @since 1.0.0
 */

@AndroidEntryPoint
class SignInScreen : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        themeContent {
            SignInComponent()
        }
    }
}
