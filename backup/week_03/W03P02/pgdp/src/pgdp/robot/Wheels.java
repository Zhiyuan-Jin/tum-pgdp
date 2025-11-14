package pgdp.robot;

import static pgdp.PinguLib.write;

//TODO: Implement the class according to the UML on Artemis.
public class Wheels {

    //TODO 1.0: Implement the constructor and set the attributes.

    //TODO 1.1: Implement the methods 'steer' and 'drive'.
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Wheels(int speed) {
        this.speed = speed;
    }
    public void drive(int distance){
        System.out.println("Der Pinguroboter fährt " + distance + " m.");
    }
    public void steer(int direction) {
        System.out.println("Der Pinguroboter richtet sich auf " + direction + " Grad aus.");

    }
}
