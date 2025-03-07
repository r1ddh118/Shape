// Sphere.java

class Sphere extends Shape {
    public Sphere(double radius) {
        super(radius, 0 , 0);
    }
    
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * dim_one * dim_one * dim_one;  
    }
    
    public double getArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }
    
    public double getPerimeter() {
        return 0;
    }
}

