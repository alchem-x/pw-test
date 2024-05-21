plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.microsoft.playwright:playwright:1.44.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")
}

tasks.named<Test>("test") {
    workingDir = rootDir
    useJUnitPlatform()
}
