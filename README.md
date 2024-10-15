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

4. **Import Maven Dependencies**:
    - IntelliJ should automatically import the Maven dependencies. If not, right-click the `pom.xml` file and select **Maven** > **Reload Project**.

5. **Set JDK 21 for the Project**:
    - Ensure JDK 21 is set for the project by going to **File** > **Project Structure** > **Project** and selecting JDK 21 as the SDK.

6. **Run the Project**:
    - Right-click the main Spring Boot application class and choose **Run**.

## Conclusion

Now you're set up with Java 21, IntelliJ IDEA, and the `spring-workshop` project. You're ready to start coding and exploring Spring Boot with Java 21!
