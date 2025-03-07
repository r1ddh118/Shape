//Circle.java

class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0, 0);
    }
    
    public double getArea() {
        return 3.14 * dim_one * dim_one;
    }
    
    public double getPerimeter() {
        return 2 * 3.14 * dim_one;
    }
    
    public double getVolume() {
        return 0;
    }
}
