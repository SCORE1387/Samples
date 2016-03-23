package tk.sekol.spring.samples.data.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kolesnikov
 */
public class Starter {

    public static void main(String[] agrs) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config-jdbc-template.xml");

        System.out.println("SimpleJdbcTemplateSample:");
        SimpleJdbcTemplateSample simpleJdbcTemplateSample = (SimpleJdbcTemplateSample) context.getBean("jdbcTemplateSample");
        System.out.println(simpleJdbcTemplateSample.test());

        System.out.println("DaoSupporttJdbcTemplateSample:");
        DaoSupporttJdbcTemplateSample daoSupporttJdbcTemplateSample = (DaoSupporttJdbcTemplateSample) context.getBean("daoSupportJdbcTemplateSample");
        System.out.println(daoSupporttJdbcTemplateSample.test());

    }

}
