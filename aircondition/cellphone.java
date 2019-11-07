import jeliot.io.*;

public class CellPhone {
    // Attributes
    private boolean active; // this.active
    private double volume; // this.volume
    
    // Constructor 
    
    // Default Constructor 
    public CellPhone() {
        this.active = false;
        this.volume = 20.0; // Default volume
    }
    
    // Setters & Getters
    public void setvolume( double volume ) {
        this.volume = volume;
    }
    public double getvolume() {
        return this.temp;
    }
    public void setActive( boolean active) {
        this.active = active;
    }
    public boolean getActive() {
        return this.active;
    }
    
    // Methods
    public void turnOn() {
        this.active = true;
      }
      public void turnOff() {
          this.active = false;
      }
    public void switchActive() {
        if (this.active == false ) {
            this.active = true;
        }
        else {
            this.active = false;
        }
    }
} // CellPhone

public class MyClass {

    public static void main() {
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        boolean statusCellPhone2;

        cellPhone1.turnOn();
        cellPhone2.turnOn();
        cellPhone1.setVolume( 23.0 );
        cellPhone2.setVolume( 25.0 );
        cellPhone1.turnOff();
        cellPhone2.switchActive();
        statusCellPhone2 = cellPhone2.getActive();
        cellPhone2.switchActive();
        statusCellPhone2 = cellPhone2.getActive();
        double volume2 = cellPhone2.getVolume();
        cellPhone2.setVolume( volume2 + 3.0);
    }
}