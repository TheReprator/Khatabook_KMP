pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AccountBook"

include(":shared")
include(":app:android")
include(":app:desktop")
include(":app:ios-compose")
include(":app:web")
