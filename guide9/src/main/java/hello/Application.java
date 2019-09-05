package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * HOW TO RUN:
 * Right-click on the project --> Run As... --> Maven build...
 * In the Goals box type spring-boot:run, then click Run
 * After Maven and Spring Boot do their things, go to a web browser
 * and navigate to http://localhost:8080/home
 * You should see a welcome message on the page that opens
 * Click the "here" link and it will prompt you to log in
 * to see a message. The credentials are "user" and "password"
 * It should to to another page and say "Hello user!" with a button
 * to sign out
 */

//This notation is a roll-up of three Spring annotations:
//@Configuration which tags the class as a source of Java beans
//@EnableAutoConfiguration tells Spring Boot to start adding beans
//@ComponentScan tells Spring how to find controllers
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
        //Launches the application
    	//NO web.xml file
    	//100% Java!!!
    	//Run from the command line or as an executable JAR
    	//Or you can build a WAR file
    }

}