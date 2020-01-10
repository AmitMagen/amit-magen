import jeliot.io.*;
//Amit Magen fix Q2
public class Train{
	//Attributes
	private String train;
	private int passengers;
	private boolean isExp;
	
	//Constructor
	public Train (String train , int passengers, boolean isExp){
		this.setTrain(train);
		this.setPassengers(passengers);
		this.setIsExp(isExp);
	}//Train constructor
	
	//setters and getters
	public void setIsExp(boolean isExp) {
		this.isExp = isExp;
	}
	public boolean getIsExp(){
		return this.isExp;
	}
	public void setPassengers(int passengers){
		this.passengers = passengers;
	}
	public int getPassengers(){
		return this.passengers;
	}
	public void setTrain (String name) {
		this.train = train;
	}
	public String getTrain(){
		return this.train;
	}
	
}//Train class
				
public class MyClass {
    public static void main(String[] args) {
		String train = "Rishon - Tel -Aviv";
		int passengers = 100;
		boolean isExp = true;
		Train train1 = new Train(train, passengers, isExp);
		train1.setPassengers(200);
		
    }//main
}//MyClass class