package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * HOW TO RUN: Right-click on the project --> Run As... --> Maven build...
 * In the Goals box type spring-boot:run, then click Run
 * After Maven and Spring Boot do their things, go to a web browser
 * and navigate to http://localhost:8080/greeting
 * You should see {"id":1,"content":"Hello, World!"} on the page that opens
 * You can change the message by adding /?name=new text after /greeting,
 * for example http://localhost:8080/greeting/?name=User results in
 * {"id":2,"content":"Hello, User!"}
 */

//This notation is a roll-up of three Spring annotations:
//@Configuration which tags the class as a source of Java beans
//@EnableAutoConfiguration tells Spring Boot to start adding beans
//@ComponentScan tells Spring how to find controllers
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //Launches the application
    	//NO web.xml file
    	//100% Java!!!
    	//Run from the command line or as an executable JAR
    	//Or you can build a WAR file
    	SpringApplication.run(Application.class, args);
    }
}