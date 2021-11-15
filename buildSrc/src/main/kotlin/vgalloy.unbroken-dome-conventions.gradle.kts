plugins {
  id("org.unbroken-dome.helm")
}

helm {
  repositories {
    create("repo") {
      url("VALID_URL")
    }
  }
}

tasks.withType<org.unbrokendome.gradle.plugins.helm.command.tasks.AbstractHelmCommandTask> {
  logging.captureStandardOutput(LogLevel.INFO)
  logging.captureStandardError(LogLevel.INFO)
}
