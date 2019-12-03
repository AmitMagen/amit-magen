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

public class MySquare {
    public static void main() {
   
    int x;
    int y;
    int x2;
    int y2;
   
    System.out.println("Enter 4 values of points that are not on the same line:");
    x = Input.readInt();
    y = Input.readInt();
    x2 = Input.readInt();
    y2 = Input.readInt();
   int length;
   int width;

   
    Point P1 = new Point(x, y);
    Point P2 = new Point(x2, y2);
      if (P1.getX()> P2.getX()){
     width = P1.getX()- P2.getX();
     }
     else{
         if (P1.getX()<P2.getX()){
         width = P2.getX()- P1.getX();
         }
     }
           if (P1.getY()> P2.getY()){
     length = P1.getX()- P2.getX();
        }
     else{
         if (P1.getY()<P2.getY()){
         length = P2.getY()- P1.getY();
          }
     }
     if (width> length){
     int i;
    i = length;
    length = width;
    width = i;
    }
   if (length != width){
   System.out.println("The width is " + width);
   System.out.println("The length is " + length);
   }
    System.out.println("The P is: " + 2*(width+length) );
    System.out.println("The S is: " +  width*length);
   

   
    }//main class
}//Class MySquare
