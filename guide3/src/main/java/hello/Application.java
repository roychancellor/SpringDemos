package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Running this as a Maven build will cause Spring to start a Tomcat server
 * and run the application at localhost:8080
 * HOW TO:
 * 1. Right click on the project
 * 2. Select Run As... and Maven build...
 * 3. In the Goals box type spring-boot:run
 * 4. Click Run
 * 5. When Maven compiles / builds and Spring Boot starts, 
 * navigate to http://localhost:8080/
 * 
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}