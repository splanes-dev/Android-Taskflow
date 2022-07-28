plugins {
    `android-app`
    `android-base`
    //id("com.google.gms.google-services")
}

android {
    namespace = "com.splanes.apps.taskflow"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures { compose = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.1.1" }
}

dependencies {
    implementation(project(":app:data"))
    implementation(project(":app:domain"))
    implementation(project(":app:ui"))
}
