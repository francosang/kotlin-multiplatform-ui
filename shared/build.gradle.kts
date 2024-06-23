plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget()
    jvm("desktop")

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.jfranco.shared"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}

//        commonMain.dependencies {
//            implementation(compose.runtime)
//            implementation(compose.foundation)
//            implementation(compose.material)
//            implementation(compose.components.resources)
//            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
//            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
//            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
//        }
//
//
//        androidMain.dependencies {
//            implementation("androidx.activity:activity-compose:1.8.2")
//            implementation("androidx.appcompat:appcompat:1.6.1")
//            implementation("androidx.core:core-ktx:1.12.0")
//            implementation("androidx.camera:camera-camera2:1.3.1")
//            implementation("androidx.camera:camera-lifecycle:1.3.1")
//            implementation("androidx.camera:camera-view:1.3.1")
//            implementation("com.google.accompanist:accompanist-permissions:0.29.2-rc")
//            implementation("com.google.android.gms:play-services-maps:18.2.0")
//            implementation("com.google.android.gms:play-services-location:21.1.0")
//            implementation("com.google.maps.android:maps-compose:2.11.2")
//        }

