public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double gatRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius * radius * Math.PI;
    }


    @Override
    public double perimeter(){
        return radius * 2 * Math.PI;
    }

    @Override 
    public void draw(){
        System.out.println("Drawing a circle");
    }
}