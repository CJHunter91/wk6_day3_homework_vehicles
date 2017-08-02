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
    assertEquals(2, quad.driveTime(20));
  }

  @Test
  public void canGetEngineSize(){
    assertEquals("100 cc", quad.getEngineSize());
  }
}