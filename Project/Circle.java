public class Circle extends Shape implements Drawable  {
    private double radius;

    public Circle(double radius){
        this.radius= radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double primeter(){
        return Math.PI * 2 * radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

}