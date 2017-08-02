package driver_management;
import behaviours.*;

public class Dodgem implements Driveable{

  int averageSpeed;
  int numberOfSeats;

  public Dodgem(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int driveTime(int distance){
    return distance/this.averageSpeed;
  }
}