import jeliot.io.*;
import java.util.*;
import java.lang.Math.*;
//Amit Magen

public class Train{
	//Attributes
	trainname=Input.nextString();
	int numpassengers;
	boolean isExp;
	//Constructor
	public train (boolean isExp , int numpassengers , string trainname){
		this.isExp = isExp
		this.numpassengers = numpassengers;
		this.trainname = trainname;
		
	//setters and getters
	public void setISEXP(boolean isExp) {
		this.isExp = isExp;
	}
	public boolean getISEXP(){
		return this.isExp;
	}
	public  void setNUMOFPASSENGERS(int numofpassengers){
		this.numpassengers = numpassengers;
	}
	public int NUMPASSENGERS(){
		return this.numpassengers;
	}
	public void set TRAINNAME (stringname) {
		this.trainname = trainname;
	}
	public string getTRAINNAME(){
		return this.trainname;
	}

public class ex2{
	public static void main (String[] args{
		int numpassengers;
		boolean isExp;
		string trainname;
		numpassengers= Input.readInt();
		isExp = Input.readBoolean();
		trainname =InputnextString();
		Train train = new Train (isExp,numpassengers,trainname);
	}
}//class ex 2 end