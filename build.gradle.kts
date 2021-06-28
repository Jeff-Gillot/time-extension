plugins {
    kotlin("jvm") version "1.5.20"
    `maven-publish`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    withSourcesJar()
}

repositories {
    mavenCentral()
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
            version = "0.1"

            from(components["java"])
        }
    }
}