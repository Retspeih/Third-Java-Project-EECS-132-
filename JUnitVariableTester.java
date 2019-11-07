import org.junit.*;
import static org.junit.Assert.*;

public class JUnitVariableTester {
  
  @Test
  public void testValue() {
    Variable var = new Variable("Yeet");
    State state = new State();
    state.update("Yeet", 20);
    assertEquals(20, var.value(state).intValue());
  }
}