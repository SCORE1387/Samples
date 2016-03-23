package tk.sekol.spring.samples.data.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kolesnikov
 */
public class Starter {

    public static void main(String[] agrs) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config-hibernate.xml");

        SpringHibernateRepositorySample repository = context.getBean(SpringHibernateRepositorySample.class);
        System.out.println(repository.getPersonById(3));

    }

}
