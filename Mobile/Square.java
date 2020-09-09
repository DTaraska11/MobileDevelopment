public class Square extends Shape {
    private String name;
    int length;
    int height;
    public Square(String name){
        super(name);
    }

    public String getName(){
        return name;
    }
    @Override
    public double getArea(){
        return length*height;
    }

    @Override
    public void printDimensions(){
        System.out.println("length: "+length);
        System.out.println("height: "+height);
    }

    public void setDimensions(int length, int height){
        this.length = length;
        this.height = height;
    }
}
