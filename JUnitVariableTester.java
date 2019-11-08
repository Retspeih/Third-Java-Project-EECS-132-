import org.junit.*;
import static org.junit.Assert.*;

public class JUnitVariableTester {
  
  /**
   * tests value() method
   */
  @Test
  public void testValue() {
    Variable var = new Variable("Yeet"); // tests a string
    Variable var2 = new Variable(""); // tests an empty string
    State state = new State();
    state.update("Yeet", 20);
    state.update("", 30);
    assertEquals(20, var.value(state).intValue());
    assertEquals(30, var2.value(state).intValue());
  }
  
  /**
   * tests toString() method
   */
  @Test
  public void testToString() {
    Variable var = new Variable("Yeet");
    assertEquals("Yeet", var.toString());
  }
}