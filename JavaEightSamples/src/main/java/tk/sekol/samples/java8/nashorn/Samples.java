package tk.sekol.samples.java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author kolesnikov
 */
public class Samples {

    public static void main(String[] agrs) throws ScriptException {
        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("nashorn");

        engine.eval("function p(s) { print(s) }");
        engine.eval("p('Hello Nashorn');");
    }

}
