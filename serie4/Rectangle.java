public class Rectangle extends Shape {

    private double height;
    private double width;
    
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(){
        this.width = width;
    }

    public void setHeight(){
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }

    @Override
    public double perimeter(){
        return (width + height) * 2;
    }
}