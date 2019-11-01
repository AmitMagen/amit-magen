import jeliot.io.*;
//amit magen ex2 fixed program
public class MyClass {
public static void main() {

//Attributes
double s;//מהירות שיגור תקינה
double sensor;//הדגרת משתנה למהירות הטיל
double a; //הגדרת משתנה לכמות החמצן
sensor = Input.nextDouble();
s = 1500;
//Conditions
if ((sensor== s+0.5)||(sensor == s-0.5)){
System.out.println("The speed is proper");
} 
else{
if((sensor< s+0.5)||(sensor < s-0.5)){
System.out.println("The current speed is " + sensor + " . More oxygen is needed to increase the speed. Must add " + (s-sensor) + " meters per minute.");
}
if((sensor>s+0.5)||(sensor>s-0.5)){ 
a = 2*(sensor-s);
System.out.println("The current speed is " + sensor + " . Less oxygen is needed to decrease the speed. Must reduce " + (sensor-s) + " meters per minute. Must reduce the oxygen amount by " + a + " Liters.");
} 
}

}//public static void main
}//MyClass