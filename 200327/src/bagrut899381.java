import java.util.*;
//Amit Magen
public class A {
    //Attributes
    private int n1;
    private int n2;

    //Default Constructor
    public A() {
        n1 = 0;
        n2 = 0;
    }

    //Constructor
    public A (int n1, int n2) {
        this();
        this.setN1(n1);
        this.setN2(n2);
    }

    //Setters & Getters
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN1() {
        return this.n1;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN2() {
        return this.n2;
    }

    //Methods
    public String toString() {
        int result = getN1() + getN2();
        String string = getN1()+"+"+getN2()+"="+result;
        return string;
    }//toString
    public void add() {
        int k = Input.readInt();
        n1 = n1 + k;
        n2 = n2 + k;
    }//add

}//A
public class Java2016SummerQ2{
    public static void main() {
        int n1 = Input.readInt();
        int n2 = Input.readInt();
        A a = new A(n1, n2);
        System.out.println(a.toString());
        a.add();
        System.out.println(a.toString());
    }//main
}//Java2016SummerQ2