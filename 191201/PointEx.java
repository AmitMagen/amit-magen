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

public class MyPoint {
    public static void main() {
   
    int x;
    int y;
   
    System.out.println("Enter 2 values:");
    x = Input.readInt();
    y = Input.readInt();
   
    Point P1 = new Point(x, y);
   
    System.out.println("The point is: (" + P1.getX() + ", " + P1.getY() + ")");
   

   
    }//main class
}//Class MyPoint
