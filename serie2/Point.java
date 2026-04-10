public class Point {
    int x;
    int y;

    Point (int initialX, int initialY){
        x = initialX;
        y = initialY;
    }


    void moveTo(int newX, int newY){
        x = newX;
        y = newY;
    }

    void display() {
        System.out.println("Point:("+x+","+y+")");
    }    

//main
    public static void main(String[] args){
        Point p = new Point(3,5);
        p.display();
        p.moveTo(5,7);

        System.out.println("after moving to (5,7):");
        p.display();
    }

}