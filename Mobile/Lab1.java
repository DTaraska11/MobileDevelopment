import java.util.Scanner;

public class Lab1 {

 public static void main(String[] args) {
    Shape shape = new Shape(shape);
    Square square = new Square(square);
    Circle circle = new Circle(circle);
    Triangle triangle = new Triangle(triangle);
    EquilateralTriangle ETriangle = new EquilateralTriangle(ETriangle);

    Scanner myObj = new Scanner(System.in);
    System.out.println("/n Length for square: ");
    int sLength= myObj.nextint();
    System.out.println("/n Height for square: ");
    int sHeight= myObj.nextInt();
    square.setDimensions(sLength, sHeight);

    
    System.out.println("/n Radius for circle: ");
    int radius = myObj.nextInt();
    circle.setDimensions(radius);

   
    System.out.println("/n Side1 for triangle: ");
    int side1= myObj.nextInt();
    System.out.println("/n Side2 for triangle: ");
    int side2= myObj.nextInt();
    System.out.println("/n Side3 for triangle: ");
    int side3= myObj.nextInt();
    triangle.setDimensions(side1, side2, side3);

    
    System.out.println("/n Side for equilateral triangle: ");
    int side= myObj.nextInt();
    ETriangle.setDimensions(side);

    square.printDimensions();
    circle.printDimensions();
    triangle.printDimensions();
    ETriangle.printDimensions();
    System.out.println(square.getArea());
    System.out.println(circle.getArea());
    System.out.println(triangle.getArea());
    System.out.println(ETriangle.getArea());
   
    
}
}
