//Cylinder.java

class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(radius, height , 0);
    }
    
    public double getVolume() {
        return 3.14 * dim_one * dim_one * dim_two;
    }
    
    public double getArea() {
        return (2 * 3.14 * dim_one * dim_two) + (2 * 3.14 * dim_one * dim_one);
    }
    
    public double getPerimeter() {
        return 0;
    }
}
