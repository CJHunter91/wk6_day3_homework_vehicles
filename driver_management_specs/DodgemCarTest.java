import static org.junit.Assert.*;
import org.junit.*;

import driver_management.*;

public class DodgemTest(){
  Dodgem car;


  @Before
  public void before(){
    car = new Dodgem();
  } 

  @Test
  public void DriveDistanceReturnsTime(){
    assertEquals(100, car.driveDistance())
  }
}