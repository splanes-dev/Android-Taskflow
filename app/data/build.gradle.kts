plugins {
    `android-lib`
    `android-base`
    id("kotlin-parcelize")
    //id("com.google.gms.google-services")
}

android {
    namespace = "com.splanes.apps.taskflow.data"
}

dependencies {
    implementation(project(":app:domain"))
    
    //api(platform("com.google.firebase:firebase-bom:29.2.1"))
    //api("com.google.firebase:firebase-auth-ktx")
    //api("com.google.firebase:firebase-database-ktx")
    implementation("com.google.code.gson:gson:2.9.0")
}
