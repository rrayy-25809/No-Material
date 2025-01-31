plugins {
    java
}

group = "com.rrayy"
version = "1.0"
description = "자원 수집을 막는 플러그인"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21)) // Java 21 사용
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") // Spigot API
    maven("https://oss.sonatype.org/content/repositories/snapshots/") // BungeeCord Chat API
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.21-R0.1-SNAPSHOT") // Spigot API
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}