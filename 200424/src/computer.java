public class computer {
    //Amit Magen
    //Attributes
    int memory;
    double speed;

    //Default Constructor
    public Computer(){

    }



    public computer(int memory,double speed) {
        this.memory = memory;
        this.speed =speed;
    }
    //setters & getters
    public int getMemory() {
        return memory;
    }

    public double getSpeed() {
        return speed;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    // checkMemory for loop
    public int checkMemory() {
        for( int i=0; i<=this.memory; i++) {
            System.out.println(i);
        }
        return this.memory;
    }
}
