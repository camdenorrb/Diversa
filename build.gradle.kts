

plugins {
    kotlin("multiplatform") version "1.3.50"
}

group = "me.camdenorrb"
version = "1.0.0"


allprojects {
    repositories {
        mavenCentral()
    }
}


/*
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
*/