markdown
# Beststore Application

This is a demo project for Spring Boot.

## Prerequisites

- Java 17
- Maven
- Visual Studio Code (VS Code)

## Project Structure


beststore
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── boostmytool
    │   │           └── beststore
    │   │               ├── BeststoreApplication.java
    │   └── resources
    │       └── application.properties
    └── test
        └── java
            └── com
                └── boostmytool
                    └── beststore
                        └── BeststoreApplicationTests.java


## Setup

### Using Maven

1. **Navigate to the project directory:**

    sh
    cd path/to/your/project/beststore
    

2. **Build the project:**

    sh
    mvn clean install
    

3. **Run the Spring Boot application:**

    sh
    mvn spring-boot:run
    

### Using VS Code

1. **Open the Project in VS Code:**

    - Open VS Code.
    - Select `File` > `Open Folder...`.
    - Navigate to the directory where your project is located and open it.

2. **Ensure the Java Extension Pack is Installed:**

    - Go to the Extensions view by clicking on the Extensions icon in the Activity Bar on the side of the window.
    - Search for "Java Extension Pack" and install it if it’s not already installed.

3. **Ensure the Maven Extension is Installed:**

    - Go to the Extensions view and search for "Maven for Java" and install it.

4. **Build the Project:**

    - Open the terminal in VS Code by selecting `Terminal` > `New Terminal`.
    - Ensure you are in the project directory and run:

    sh
    mvn clean install
    

5. **Run the Spring Boot Application:**

    - In the terminal, run:

    sh
    mvn spring-boot:run
    

## Project Configuration

- **Java Version:** 17
- **Spring Boot Version:** 3.2.4

## Dependencies

- `spring-boot-starter-data-jpa`
- `spring-boot-starter-thymeleaf`
- `spring-boot-starter-validation`
- `spring-boot-starter-web`
- `spring-boot-devtools`
- `mysql-connector-j`
- `spring-boot-starter-test`
- `assertj-core`

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
