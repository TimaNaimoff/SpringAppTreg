package edu.springapp.configs;

import edu.springapp.models.Cat;
import edu.springapp.models.Dog;
import edu.springapp.models.Person;
import org.springframework.context.annotation.*;

import java.beans.BeanProperty;

@Configuration
//@ComponentScan("edu.springapp.models")
@PropertySource("classpath:application.properties ")
public class SpringConfig {

    @Bean
    @Scope("singleton")
    public Cat catBean(){
    System.out.println("!!!");
        return new Cat();
    }
    @Bean
    public Dog getDogBean(){
        return new Dog();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
