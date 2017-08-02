package driver_management;
import behaviours.*;

public class Driver{

  Driveable vehicle;
  String name;

  public Driver(String name, Driveable vehicle){
    this.vehicle = vehicle;
    this.name = name;
  }

  public Driveable getVehicle(){
    
  }

  public int driveTime(int distance){
    return this.vehicle.driveTime(distance);
  }

}