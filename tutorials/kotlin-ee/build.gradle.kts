import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.0" apply (true)
    kotlin("plugin.spring") version "1.9.25" apply (true)
}

val jdk_version: String by project
val version: String by project
val group: String by project
val lombok_version: String by project
val slf4j_version: String by project
val logback_version: String by project
val mapstruct_version: String by project
val spring_boot_version: String by project
val hutool_version: String by project

// donot kown meanings
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

allprojects {
    apply(plugin = "java")
    apply(plugin = "idea")
    apply(plugin = "org.jetbrains.kotlin.jvm") // 版本信息在 plugins 中定义
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")

    group = group
    version = version

    // 指定kt编译使用的jdk版本
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = jdk_version
        }
    }

    repositories {
        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        mavenCentral()
    }

    dependencies {
        // lombok cannot be used by kotlin:
        // and this is workaround solution: https://levelup.gitconnected.com/kotlin-makes-lombok-obsolete-9ed3318596cb
        implementation("org.projectlombok:lombok:$lombok_version")

        implementation("org.slf4j:slf4j-api:${slf4j_version}")
        implementation("ch.qos.logback:logback-classic:${logback_version}")
        implementation("ch.qos.logback:logback-core:${logback_version}")
        implementation("cn.hutool:hutool-all:$hutool_version")

        // 这两个可能都没有用: https://stackoverflow.com/a/35530223/2621917
        annotationProcessor("org.projectlombok:lombok:${lombok_version}")
        annotationProcessor("org.mapstruct:mapstruct-processor:${mapstruct_version}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}


