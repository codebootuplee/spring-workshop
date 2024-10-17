# Guide to Set Up Java 21 and IntelliJ IDEA (Community Edition) on Windows and macOS

## 1. Setting up Java 21 (JDK 21)

### Windows

1. **Download JDK 21**:
    - Go to the official Oracle JDK download page: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
    - Download the JDK 21 installer for Windows.

2. **Install JDK 21**:
    - Run the installer and follow the installation steps.
    - By default, it installs to `C:\Program Files\Java\jdk-21`.

3. **Set Environment Variables**:
    - Right-click **This PC** or **My Computer**, select **Properties** > **Advanced system settings** > **Environment Variables**.
    - Edit the `Path` variable under **System Variables** and add:
      ```
      C:\Program Files\Java\jdk-21\bin
      ```

4. **Verify Installation**:
    - Open **Command Prompt** and run:
      ```bash
      java -version
      ```
    - The output should show Java 21 details.

### macOS

1. **Download JDK 21**:
    - Visit [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) and download the `.dmg` installer for macOS.

2. **Install JDK 21**:
    - Open the `.dmg` file and follow the installation prompts.

3. **Set Environment Variables** (Optional):
    - Open **Terminal** and edit your profile:
      ```bash
      nano ~/.zshrc  # For Zsh users
      nano ~/.bash_profile  # For Bash users
      ```
    - Add:
      ```bash
      export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home
      ```
    - Save and exit.

4. **Verify Installation**:
    - In **Terminal**, run:
      ```bash
      java -version
      ```
    - The output should show Java 21 details.

## 2. Installing IntelliJ IDEA Community Edition

### Windows

