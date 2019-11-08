import org.junit.*;
import static org.junit.Assert.*;

public class JUnitReturnTester {
  
  /**
   * test toString() method for Return
   */
  @Test
  public void testToString() {
    Return c = new Return(new Number(20));
    assertEquals("return 20", c.toString());
  }
  
  /**
   * test toStringTabbed() method for Return
   */
  @Test
  public void testToStringTabbed() {
    Return c = new Return(new Number(20));
    assertEquals("\t\treturn 20", c.toStringTabbed(2));
  }
}
