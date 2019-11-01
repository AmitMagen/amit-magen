import java.util.*;
import jeliot.io.*;
public class AmitClass {
	public static void main() {
	double a;
	double b;
	a = Input.nextDouble();
	b = Input.nextDouble();
	if ((a==0.5) || (b==-0.5)) {
		sensor ("The speed is proper");
	}
	int takeoffspeed;
	int takeoffspeed = Input.nextInt();
	if (takeoffspeed < 1500) {
		System.out.println ("need to add oxygen to boost the speed, 		current speed is 1400 you need to boost more 100 meters per 		min");
	}
	else {
		System.out.println("need to reduce the oxygen to slow down. 		current speed is 1520 need to reduce by 20 meters per min, 		and reduce the oxygen flow by 40 liters");
	}
}
	
	
	
