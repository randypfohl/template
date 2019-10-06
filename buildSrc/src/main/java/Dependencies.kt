object Config {
    const val applicationId = "com.pfohl.template"
}

object Modules {
    const val app = ":app"
}

object Versions {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val buildToolsVersion = "29.0.2"
    const val kotlin = "1.3.50"
    const val kotlinCoroutines = "1.3.2"
    const val koin = "2.0.1"
    const val playCore = "1.6.2"
    const val ktx = "1.0.1"
    const val androidxFragment = "1.1.0"
    const val activityKtx = "1.0.0"
    const val navigation = "2.1.0"
    const val lifecycleKtx = "2.1.0"
    const val espresso = "3.1.0"
    const val junit = "4.12"
    const val mockito = "3.1.0"
    const val mockitoKotlin = "2.2.0"
    const val constraintLayoutX = "2.0.0-beta2"
    const val fragmentTest = "1.1.0"
    const val glide = "4.10.0"
    const val preference = "1.1.0"
    const val paging = "2.1.0"
    const val shimmer = "0.4.0"
    const val coroutine = "1.3.50"
    const val exifinterface = "1.0.0"
    const val uiAutomator = "2.2.0"
}

object Kotlin {
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
}

object ArchComponents {
    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtx}"
    const val androidxFragment = "androidx.fragment:fragment:${Versions.androidxFragment}"
    val coreKtx = "androidx.core:core-ktx:${Versions.ktx}"

    val navFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    val lifecycle = "androidx.lifecycle:lifecycle-*:${Versions.lifecycleKtx}"

    val extTesting = "androidx.test.ext:junit:1.1.0"
    val testOrchestrator = "androidx.test:orchestrator:1.1.1"
    val uiAutomator = "androidx.test.uiautomator:uiautomator:${Versions.uiAutomator}"

    val preference = "androidx.preference:preference-ktx:${Versions.preference}"
}

object Koin {
    val core = "org.koin:koin-core:${Versions.koin}"
    val test = "org.koin:koin-test:${Versions.koin}"
    val android = "org.koin:koin-android:${Versions.koin}"
    val androidXViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
}

object Play {
    val core = "com.google.android.play:core:${Versions.playCore}"
}

object Deps {
    val constraintLayoutX = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutX}"
    val junit = "junit:junit:${Versions.junit}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
}

object Espresso {
    val intents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
    val contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    val core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val web = "androidx.test.espresso:espresso-web:${Versions.espresso}"
    val idlingResource = "androidx.test.espresso:espresso-idling-resource:${Versions.espresso}"
}

object Mockito {
    val core = "org.mockito:mockito-core:${Versions.mockito}"
    val android = "org.mockito:mockito-android:${Versions.mockito}"
    val kotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutine}"
}

object Testing {
    val fragmentTesting = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"
}

object Paging {
    const val paging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
}

object Shimmer {
    const val shimmer = "com.facebook.shimmer:shimmer:${Versions.shimmer}"
}

object Exifinterface {
    const val exifInterface = "androidx.exifinterface:exifinterface:${Versions.exifinterface}"
}
