plugins {
    `android-lib`
    `android-base`
    id("kotlin-parcelize")
}

android {
    namespace = "com.splanes.apps.taskflow.ui"
    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.1.1" }
}

dependencies {
    
    implementation(project(":app:domain"))
    
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.0")
    implementation("androidx.activity:activity-compose:1.5.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.0")
    
    implementation("androidx.compose.ui:ui:1.1.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.1")
    implementation("androidx.compose.material:material:1.1.1")
    implementation("androidx.compose.material3:material3:1.0.0-alpha14")
    implementation("androidx.compose.material:material-icons-extended:1.3.0-alpha01")
    implementation("androidx.navigation:navigation-compose:2.5.0")
    implementation("com.google.accompanist:accompanist-navigation-animation:0.24.2-alpha")
    implementation("com.google.accompanist:accompanist-pager:0.24.7-alpha")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.24.1-alpha")
    
    
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.1.1")
    debugImplementation("androidx.compose.ui:ui-tooling:1.1.1")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.1.1")
}
