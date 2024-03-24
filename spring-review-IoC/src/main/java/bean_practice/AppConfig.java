package bean_practice;

import bean_practice.FullTimeEmployee;
import bean_practice.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FullTimeEmployee fullTimeEmployee(){
        return new FullTimeEmployee();
    }

    @Bean
    public bean_practice.PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }

}
