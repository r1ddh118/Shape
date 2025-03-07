# Shape
Overview

This project is a menu-driven Java application that calculates the area, perimeter, and volume of different geometric shapes. The program uses object-oriented programming (OOP) concepts such as abstraction, inheritance, and polymorphism to define shape classes and their properties. Users can input dimensions and get calculated results dynamically.

Functionalities

Supports 2D and 3D shape calculations

Uses inheritance: Abstract class Shape is extended by specific shape classes

Implements a menu-driven interface for user interaction

Uses Java Scanner class to take user inputs

Calculates area, perimeter, and volume based on shape properties

Files and Class Descriptions

1. Shape.java

An abstract class that serves as the base for all shapes.

Defines three protected attributes: dim_one, dim_two, and dim_three.

Contains three abstract methods:

getArea(): Returns the area of the shape.

getPerimeter(): Returns the perimeter (for 2D shapes) or 0 (for 3D shapes).

getVolume(): Returns the volume (for 3D shapes) or 0 (for 2D shapes).

2. Rectangle.java

Extends Shape.

Represents a rectangle with length (dim_one) and width (dim_two).

Implements:

getArea() = length × width

getPerimeter() = 2 × (length + width)

getVolume() = 0 (Since it's a 2D shape)

3. Circle.java

Extends Shape.

Represents a circle with radius (dim_one).

Implements:

getArea() = π × radius²

getPerimeter() = 2 × π × radius (Circumference)

getVolume() = 0 (Since it's a 2D shape)

4. Square.java

Extends Shape.

Represents a square with side length (dim_one).

Implements:

getArea() = side²

getPerimeter() = 4 × side

getVolume() = 0 (Since it's a 2D shape)

5. Sphere.java

Extends Shape.

Represents a sphere with radius (dim_one).

Implements:

getArea() = 4 × π × radius² (Surface Area)

getVolume() = (4/3) × π × radius³

getPerimeter() = 0 (Not applicable for spheres)

6. Cylinder.java

Extends Shape.

Represents a cylinder with radius (dim_one) and height (dim_two).

Implements:

getArea() = (2 × π × radius × height) + (2 × π × radius²) (Surface Area)

getVolume() = π × radius² × height

getPerimeter() = 0 (Not applicable for cylinders)

7. Pyramid.java

Extends Shape.

Represents a square-based pyramid with base length (dim_one), height (dim_two), and slant height (dim_three).

Implements:

getArea() = (base²) + (2 × base × slant height)

getVolume() = (1/3) × base² × height

getPerimeter() = 4 × base (Perimeter of square base)

8. Main.java (Menu Driver Program)

Handles user input and provides an interactive menu.

Allows selection of different shapes, prompting users to enter required dimensions.

Calls the appropriate shape class and displays computed results.

Loops until the user chooses to exit (option 7).
