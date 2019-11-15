



import jeliot.io.*;
public class CellPhone {

    // Constants
    final double DEFAULT_VOLUME = 16.0;
    final double MIN_VOLUME = -10.0;
    final double MAX_VOLUME  = 35.0;
    final int MIN_SCREEN_BRIGHTNESS = 1;
    final int  MIN_SCREEN_BRIGHTNESS = 10;
   
    // Attributes
    private boolean active = false; // this.active
    private double volume = 0.0; // this.volume
    private int screenBrightness = 1; // 1-10
   
    // Constructors
   
    // Default Constructor
    public CellPhone () {
        this.setActive(false);
        this.setVolume(DEFAULT_VOLUME); // Default volume
        this.setScreenBrightness(5);
    } // CellPhone
   
    public CellPhone( double defaultVolume ){
        this(); // Activate the default constructor
        this.setVolume(defaultVolume);
    }
   
    public CellPhone( double defaultVolume, int defaultScreenBrightness) {
        this( defaultVolume ); // Activate constructor with volume
        this.setScreenBrightness( defaultScreenBrightness);
    }
   
    // Setters & Getters
    public void setVolume( double volume ) {
        if (volume>=MIN_VOLUME && volume<=MAX_VOLUME) {
            this.volume = volume;
        }
    }
    public double getVolume() {
        return this.volume;
    }
    public void setActive( boolean active) {
        this.active = active;
    }
    public boolean getActive() {
        return this.active;
    }
    public void setScreenBrightness(int ScreenBrightness) {
        if (screenBrightness>=MIN_ SCREEN_BRIGHTNESS && screenBrightness <= MAX_SCREEN_BRIGHTNESS) {
            this.screenBrightness = screenBrightness;
        }
    }
    public int getScreenBrightness() {
        return this.ScreenBrightness;
    }
   
    // Copy Constructor
   
    // Setters & Getters
    public void setVolume( double volume ) {
        if (volume>=MIN_VOLUME && temp<=MAX_VOLUME) {
            this.volume = volume;
        }
    }
    public double getVolume() {
        return this.volume;
    }
    public void setActive( boolean active) {
        this.active = active;
    }
    public boolean getActive() {
        return this.active;
    }
    public void setScreenBrightness(int screenBrightness) {
        if (screenBrightness>=MIN_SCREEN_BRIGHTNESS && screenBrightness <= MAX_SCREEN_BRIGHTNESS) {
            this.screenBrightness = screenBrightness;
        }
    }
    public int getScreenBrightness() {
        return this.screenBrightness;
    }
   
    // Methods
    public void turnOn() {
        this.setActive(true);
    }
    public void turnOff() {
        this.setActive(false);
    }
    public void switchActive() {
        if (this.getActive() == false ) {
            this.setActive(true);
        }
        else {
            this.setActive(false);
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
        cellPhone1.setTemp( 23.0 );
        cellPhone2.setTemp( 25.0 );
        cellPhone1.turnOff();
        cellPhone2.switchActive();
        statusCellPhone2 = cellPhone2.getActive();
        cellPhone2.switchActive();
        statusCellPhone2 = cellPhone2.getActive();
        double volume2 = cellPhone2.getVolume();
        cellPhone2.setVolume( volume2 + 3.0);
    }
}