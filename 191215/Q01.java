


import jeliot.io.*;
//amit magen
public class Q01 {
    public static void main() {
   
    final int NUMBER_OF_PEOPLE_AT_START = Input.readInt();
    int people = NUMBER_OF_PEOPLE_AT_START;
    int elevator = 0;
   
   
    while (people > 6){
    elevator ++;
    people = people -6;
   }
   
   elevator ++;

System.out.println ("the min number of times the elevator went up for" + NUMBER_OF_PEOPLE_AT_START + "is" + elevator);
   
     
   
       
    }
}
