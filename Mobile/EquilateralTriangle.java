
public class EquilateralTriangle extends Triangle {
    private String name;
    int side;

    public EquilateralTriangle(String name){
        super(name);
    }

    public String getName(){
        return name;
    }
    @Override
    public double getArea(){
        int perimeter = (side+side+side)/2
        return Math.sqrt(perimeter*(perimeter-side)*(perimeter-side)*(perimeter-side));
    }

    @Override
    public void printDimensions(){
        System.out.println("side: "+side);
    }
    
    @Override
    public void setDimensions(int side){
        this.side = side;
    }
}
