package driver_management;
import behaviours.*;

public class Driver{

  private Driveable vehicle;
  private String name;

  public Driver(String name, Driveable vehicle){
    this.vehicle = vehicle;
    this.name = name;
  }

  public Driveable getVehicle(){
    return this.vehicle;
  }

  public int driveTime(int distance){
    return this.vehicle.driveTime(distance);
  }

}