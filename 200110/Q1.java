import jeliot.io.*;
import java.lang.Math.*;

public class Elevator {
    public static void main() {
        for (int days=1;days<=5;days++){ //int days sunday to thursday
        	int numofpeople = Input.readInt(); //int numberofpeople
        	if (numofpeople==8) {
        		System.out.println("elevator can go up");
        	}
        	else{
        		System.out.println("elevator needs to wait for more people");
        	}
        	else{
        		System.out.println("elevator cant go up because there are too many people");
        	}
		}//for
	}//main
}//class Elevator