package tk.sekol.spring.samples.injection;

import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author kolesnikov
 */
@Configurable("configurable")
public class SpringConfigurable {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
