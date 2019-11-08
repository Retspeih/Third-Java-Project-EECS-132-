import org.junit.*;
import static org.junit.Assert.*;

public class JUnitStateTester {
  
  /**
   * tests the update() and lookup() methods for State
   */
  @Test
  public void testUpdateAndLookup() {
    State s = new State();
    s.update("Hello world", 10);
    
    assertEquals(10, s.lookup("Hello world").intValue());
    assertEquals(0, s.lookup("Yeet").intValue());
  }
}