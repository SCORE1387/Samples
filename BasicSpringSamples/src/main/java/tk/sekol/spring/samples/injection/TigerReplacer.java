package tk.sekol.spring.samples.injection;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author kolesnikov
 */
public class TigerReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return "Tiger";
    }
}
