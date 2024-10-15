 dependencies{
     testImplementation("org.springframework.boot:spring-boot-starter-test")
     testImplementation(project(":server"))
     testImplementation(project(":client"))
     testImplementation("org.assertj:assertj-core:3.24.2")
     testImplementation("org.springframework.boot:spring-boot-starter-data-jpa")
 }

 tasks.withType<Test> {
     useJUnitPlatform()
 }