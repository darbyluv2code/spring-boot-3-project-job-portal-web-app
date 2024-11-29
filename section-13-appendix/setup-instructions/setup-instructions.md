# Spring Boot 3 Project - Build a Job Portal Web Application
## Setup Instructions

To set up and build the job portal web application from the provided source code and SQL scripts, follow the step-by-step guide below. This will walk you through downloading the required software, setting up the database, and running the application.

### Step 1: Required Tools

1. **JDK 17 or Higher**  
   - Download and install JDK 17 or a higher version from [OpenJDK](https://adoptium.net/temurin/releases/).
   - Set up your `PATH` and `JAVA_HOME` environment variable to point to the JDK installation.

   To verify installation, run:
   ```bash
   java -version
   ```

2. **Install MySQL 8**  
   - Download MySQL 8 from [MySQL's official site](https://dev.mysql.com/downloads/mysql/).
   - Follow the installation steps for your operating system.

   After installing MySQL, make sure you create a root user password and enable the MySQL service.

   You can test your MySQL installation by running:
   ```bash
   mysql -u root -p
   ```

### Step 2: Set Up the Database

2. **Run the SQL Scripts**  
   - Download the SQL scripts from the [GitHub repository](https://github.com/darbyluv2code/spring-boot-3-project-job-portal-web-app/tree/main/00-starter-files/00-starter-sql-scripts).
   - Inside the downloaded SQL folder, there are several `.sql` files. You will need to run these scripts to set up the necessary tables and populate the data.

   - Open a terminal or MySQL Workbench (or any MySQL client of your choice) and run the scripts.

   For example, run:
   ```bash
   mysql -u root -p job_portal < 00-create-user.sql
   mysql -u root -p job_portal < 01-jobportal.sql
   ```

### Step 3: Configure Application Properties

1. **Clone the Source Code**  
   - Clone the application source code from the provided [GitHub repository](https://github.com/darbyluv2code/spring-boot-3-project-job-portal-web-app).

   Run the following command:
   ```bash
   git clone https://github.com/darbyluv2code/spring-boot-3-project-job-portal-web-app.git

   cd spring-boot-3-project-job-portal-web-app/section-12-global-search/01-global-search
   ```

2. **Configure `application.properties`**  
   - In the Spring Boot project, open the `application.properties` file located at `src/main/resources/application.properties`.
   - Review the default configs. If you used the provided database scripts, then no changes are required. 
   - However, if you changed the users then update the database connection details with your MySQL credentials:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
     spring.datasource.username=jobportal
     spring.datasource.password=jobportal
     ```

   - Ensure that the database URL, username, and password match your MySQL setup.

### Step 4: Build and Run the Application

1. **Build the Application**  

   - In the root directory of the cloned project, build the application using Maven:

     ```bash
     mvnw clean compile
     ```

2. **Run the Application**  
   - Once the build is successful, you can run the application using:

     ```bash
     mvnw spring-boot:run
     ```

   This will start the Spring Boot application on the default port `8080`. You can access the application by going to `http://localhost:8080` in your browser.

### Step 5: Verify the Application

1. **Access the Job Portal**  
   - After the application starts, you visit the main page of the job portal web application at `http://localhost:8080`.
   - Select the **Register** button and register a new user
   - Login with your new user
   - Test the functionality like searching for jobs, viewing job listings, and other features provided in the project.
   - For details of this testing, view the relevant videos in the course

2. **Database Verification**  
   - To verify that the database is correctly connected, you can check the MySQL `job_portal` database to see if data is being updated, or use logs in the application to troubleshoot any issues.

---

By following these steps, you will be able to build, set up, and run the job portal web application with Java 17, MySQL 8, and the provided source code and SQL scripts.

If you have questions or need tech support, post your questions to the [classroom discussion forum](https://www.udemy.com/course/spring-boot-project-job-portal-web-app/learn/v4/questions).