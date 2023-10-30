package homework_week8_jignaLoladia.cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
// This Cylinder class extends the Circle class and adds the height field. it has a constructor that initializes both radius (inherited from circle) and height field.
// it laso includes the getheight method to retrive the height and the getvolume method to calculate and return the volume of homework_week8_jignaLoladia.cylinder.
// also ensure height is not negative by setting to 0.
