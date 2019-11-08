import org.junit.*;
import static org.junit.Assert.*;

public class JUnitAssignmentTester {
  
  /**
   * tests the value() method in Assignment
   */
  @Test
  public void testValue() {
    State s = new State();
    Assignment c = new Assignment(new Variable("Yeet"), new Number(20));
    assertEquals(20, c.value(s).intValue());
  }
  
  /**
   * tests toString() method in Assignment
   */
  @Test
  public void testToString() {
    Assignment c = new Assignment(new Variable("Yeet"), new Number(20));
    assertEquals("Yeet := 20\n", c.toString());
  }
  
  /**
   * tests toStringTabbed() method in Assignment
   */
  @Test
  public void testToStringTabbed() {
    Assignment c = new Assignment(new Variable("Yeet"), new Number(20));
    assertEquals("\t\tYeet := 20", c.toStringTabbed(2));
  }
}