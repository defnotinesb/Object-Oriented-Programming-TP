public class Circle implements Drawable extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius= radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    @override
    public double area(){
        return MATH.PI * radius * radius;
    }

    @override
    public double premiter(){
        return MATH.PI * 2 * radius;
    }

    @override
    public void draw(){
        system.out.println("Drawing a circle");
    }

}