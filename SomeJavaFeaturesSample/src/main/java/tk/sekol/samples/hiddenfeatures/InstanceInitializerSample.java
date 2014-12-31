package tk.sekol.samples.hiddenfeatures;

/**
 * @author kolesnikov
 */
public class InstanceInitializerSample {
    public InstanceInitializerSample() {
        System.out.println("constructor called");
    }

    static {
        System.out.println("static initializer called");
    }

    {
        System.out.println("instance initializer called");
    }
}