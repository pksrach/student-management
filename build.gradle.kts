plugins {
	java
	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"
}

group = "com.samrach"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	// Data JPA
	implementation ("org.springframework.boot:spring-boot-starter-data-jpa")

	// Dev tool
	developmentOnly ("org.springframework.boot:spring-boot-devtools")

	// Thymeleaf
	implementation ("org.springframework.boot:spring-boot-starter-thymeleaf")

	// Database
	runtimeOnly("org.postgresql:postgresql")

	// Web
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
