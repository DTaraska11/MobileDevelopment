import java.lang.Math;
public class Triangle extends Shape {
    private String name;
    int side1;
    int side2;
    int side3;
    public Triangle(String name){
        super(name);
    }

    public String getName(){
        return name;
    }
    @Override
    public double getArea(){
        int perimeter = (side1+side2+side3)/2
        return Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
    }

    @Override
    public void printDimensions(){
        System.out.println("side1: "+side1);
        System.out.println("side2: "+side2);
        System.out.println("side3: "+side3);
    }

    public void setDimensions(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3; 
    }
}