package tk.sekol.spring.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.sekol.spring.samples.injection.PoeticJuggler;

/**
 * @author kolesnikov
 */
public class InjectionSamplesStarter {
    public static void main(String[] agrs) {
        injection();
    }

    private static void injection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config-injection.xml");

        //for (int i = 0; i< 11; i++) {
        //    Performer juggler = (Performer) context.getBean("juggler");
        //    juggler.perform();
        //    System.out.println(juggler.toString());       //bean is singleton
        //}


        //Performer poeticJuggler = context.getBean(PoeticJuggler.class);
        //poeticJuggler.perform();


        //Stage stage = context.getBean(Stage.class);

        //for (int i = 0; i < 11; i++) {
        //    Ticket ticket = context.getBean(Ticket.class);
        //    System.out.println(ticket);                      //each time new object
        //}

        //Auditorium auditorium = context.getBean(Auditorium.class);

        //Instrumentalist instrumentalist = context.getBean(Instrumentalist.class);
        //instrumentalist.perform();
        //Piano piano = context.getBean(Piano.class);
        //piano.play();

        //OneManBand oneManBand = context.getBean(OneManBand.class);
        //oneManBand.perform();

        //Instrumentalist imitator = (Instrumentalist) context.getBean("imitator");
        //imitator.perform();

        //Instrumentalist singer = (Instrumentalist) context.getBean("singer");
        //singer.perform();

        //Circle circle = (Circle) context.getBean("circle");
        //System.out.println(circle.getR());
        //System.out.println(circle.area());

        //Instrumentalist firstPianist = (Instrumentalist) context.getBean("firstPianist");
        //Instrumentalist secondPianist = (Instrumentalist) context.getBean("secondPianist");
        //Instrumentalist thirdPianist = (Instrumentalist) context.getBean("thirdPianist");
        //firstPianist.perform();
        //System.out.println("\n -- \n");
        //secondPianist.perform();
        //System.out.println("\n -- \n");
        //thirdPianist.perform();

        //Vocalist vocalist = (Vocalist) context.getBean("vocalist");
        //Instrumentalist singingGuitarist = (Instrumentalist) context.getBean("singingGuitarist");
        //vocalist.perform();
        //System.out.println("\n -- \n");
        //singingGuitarist.perform();

        //Magician magician = (Magician) context.getBean("magician");
        //magician.perform();

        //doesn`t work now
        //SpringConfigurable configurable = new SpringConfigurable();
        //System.out.println("Text = " + configurable.getText());

        //doesn`t work now
        //Contact contact = (Contact) context.getBean("newContact");
        //System.out.println(contact);

        //CustomDataSource dataSource = (CustomDataSource) context.getBean("dataSource");
        //System.out.println(dataSource);

        //Postman postman = (Postman) context.getBean("postman");
        //System.out.println(postman.toString());

        //autowiring start

        //autowire by name: name of injected bean same with property name
        //Instrumentalist instrumentalist2 = (Instrumentalist) context.getBean("instrumentalist2");
        //instrumentalist2.perform();

        //autowire by type: used autowire-candidate=false for all non-autowired beans
        //Instrumentalist instrumentalist3 = (Instrumentalist) context.getBean("instrumentalist3");
        //instrumentalist3.perform();

        //autowire by constructor
        PoeticJuggler poeticJuggler1 = (PoeticJuggler) context.getBean("poeticJuggler1");
        poeticJuggler1.perform();

        //autowiring end

        //annotations autowiring start



        //annotations autowiring end
    }
}
