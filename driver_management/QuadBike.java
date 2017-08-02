package driver_management;
import behaviours.*;
public class QuadBike{

  private int averageSpeed;
  private String engineSize;

  public QuadBike(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int driveTime(int distance){
    return distance/this.averageSpeed;
  }

}