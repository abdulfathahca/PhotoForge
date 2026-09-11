plugins {
    id("com.android.application")
}
android {
    namespace = "com.photoforge.app"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.photoforge.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }
    buildTypes {
        release { isMinifyEnabled = false }
    }
}
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
}
