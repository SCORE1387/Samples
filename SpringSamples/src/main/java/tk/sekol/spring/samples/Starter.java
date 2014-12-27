package tk.sekol.spring.samples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.sekol.spring.samples.injection.Postman;

/**
 * @author kolesnikov
 */
public class Starter {
    public static void main(String[] agrs) {
        injection();
    }

    private static void injection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");

        //for (int i = 0; i< 11; i++) {
        //    Performer juggler = context.getBean(Juggler.class);
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

        Postman postman = (Postman) context.getBean("postman");
        System.out.println(postman.toString());
    }
}
