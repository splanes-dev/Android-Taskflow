plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven(url = "https://plugins.gradle.org/m2/")
}

dependencies {

    implementation("com.android.tools.build:gradle:7.3.0-beta04")
    implementation(kotlin("gradle-plugin", "1.6.10"))
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.40.5")
    //implementation("com.google.gms:google-services:4.3.13")
}
