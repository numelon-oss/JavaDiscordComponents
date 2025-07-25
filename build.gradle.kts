/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.7/samples
 */

plugins {
  kotlin("jvm") version "1.9.23"
  /* Build a fat jar which contains all the required dependencies. This prevents those stupid annoying errors when you import the library and try to use absolutely anything from it and it says "not found" or some stupid thing */
  id("com.github.johnrengelman.shadow") version "8.1.1"
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(21))
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("com.google.code.gson:gson:2.10.1")
}