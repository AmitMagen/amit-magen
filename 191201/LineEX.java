import jeliot.io.*;

//Amit

public class Point {
    int x, y, x2, y2;
   
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

public class MyLine {
    public static void main() {
   
    int x;
    int y;
    int x2;
    int y2;
   
    System.out.println("Enter 2 values:");
    x = Input.readInt();
    y = Input.readInt();
    x2 = Input.readInt();
    y2 = Input.readInt();
   
    Point P1 = new Point(x, y);
    Point P2 = new Point(x2, y2);
   
    System.out.println("The line passes between: (" + P1.getX() + ", " + P1.getY() + ") and ("+ P2.getX() + ", " + P2.getY() + ")" );
   

   
    }//main class
}//Class MyLine
