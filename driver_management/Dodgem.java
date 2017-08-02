package driver_management;
import behaviours.*;

public class Dodgem implements Driveable{

  int averageSpeed;
  int numberOfSeats;

  public Dodgem(int averageSpeed){
    this.averageSpeed = averageSpeed;
    this.numberOfSeats = 3;
  }

  public int driveTime(int distance){
    return distance/this.averageSpeed;
  }

  public int getNumberOfSeats(){
    return this.numberOfSeats;
  }
}