
plugins {
    id("org.springframework.boot") version "3.3.4" apply false
    id("io.spring.dependency-management") version "1.1.6" apply false
}

group = "workshop.spring"
version = "0.0.1-SNAPSHOT"

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.springframework.boot")


    repositories {
        mavenCentral()
    }

    tasks {
        withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
            enabled = false
        }
    }
}

