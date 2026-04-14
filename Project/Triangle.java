public class Triangle extends Shape implements Drawable{
    private double side1;
    private double side2;
    private double side3;
    private double base;
    private double height;


    public Triangle(double side1, double side3, double side2, double base, double height){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }
    public double getBase() { return base; }
    public double getHeight() { return height; }

    public double setSide1() { this.side1 = side1; }
    public double setSide2() { this.side2 = side2; }
    public double setSide3() { this.side3 = side3; }
    public double setBase() { this.base = base; }
    public double setHeight() { this.height = height; }


    @override
    public void draw(){
        system.out.println("Drawing a triangle");
    }

    
    @override
    public double area(){
        return base * height * 0.5;
    }

    @override
    public double premiter(){
        return side1 + side2 + side3;
    }
}