import org.junit.*;
import static org.junit.Assert.*;


public class JUnitNumberTester {
  
  /**
   * tests the value() method for Number
   */
  @Test
  public void testValue() {
    Number n = new Number(10);
    Number m = new Number(null);
    State s = new State();
    assertEquals(10, n.value(s).intValue()); // tests any arbitrary value
    assertEquals(null, m.value(s)); // tests no number
  }
  
  /**
   * tests the toString() method for Number
   */
  @Test
  public void testToString() {
    Number n = new Number(10);
    Number m = new Number(null);
    State s = new State();
    assertEquals("10", n.toString()); // tests any arbitrary number
    assertEquals("null", m.toString()); // tests no number
  }
}