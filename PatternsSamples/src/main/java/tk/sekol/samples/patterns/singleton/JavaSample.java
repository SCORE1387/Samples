package tk.sekol.samples.patterns.singleton;

import java.awt.*;

/**
 * @author kolesnikov
 */
public class JavaSample {

    public static void main(String[] agrs) {
        Runtime runtime = Runtime.getRuntime();
        runtime.totalMemory();
        //do smth.

        EnumSingleton.INSTANCE.doSmth();

        Desktop desktop = Desktop.getDesktop();
        //do smth.
    }

}
