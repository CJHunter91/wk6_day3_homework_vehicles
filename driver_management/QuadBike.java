package driver_management;
import behaviours.*;
public class QuadBike implements Driveable{

  private int averageSpeed;
  private String engineSize;

  public QuadBike(int averageSpeed){
    this.averageSpeed = averageSpeed;
    this.engineSize = "100 cc";
  }

  public int driveTime(int distance){
    return distance/this.averageSpeed;
  }

}