package tk.sekol.samples.hiddenfeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kolesnikov
 */
public class PatternMatcherSample {

    public static void main(String[] agrs) {
        ClientMessage message = new ClientMessage("A ${aaa aa} sdfg: ${bbb} sdf sd ${aaa aa}", "1", "2");
        System.out.println(message);
    }

    public static class ClientMessage {
        private static final Pattern pattern = Pattern.compile("\\$\\{([^}]+)\\}"); //${text}

        private String messageTemplate;
        private Map<String, String> params = new HashMap<>();

        public String getMessageTemplate() {
            return messageTemplate;
        }

        public Map<String, String> getParams() {
            return params;
        }

        public ClientMessage(String messageTemplate, String... paramVOs) {
            this.messageTemplate = messageTemplate;
            Matcher matcher = pattern.matcher(messageTemplate);

            int uniqueGroupsFound= 0;
            while (matcher.find()) {
                String paramName = matcher.group(1);
                if (!params.containsKey(paramName)) {
                    params.put(paramName, paramVOs[uniqueGroupsFound]);
                    uniqueGroupsFound++;
                }
            }
        }

        @Override
        public String toString() {
            return "ClientMessage{" +
                "messageTemplate='" + messageTemplate + '\'' +
                ", params=" + params +
                '}';
        }
    }

}
