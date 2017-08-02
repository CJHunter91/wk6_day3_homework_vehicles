import static org.junit.Assert.*;
import org.junit.*;

import driver_management.*;

public class QuadBikeTest{

  QuadBike quad;

  @Before

  public void before(){
    quad = new QuadBike(10);
  }

  @Test
  public void driveDistanceReturnsTime(){
    assertEquals(1, quad.driveTime(10));
  }
}