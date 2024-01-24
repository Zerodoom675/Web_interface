plugins {
    id("java")
}

group "ru.netology"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Test> {
    systemProperty("file.encoding", "UTF-8")
}


dependencies {
    testImplementation ("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation ("org.seleniumhq.selenium:selenium-java:4.11.0")
    testImplementation ("io.github.bonigarcia:webdrivermanager:5.4.1")
}

tasks.test {
    useJUnitPlatform()
}