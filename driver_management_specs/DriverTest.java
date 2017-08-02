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

  // @Test

  // public void getQuadEngineSize(){
    
  // }

  // @Test
  // public void driverHasDriveTime(){
  //   assertEquals(2, driver.driveTime(10));
  // }
}