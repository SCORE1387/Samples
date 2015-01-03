package tk.sekol.samples.patterns.adapter;

public class DevManager implements Manager{

    private Developer developer = new JavaDeveloper();

    @Override
    public void askForDevFeature(String description) {
        developer.createFeature(description);
    }

}
