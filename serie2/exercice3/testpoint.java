//this causes error
//x and y were not accessible because they are not tested inside their file

public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        
        // These lines will cause compilation errors because x and y are private
        System.out.println(p.x);
        System.out.println(p.y);
        
        p.display();
    }
}