import org.junit.*;
import static org.junit.Assert.*;

public class JUnitStateTester {
  
  @Test
  public void testUpdateAndLookup() {
    State s = new State();
    s.update("Hello world", 10);
    
    assertEquals(10, s.lookup("Hello world").intValue()); // Test 1 & Test many
    assertEquals(0, s.lookup("Yeet").intValue());
  }
}