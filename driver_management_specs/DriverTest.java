import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest{

  Driver driver;
  QuadBike quad;
  Dodgem dodgem;

  @Before
  public void before(){
    quad = new QuadBike(10);
    driver = new Driver("Chris", quad);
    
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

  @Test
  public void driverHasDriveTime(){
    assertEquals(1, driver.driveTime(10));
  }
}