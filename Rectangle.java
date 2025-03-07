// Rectangle.java

class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 0);
    }
    
    public double getArea() {
        return dim_one * dim_two;
    }
    
    public double getPerimeter() {
        return 2 * (dim_one + dim_two);
    }
    
    public double getVolume() {
        return 0;
    }
}

