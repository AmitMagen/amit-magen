//Amit Magen
public class Point {

    //Attributes
    private double x, y;

    //Constructor
    public Point ( double x, double y ) {
        this.setX(x);
        this.setY(y);
    }

    //Setters & Getters
    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return this.x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return this.y;
    }
}//Point

public class Line {

    //Attributes
    private Point point1, point2;
    private double diameter;

    //Constrctor
    public Line (Point point1, Point point2) {
        this.setPoint1(point1);
        this.setPoint2(point2);
    }

    //Setters & Getters
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }
    public double getPoint1() {
        return this.point1;
    }
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    public double getPoint2() {
        return this.point2;
    }

    //Methods
    public double getDiameter() {
        double diffX = Math.pow(point1.getX()- point2.getX() ,2.0);
        double diffY = Math.pow(point1.getY()- point2.getY() ,2.0);
        diameter = Math.sqrt(diffX + diffY);
        return this.diameter;
    }
}//Line

public class Triangle {

    //Attributes
    private Point point1, point2, point3;
    private Line line1, line2, line3;
    private double perimeter, surface;

    //Constructor
    public Triangle (Point point1, Point point2, Point point3) {
        this.setPoint1(point1);
        this.setPoint2(point2);
        this.setPoint3(point3);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point2);
        Line line3 = new Line(point3, point1);
        this.setLine1(line1);
        this.setLine2(line2);
        this.setLine3(line3);
    }

    //Setters & Getters
    public void setLine1(Line line1) {
        this.line1 = line1;
    }
    public double getLine1() {
        return this.line1;
    }
    public void setLine2(Line line2) {
        this.line2 = line2;
    }
    public double getLine2() {
        return this.line2;
    }
    public void setLine3(Line line3) {
        this.line3 = line3;
    }
    public double getLine3() {
        return this.line3;
    }
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }
    public double getPoint1() {
        return this.point1;
    }
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    public double getPoint2() {
        return this.point2;
    }
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
    public double getPoint3() {
        return this.point3;
    }

    //Methods
    public double getPerimeter() {
        double diameter1 = line1.getDiameter();
        double diameter2 = line2.getDiameter();
        double diameter3 = line3.getDiameter();
        perimeter = diameter1 + diameter2 + diameter3;
        return this.perimeter;
    }
    public double getSurface() {
        double alpha = point1.getX()*(point2.getY() - point3.getY());
        double beta = point2.getX()*(point3.getY() - point1.getY());
        double gamma = point3.getX()*(point1.getY() - point2.getY());
        surface = (alpha + beta + gamma)/2.0;
        if (surface < 0.0){
            surface = surface * -1.0;
        }
        return this.surface;
    }
}//Triangle

public class MyClass {
    public static void main() {
        double x;
        double y;
        x = Input.readDouble();
        y = Input.readDouble();
        Point point1 = new Point(x, y);
        x = Input.readDouble();
        y = Input.readDouble();
        Point point2 = new Point(x, y);
        x = Input.readDouble();
        y = Input.readDouble();
        Point point3 = new Point(x, y);
        Triangle triangle1 = new Triangle(point 1, point2, point3);
        triangle1.getPerimeter();
        triangle1.getSurface();
        x = Input.readDouble();
        y = Input.readDouble();
    }
}//MyClass