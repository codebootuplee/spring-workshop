dependencies {
    api(project(":api"))
    api("org.springframework:spring-web")
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("org.apache.httpcomponents.client5:httpclient5")
}