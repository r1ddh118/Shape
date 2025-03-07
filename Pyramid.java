// Pyramid.java

class Pyramid extends Shape {
    public Pyramid(double length, double height, double sl_height) {
        super(length, height, sl_height);
    }
    
    public double getVolume() {
        return (1.0 / 3.0) * dim_one * dim_one * dim_two;  // Fixed integer division
    }
    
    public double getArea() {
        return (dim_one * dim_one) + (2 * dim_one * dim_three);
    }
    
    public double getPerimeter() {
        return 4 * dim_one;  // Perimeter of square base
    }
}

