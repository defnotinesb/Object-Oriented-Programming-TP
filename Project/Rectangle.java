public class Rectangle implements Drawable extends Shape{
    private double length;
    private double width;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    @override
    public double area(){
        return length * width;
    }

    @override
    public double premiter(){
        return (length + width)* 2;
    }

    @override
    public void draw(){
        system.out.println("Drawing a rectangle");
    }
}