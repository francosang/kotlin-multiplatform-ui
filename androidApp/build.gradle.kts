plugins {

    /**
     * Use `apply false` in the top-level build.gradle file to add a Gradle
     * plugin as a build dependency but not apply it to the current (root)
     * project. Don't use `apply false` in sub-projects. For more information,
     * see Applying external plugins with same version to subprojects.
     */

    // id("com.android.application") version "8.4.0" apply false
    alias(libs.plugins.android.app) // apply false
    alias(libs.plugins.android.lib) apply false
    alias(libs.plugins.kotlin.android) apply false
}

android {
    namespace = "com.example.myapp"

    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.myapp"

        minSdk = 21

        targetSdk = 33

        versionCode = 1
        versionName = "1.0"
    }



}