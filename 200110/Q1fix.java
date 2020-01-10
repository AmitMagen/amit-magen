import jeliot.io.*;
//Amit Magen Q1 fix
public class Elevator {
    public static void main() {
		
		for (int i = 1; i<=5; i++){
			int people = Input.readInt(); //Number of people
			int num; //Number of times the elevator needs to fuction
			if (people % 8 != 0){
				num = people/8 + 1;
				System.out.println("The elevator will function " + num + " times");
			}//if
			else{
				num = people/8;
				System.out.println("The elevator will function " + num + " times");
			}//else			
			
		}//for

    }//main
}//Class Elevator