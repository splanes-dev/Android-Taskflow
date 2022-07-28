@file:Suppress("UnstableApiUsage")

val appName: String by settings

pluginManagement {
    val androidVersion: String by settings
    val kotlinVersion: String by settings
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version androidVersion
        id("com.android.library") version androidVersion
        id("org.jetbrains.kotlin.android") version kotlinVersion
        id("org.jetbrains.kotlin.kapt") version kotlinVersion
        //id("com.google.gms.google-services")
        id("dagger.hilt.android.plugin")
        id("kotlin-parcelize")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = appName
include(
    ":app",
    ":app:data",
    ":app:domain",
    ":app:ui",
)
