package driver_management;
import behaviours.*;
public class QuadBike extends Vehicle implements Driveable{

  private int averageSpeed;
  private String engineSize;

  public QuadBike(int averageSpeed){
    super(averageSpeed);
    this.engineSize = "100 cc";
  }

  // public int driveTime(int distance){
  //   return distance/this.averageSpeed;
  // }

  public String getEngineSize(){
    return this.engineSize;
  }

}