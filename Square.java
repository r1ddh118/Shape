// Square.java

class Square extends Shape {
    public Square(double length) { 
        super(length, 0, 0);
    }
    
    public double getArea() {
        return dim_one * dim_one;
    }
    
    public double getPerimeter() {
        return 4 * dim_one;
    }
    
    public double getVolume() {
        return 0;
    }
}

