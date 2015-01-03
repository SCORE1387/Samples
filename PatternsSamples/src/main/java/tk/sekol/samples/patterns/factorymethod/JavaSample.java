package tk.sekol.samples.patterns.factorymethod;

import java.util.Calendar;

/**
 * @author kolesnikov
 */
public class JavaSample {

    public static void main(String[] agrs) {
        Calendar calendar = Calendar.getInstance();
        //Charset charset = Charset.forName("Name");

        String a = "0";
        for (int i = 1; i < 1001; i++) {
            a += String.valueOf(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("1");
        sb.append("2");
    }

}
