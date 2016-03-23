package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class MagicBoxImpl implements MagicBox {
    @Override
    public String getContent() {
        return "Assistant";
    }
}
