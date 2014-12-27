package tk.sekol.spring.samples.injection
/**
 * @author kolesnikov
 */
class GroovyLetter implements Letter {
    @Override
    String getContent() {
        return "Groovy letter"
    }
}
