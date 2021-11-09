plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  mavenCentral()
}

dependencies {
  api("org.unbroken-dome.helm:org.unbroken-dome.helm.gradle.plugin:1.6.1")
  api("org.unbroken-dome.helm-publish:org.unbroken-dome.helm-publish.gradle.plugin:1.6.1")
}
