package tk.sekol.spring.samples.injection;

import java.util.Map;

/**
 * @author kolesnikov
 */
public class OneManBand implements Performer {

    //Collection<Instrument> instruments;

    //public void setInstruments(Collection<Instrument> instruments) {
    //    this.instruments = instruments;
    //}

    Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    private Object nullProperty;

    public Object getNullProperty() {
        return nullProperty;
    }

    public void setNullProperty(Object nullProperty) {
        this.nullProperty = nullProperty;
    }

    @Override
    public void perform() {
        System.out.println("One man band");
        for (Map.Entry<String, Instrument> entry: instruments.entrySet()) {
            System.out.println("Instrument: " + entry.getKey());
            entry.getValue().play();
        }
    }
}
