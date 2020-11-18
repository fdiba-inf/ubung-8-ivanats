package exercise8;

public class Point {
    public double x ;
    public double y ;
    
    public Point() {
        this.x = 0;
        this.y = 0;
         
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
    }

    public void initialize() {
      Scanner scanner = Utils.scanner;
      System.out.println("Enter coordinates for point:");
      System.out.println("x:");
      double x = Utils.scanner.nextDouble;
      System.out.println("y:");
      double y = Utils.scanner.nextDouble;
        this.x=x;
        this.y=y;

    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        return null;
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equality
        return false;
    }

    public String toString() {
        // Represent attributes as string
        return null;
    }
}
