package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Auditorium {
    public Auditorium() {}

    public void turnOnLight(){
        System.out.println("light on");
    }

    public void turnOffLight(){
        System.out.println("light off");
    }
}
