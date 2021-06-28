import java.net.URI

plugins {
    kotlin("jvm") version "1.5.20"
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
}

repositories {
    mavenCentral()
    maven {
        url = URI("https://jitpack.io")
    }
}

kotlin {
    explicitApi()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
    testImplementation("io.strikt:strikt-core:0.31.0") {
        exclude(group = "org.jetbrains.kotlin")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "be.delta.flow"
            artifactId = "time-extension"
            version = "1.0.0"

            from(components["java"])
        }
    }
}