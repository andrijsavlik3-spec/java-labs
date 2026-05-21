public class Pyramid extends Shape {
    private double s;
    private double h;
    
    public Pyramid(double s, double h) {
        super((1.0 / 3.0) * s * h);
        this.s = s;
        this.h = h;
    }
}