package bean_practice;

import bean_practice.AppConfig;
import bean_practice.FullTimeEmployee;
import bean_practice.NewAppConfig;
import bean_practice.PartTimeEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        //hey spring, please create container based on my config class which is AppConfig.class
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, NewAppConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        bean_practice.PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);

        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();

        String str1 = container.getBean("Message 1",String.class);
        String str2 = container.getBean("str2",String.class);
        System.out.println(str1);
        System.out.println(str2);

    }
}
