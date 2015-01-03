package tk.sekol.samples.patterns.chainofresponsibility;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kolesnikov
 */
public class JavaSample {

    public static void main(String[] agrs) {
        Logger logger = Logger.getLogger(JavaSample.class.getName());
        logger.log(Level.INFO, "Test");
    }

}
