package tk.sekol.spring.samples.injection;

/**
 * @author kolesnikov
 */
public class Circle implements Figure {

    private double r;
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return getArea();
    }
}
