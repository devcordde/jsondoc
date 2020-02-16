plugins {
    java
    kotlin("jvm") version "1.3.61"
}

group = "me.schlaubi.jsondoc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":shared"))
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "12"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "12"
    }
}

configure<JavaPluginConvention> {
    targetCompatibility = JavaVersion.VERSION_13
}