plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(Deps.ktorAndroid)
            implementation(Deps.sqlDelightAndroidDriver)
        }
        commonMain.dependencies {
            implementation(Deps.ktorCore)
            implementation(Deps.ktorSerialization)
            implementation(Deps.ktorSerializationJson)
            implementation(Deps.ktorCio)
            implementation(Deps.sqlDelightRuntime)
            implementation(Deps.sqlDelightCoroutinesExtensions)
            implementation(Deps.kotlinDateTime)
            implementation(Deps.media3)
            implementation(platform(Deps.supabase))
            implementation(Deps.supabasePostgrest)
            implementation(Deps.koinCore)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        iosMain.dependencies {
            implementation(Deps.ktorIOS)
            implementation(Deps.sqlDelightNativeDriver)
        }
    }
}

android {
    namespace = "com.mygomii.koin_viewmodel_sample"
    compileSdk = 34
    defaultConfig {
        minSdk = 29
    }
}
