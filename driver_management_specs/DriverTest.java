import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest{

  Driver driver;
  QuadBike quad;
  Dodgem dodgem;

  @Before
  public void before(){
    driver = new Driver("Chris", quad);
    quad = new QuadBike(20);
  }

  @Test 
  public void canGetQuad(){
    QuadBike quad1 = (QuadBike) driver.getVehicle();
    assertEquals("100 cc", quad.getEngineSize());
  }
  // @Test

  // public void getQuadEngineSize(){
  //   assertEquals("100 cc", driver.getEngineSize());
  // }

  // @Test
  // public void driverHasDriveTime(){
  //   assertEquals(2, driver.driveTime(10));
  // }
}