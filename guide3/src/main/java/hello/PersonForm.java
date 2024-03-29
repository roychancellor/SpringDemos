package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is a regular Java object ("POJO"), a.k.a. Java bean
 * Anything with @ prefix is a Java annotation
 * for the javax.validation libraries
 */
public class PersonForm {

	/*
	 * The @ annotations are for the javax.validation library
	 * Otherwise, this is a POJO
	 */
    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}