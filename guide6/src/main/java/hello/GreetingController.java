package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//A RestController is different from an MVC Controller in that a RestController
//returns a POJO (Greeting in this case) as a JSON object whereas the MVC Controller returns
//the name of a Java Server Page (JSP) which the web browser renders as a view
@RestController
public class GreetingController {

    //Message template that will become concrete in the greeting method below
	private static final String template = "Hello, %s!";
    
	//AtomicLong is a long variable that is thread-safe (meaning if multiple thread are running,
	//calls to AtomicLong class methods are isolated from other operations)
	//Refer to: https://www.techopedia.com/definition/3466/atomic-operation
	private final AtomicLong counter = new AtomicLong();

    //@RequestMapping maps HTTP requests to /greeting to the Java method greeting
    //which returns a new Greeting object
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        //returns a new Greeting object with the optional name parameter substituted
    	//for the %s in the template string (defaults to "World" if no parameter
    	//in the HTTP request)
    	return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}