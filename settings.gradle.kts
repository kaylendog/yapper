include(
    "yapper-api",
    "yapper-core",
    "yapper-paper",
    "yapper-fabric"
)

// Fabric Repository Management
pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net") { name = "Fabric" }
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("fabric-loom").version(settings.extra["loom_version"] as String)
        kotlin("jvm").version(System.getProperty("kotlin_version"))
    }
}
