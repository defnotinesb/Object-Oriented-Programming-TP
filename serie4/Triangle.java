public class Triangle extends Shape {
    double side1;
    double side2;
    double side3;
    double base;
    double height;

    public Triangle(double side1, double side2, double side3, double base, double height){
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

    public void setSide1(double side1) { this.side1 = side1; }
    public void setSide2(double side2) { this.side2 = side2; }
    public void setSide3(double side3) { this.side3 = side3; }
    public void setBase(double base) { this.base = base; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public double area(){
        return base * height;
    }

    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }

    @
}