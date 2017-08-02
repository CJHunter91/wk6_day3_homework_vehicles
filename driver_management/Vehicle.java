package driver_management;
import behaviours.*;

public abstract class Vehicle implements Driveable{

  int averageSpeed;

  public Vehicle(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int driveTime(int distance){
    return distance/this.averageSpeed;
  }

}