plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  mavenCentral()
}

dependencies {
  api("org.unbroken-dome.helm:org.unbroken-dome.helm.gradle.plugin:1.7.0")
}
