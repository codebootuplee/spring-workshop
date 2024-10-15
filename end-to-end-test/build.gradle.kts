 dependencies{
     testImplementation("org.springframework.boot:spring-boot-starter-test")
     testImplementation(project(":server"))
     testImplementation(project(":client"))
 }

 tasks.withType<Test> {
     useJUnitPlatform()
 }