1. **Download IntelliJ IDEA**:
    - Visit [IntelliJ IDEA Downloads](https://www.jetbrains.com/idea/download/) and download the **Community Edition** installer for Windows.

2. **Install IntelliJ IDEA**:
    - Run the installer and follow the wizard. Create a desktop shortcut if you prefer.

3. **Launch IntelliJ IDEA**:
    - Open IntelliJ from the Start Menu or desktop shortcut.

4. **Set JDK 21**:
    - Go to **File** > **Project Structure** > **Project**, and set **Project SDK** to JDK 21.

### macOS

1. **Download IntelliJ IDEA**:
    - Visit [IntelliJ IDEA Downloads](https://www.jetbrains.com/idea/download/) and download the `.dmg` installer for macOS.

2. **Install IntelliJ IDEA**:
    - Drag IntelliJ IDEA into the **Applications** folder.

3. **Launch IntelliJ IDEA**:
    - Open **IntelliJ IDEA** from the **Applications** folder.

4. **Set JDK 21**:
    - Go to **File** > **Project Structure** > **Project**, and set **Project SDK** to JDK 21.

## 3. Verifying IntelliJ IDEA Setup with Java 21

1. **Create a New Project**:
    - Launch IntelliJ and create a new **Java** project, selecting JDK 21 as the SDK.

2. **Create a Sample Java Program**:
    - In the `src` folder, create a class `HelloWorld.java` with the following code:
      ```java
      public class HelloWorld {
          public static void main(String[] args) {
              System.out.println("Hello, Java 21!");
          }
      }
      ```

3. **Run the Program**:
    - Right-click the file and select **Run 'HelloWorld.main()'**. You should see:
      ```
      Hello, Java 21!
      ```

## 4. Cloning the `spring-workshop` GitHub Repository

### Windows & macOS

1. **Install Git**:
    - Download and install Git from [Git's official website](https://git-scm.com/downloads).
    - For macOS, you can use Homebrew:
      ```bash
      brew install git
      ```

2. **Clone the Repository via IntelliJ IDEA**:
    - Open IntelliJ IDEA and select **Get from VCS** from the Welcome screen (or **File** > **New** > **Project from Version Control**).
    - Enter the repository URL:
      ```
      https://github.com/codebootuplee/spring-workshop
      ```
    - Select a directory to clone the project.

3. **Clone the Repository**:
    - Click **Clone**, and IntelliJ will download the repository. When prompted, trust the project.

4. **Import Gradle Dependencies**:
    - The `spring-workshop` project uses **Gradle** for dependency management.
    - IntelliJ should automatically detect the `build.gradle` file and start importing Gradle dependencies.
    - If IntelliJ doesn't automatically import, right-click the `build.gradle` file and select **Import Gradle Project**.

5. **Set JDK 21 for the Project**:
    - Ensure JDK 21 is set for the project by going to **File** > **Project Structure** > **Project** and selecting JDK 21 as the SDK.

6. **Run the Project**:
    - Right-click the main Spring Boot application class and choose **Run**. IntelliJ will build the project using Gradle and launch the Spring Boot application.

## Conclusion

Now you're set up with Java 21, IntelliJ IDEA, and the `spring-workshop` project using Gradle. You're ready to start coding and exploring Spring Boot with Java 21!

# Common `gradlew` Commands for Java Projects

### 1. `./gradlew build`
- **Description**: Compiles the source code, runs tests, and packages the project into a JAR or WAR file.

### 2. `./gradlew clean`
- **Description**: Deletes the build directory, removing all the build outputs from the previous runs.

### 3. `./gradlew assemble`
- **Description**: Compiles the source code and creates the output artifacts (like JAR/WAR), but does not run the tests.

### 4. `./gradlew test`
- **Description**: Runs the unit tests in the project.

### 5. `./gradlew check`
- **Description**: Runs all quality checks like unit tests, static code analysis, and linting.

### 6. `./gradlew run`
- **Description**: Runs the project by executing the main class (requires the `application` plugin and a defined `mainClassName`).

### 7. `./gradlew dependencies`
- **Description**: Shows the list of dependencies that your project has, including their versions and transitive dependencies.

### 8. `./gradlew jar`
- **Description**: Compiles the project and packages the compiled code into a JAR file.

### 9. `./gradlew javadoc`
- **Description**: Generates the Javadoc for the project and places it in the `build/docs/javadoc` directory.

### 10. `./gradlew eclipse` / `./gradlew idea`
- **Description**: Generates project files for Eclipse or IntelliJ IDEA, respectively.

### 11. `./gradlew bootRun`
- **Description**: Runs a Spring Boot application (requires the `spring-boot` plugin).

### 12. `./gradlew bootJar`
- **Description**: Builds an executable JAR for a Spring Boot application, including all dependencies.

### 13. `./gradlew tasks`
- **Description**: Lists all the tasks available in the current project, including custom tasks defined in the build scripts.

### 14. `./gradlew --daemon`
- **Description**: Starts the Gradle Daemon to speed up subsequent builds.

### 15. `./gradlew --stop`
- **Description**: Stops any running Gradle Daemon processes.

### 16. `./gradlew init`
- **Description**: Initializes a new Gradle project with basic project files such as `build.gradle`.

### 17. `./gradlew wrapper`
- **Description**: Generates the Gradle Wrapper scripts (`gradlew` and `gradlew.bat`) for the project.

---

## Java Compilation Commands

### 18. `./gradlew compileJava`
- **Description**: Compiles the main source code of the project (`src/main/java`).

### 19. `./gradlew compileTestJava`
- **Description**: Compiles the test source code (`src/test/java`).

### 20. `./gradlew compileClasspath`
- **Description**: Resolves the dependencies needed for compiling the main source code.

### 21. `./gradlew compileTestClasspath`
- **Description**: Resolves the dependencies needed for compiling the test source code.

### 22. `./gradlew processResources`
- **Description**: Copies resources from `src/main/resources` to the build output directory.

### 23. `./gradlew processTestResources`
- **Description**: Copies resources from `src/test/resources` to the test output directory.

# Workshop: Implementing REST API Clients for Student and CourseModule Management

## Objective:
The goal of this workshop is to implement REST API clients for both **Student** and **CourseModule** management. Students will:
1. Implement the necessary code to pass the provided test cases for managing students.
2. Create and implement the API for managing course modules.
3. Write test cases to verify the correct behavior of both the student and course module operations.

## Prerequisites:
- Basic understanding of Java and RESTful APIs
- Familiarity with exception handling and test-driven development
- Knowledge of using `RestTemplate` or any HTTP client in Java
- IDE (e.g., IntelliJ) with JUnit set up for testing

---
# Workshop: Implementing Missing Tests for Student API and Creating CourseModule Pattern

## Objective

The goal of this workshop is threefold:
1. Implement the remaining test cases in the `StudentApiTest` class located in the `workshop.spring` package.
2. Create a similar pattern for the `CourseModule` entity, including developing the interface client and server implementations from scratch using the `StudentApi` as a guide.
3. Identify deficiencies and potential features in the program, then implement the identified deficiencies or features.

## Prerequisites

- Basic understanding of Java and Spring Boot.
- Familiarity with JUnit 5 and AssertJ for testing.
- Knowledge of RESTful APIs.

## Existing Test Cases Overview

Currently, the following test cases are implemented for the `StudentApiTest`:

1. **canGetEmptyListOfStudents**: Verifies that an empty list of students is returned when no students exist.
2. **canCreateStudent**: Tests the successful creation of a student.
3. **throws400WhenCreatingStudentAndNameIsNull**: Ensures that a `BAD_REQUEST` status is returned when trying to create a student with a null name.
4. **throws404WhenStudentDoesNotExist**: Confirms that a `NOT_FOUND` status is returned when trying to retrieve a student by an ID that does not exist.
5. **canGetStudentById**: This test is incomplete and needs to verify that a valid student can be retrieved by ID.
6. **canUpdateStudent**: This test is incomplete and needs to verify that a student can be updated.
7. **canDeleteStudent**: This test is incomplete and needs to verify that a student can be deleted.
8. **canAddModuleToStudent**: This test is incomplete and needs to verify that a module can be added to a student.
9. **canRemoveModuleFromStudent**: This test is incomplete and needs to verify that a module can be removed from a student.

## Tasks for StudentApiTest

You need to implement the following tests in the `StudentApiTest` class:

### 1. `canGetStudentById()`

- **Description**: This test should verify that when a student is created, it can be retrieved by their ID.
- **Steps**:
   - Create a student.
   - Retrieve the student by ID.
   - Assert that the retrieved student matches the created student.

### 2. `canUpdateStudent()`

- **Description**: This test should verify that an existing student can be updated.
- **Steps**:
   - Create a student.
   - Update the student's details.
   - Retrieve the updated student and assert that the details are correct.

### 3. `canDeleteStudent()`

- **Description**: This test should verify that an existing student can be deleted.
- **Steps**:
   - Create a student.
   - Delete the student by ID.
   - Assert that trying to retrieve the deleted student results in a `NOT_FOUND` status.

### 4. `canAddModuleToStudent()`

- **Description**: This test should verify that a module can be successfully added to a student.
- **Steps**:
   - Create a student and a module.
   - Add the module to the student.
   - Assert that the module was added correctly by retrieving the student's modules.

### 5. `canRemoveModuleFromStudent()`

- **Description**: This test should verify that a module can be successfully removed from a student.
- **Steps**:
   - Create a student and a module.
   - Add the module to the student.
   - Remove the module from the student.
   - Assert that the module was removed correctly.

## Tasks for CourseModule Implementation

You will also create a similar pattern for the `CourseModule` entity. This includes the following steps:

### 1. Define the `CourseModule` Entity

- Create a `CourseModule` class with the necessary properties (e.g., ID, name).

### 2. Develop the Client and Server Interfaces

- **Client Implementation**:
   - Create an interface for the `CourseModuleApi`.
   - Develop a REST client implementation (`CourseModuleApiRestClientImpl`) similar to `StudentApiRestClientImpl`.

- **Server Implementation**:
   - Create a REST controller for managing `CourseModule` instances.
   - Implement the service layer to handle business logic related to `CourseModule`.

### 3. Create Tests for CourseModule API

- Implement tests similar to those for the `StudentApiTest` for the `CourseModuleApi`. These should include:
   - Testing retrieval of a list of modules.
   - Testing creation, updating, and deletion of modules.
   - Testing adding and removing modules from students (if applicable).

## Task for Identifying and Implementing Deficiencies or Features

### 1. Identify Deficiencies and Features

- Review the current implementation of the Student API and the CourseModule entity.
- List a number of deficiencies (e.g., missing validations, error handling) and potential features (e.g., pagination, sorting, advanced querying) that could be added to improve the program.

### 2. Implement the Identified Deficiencies or Features

- Choose one or more deficiencies or features from your list.
- Implement the changes in the codebase.
- Update tests to cover the new functionality or validate the fixed deficiencies.

## Implementation Tips

- Use the existing methods and classes in the `workshop.spring` package to implement your tests and the `CourseModule` pattern.
- Refer to the `StudentApi` and its test cases as a guide for structure and implementation.
- Ensure that you are handling exceptions and edge cases appropriately.
- Utilize AssertJ assertions for clear and concise test validation.

## Submission

Once you have implemented all the test cases, the `CourseModule` pattern, and addressed deficiencies or features, run the test suite to ensure that all tests pass. Submit your completed `StudentApiTest` class, `CourseModule` implementations, a list of deficiencies/features, and any new helper methods you created.

## Conclusion

This workshop will help you gain hands-on experience with testing RESTful APIs in Spring Boot while also applying similar principles to a new entity. Additionally, identifying and implementing deficiencies or features will enhance your understanding of software development practices.

Good luck, and happy coding!

