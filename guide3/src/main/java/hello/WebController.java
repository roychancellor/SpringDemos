package hello;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Controller
public class WebController implements WebMvcConfigurer {

    /*
     * Spring view controller for the result.html page
     */
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    /*
     * URL mapping only requires / after the localhost:8080
     * Shows the form.html page
     */
	@GetMapping("/")
    public String showForm(PersonForm personForm) {
        return "form";
    }

    /*
     * Method for when the form data is HTTP POSTed
     * The @Valid annotation states that personForm has validated fields
     * bindingResult contains the results of Spring's error checking
     * on the form fields
     */
	@PostMapping("/")
    public String checkPersonInfo(@Valid PersonForm personForm, BindingResult bindingResult) {

		//If the form had errors, go back to the form so the user can make corrections
        if (bindingResult.hasErrors()) {
            return "form";
        }

        //If the form has no errors, simply show the results.html page
        return "redirect:/results";
    }
}