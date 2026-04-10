public class Point {
    int x;
    int y;

    Point (int initialX, int initialY){
        x = initialX;
        y = initialY;
    }


    void display() {
        System.out.println("Point:("+x+","+y+")");
    }    

//exercice 2
    double calculateDistanceTo(Point other){
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


//main
    public static void main(String[] args){
        Point p1 = new Point(3,4);
        Point p2 = new Point(9,3);
        
        
        System.out.print("p1: ");
        p1.display();
        System.out.print("p2: ");
        p2.display();
        
        double distancetoself = p1.calculateDistanceTo(p1);
        double distancetop2 = p1.calculateDistanceTo(p2);

        System.out.println("Distance to self =" + distancetoself);
        System.out.println("Distace to (9,3) =" + distancetop2);
    }

}