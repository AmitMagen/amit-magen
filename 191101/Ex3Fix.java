ex 3 section 1:
number of stations     output
2                         10
4                         20
8                         48

2*5=10
4*5=20
4*5 + 4*7 =20 +28 =48

ex 3 section 2:
import jeliot.io.*;
//Amit Magen's Ex1 fixed program
public class MyClass {
public static void main() {
//Attributes
int p; //תשלום כולל
int s; //מספר תחנות
s = Input.nextInt();
//Conditions
if(s==4){
p=4*5;
System.out.println("התשלום הוא: " + p);
}
if(s<4){
p=s*5;
System.out.println("התשלום הוא: " + p);
}
if(s>4){
p=(4*5)+((s-4)*7);
System.out.println("התשלום הוא: " + p);
}
}
}