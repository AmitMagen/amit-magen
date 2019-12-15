import jeliot.io.*;

//Amit

public class Point {
    int x, y;
   
    public Point(int x, int y){
    this.x = x;
    this.y = y;
}//Point Constructor

    //Setters and Getters
   
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
   


} // Class Point


public class MyClass {
    public static void main() {
   
   
    
    int x = Input.readInt();
    int y = Input.readInt();
    Point P1 = new Point(x, y);
    
    x = Input.readInt();
    y = Input.readInt();
    Point P2 = new Point(x, y);
    
    x = Input.readInt();
    Point P3 = new Point(x, y);

    double line1 = Math.sqrt(((P1.getX()-P2.getX())^2)+((P1.getY()-P2.getY())^2));
    double line2 = Math.sqrt(((P1.getX()-P3.getX())^2)+((P1.getY()-P3.getY())^2));
    double line3 = Math.sqrt(((P2.getX()-P3.getX())^2)+((P2.getY()-P3.getY())^2));
    
    double p = line1 + line2 + line3;
    
    if (P1.getY> P2.getY){
    double s = (P1.getY() - P2.getY()) * line3;
    }
     if (P1.getY< P2.getY){
    double s = (P2.getY() - P1.getY()) * line3;
    }

    System.out.println("The p is " + p + " and the s is " + s);
    
    
    }//main class
}//Class MyClass   

