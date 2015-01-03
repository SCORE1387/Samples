package tk.sekol.samples.patterns.adapter;

import java.io.*;

/**
 * @author kolesnikov
 */
public class JavaSample1 {

    public static void main(String[] agrs) throws IOException {

        InputStream inputStream = new FileInputStream("d:\\11\\11.txt");
        Reader reader = new InputStreamReader(inputStream);

        int data = reader.read();
        while (data != -1) {
            char theChar = (char) data;
            System.out.print(theChar);
            data = reader.read();
        }

        reader.close();
    }

}
