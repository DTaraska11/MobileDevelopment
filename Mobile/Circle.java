public class Circle extends Shape {
    private String name;
    int radius
    public Circle(String name){
        super(name);
    }

    public String getName(){
        return name;
    }
    @Override
    public double getArea(){
        return 3.14*(radius*radius);
    }

    @Override
    public void printDimensions(){
        System.out.println("radius: " + radius);
    }

    public void setDimensions(int radius){
        this.radius = radius;
    }
}