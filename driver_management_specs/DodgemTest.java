import static org.junit.Assert.*;
import org.junit.*;

import driver_management.*;

public class DodgemTest{
  Dodgem car;


  @Before
  public void before(){
    car = new Dodgem(10);
  } 

  @Test
  public void DriveDistanceReturnsTime(){
    assertEquals(1, car.driveTime(10));
  }

  @Test 
  public void getNumberOfSeats(){
    assertEquals(3, car.getNumberOfSeats());
  }
}