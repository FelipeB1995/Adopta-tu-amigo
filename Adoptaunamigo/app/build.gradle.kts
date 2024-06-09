plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.google.gms.google-services") // Asegúrate de tener esta línea para el plugin de servicios de Google
}

android {
    namespace = "com.ibero.adoptaunamigo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ibero.adoptaunamigo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx) // Cambié la notación a la versión de AndroidX
    implementation(libs.androidx.appcompat) // Cambié la notación a la versión de AndroidX
    implementation(libs.material) // Cambié la notación a la versión de AndroidX
    implementation(libs.androidx.activity.ktx) // Cambié la notación a la versión de AndroidX
    implementation(libs.androidx.constraintlayout) // Cambié la notación a la versión de AndroidX
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.database)
    implementation(libs.androidx.activity) // Agregué la dependencia para Firebase Auth
    testImplementation(libs.junit) // Cambié la notación a la versión correcta
    androidTestImplementation(libs.androidx.junit) // Cambié la notación a la versión de AndroidX
    androidTestImplementation(libs.androidx.espresso.core) // Cambié la notación a la versión de AndroidX
    implementation(platform(libs.firebase.bom)) // Agregué la dependencia para el BOM de Firebase
    implementation(libs.firebase.analytics.ktx) // Agregué la dependencia para Firebase Analytics
    implementation(libs.google.services) // Agregué la dependencia para el plugin de servicios de Google
    implementation(libs.firebase.auth.ktx) // Agregué la dependencia para Firebase Auth
}
