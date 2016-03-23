package tk.sekol.spring.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kolesnikov
 */
public class AOPSamplesStarter {
    public static void main(String[] agrs) {
        injection();
    }

    private static void injection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config-aop.xml");

    }
}
