package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Stage {
    private Stage(){}

    private static Stage instance;

    public static Stage getInstance() {
        if (instance == null) {
            instance = new Stage();
        }
        return instance;
    }
}
