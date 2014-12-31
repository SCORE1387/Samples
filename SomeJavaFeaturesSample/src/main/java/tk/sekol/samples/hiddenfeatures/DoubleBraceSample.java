package tk.sekol.samples.hiddenfeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kolesnikov
 */
public class DoubleBraceSample {

    // see www.c2.com/cgi/wiki?DoubleBraceInitialization
    public static void main(String[] agrs) {
        Collection<String> collection = new ArrayList<String>(){{
            add("one");
            add("two");
            add("three");
        }};

        Map<String, String> map = new HashMap<String, String>(){{
            put("key1", "value1");
            put("key2", "value2");
            put("key3", "value3");
        }};
    }

}
