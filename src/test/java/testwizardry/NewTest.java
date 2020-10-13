package testwizardry;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

public class NewTest
{
  @Test
  public void myTest()
  {
	  assertTrue(1+1 == 2);
  }
  
  @Test
  public void anotherTest()
  {
	  assertTrue(1+4 == 5);
  }
}
