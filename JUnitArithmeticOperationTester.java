import org.junit.*;
import static org.junit.Assert.*;

public class JUnitArithmeticOperationTester {
  
  /**
   * tests the testValue() method for ArithmeticOperation
   */
  @Test
  public void testValue() {
    State s = new State();
    Number c = new Number(5);
    Variable d = new Variable("Yeet");
    s.update(d.getName(), 15);
    ArithmeticOperation n = new ArithmeticOperation(ArithmeticOperation.Operator.Add, c, d); // tests add operator
    assertEquals(20, n.value(s).intValue());
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Sub, c, d); // tests sub operator
    assertEquals(-10, n.value(s).intValue());
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Mult, c, d); // tests mult operator
    assertEquals(75, n.value(s).intValue());
    c = new Number(30);
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Div, c, d); // tests div operator
    assertEquals(2, n.value(s).intValue());
    c = new Number(40);
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Rem, c, d); // tests rem operator
    assertEquals(10, n.value(s).intValue());
  }
  
  /**
   * tests the toString() method for ArithmeticOperation
   */
  @Test
  public void testToString() {
    State s = new State();
    Number c = new Number(5);
    Number d = new Number(15);
    ArithmeticOperation n = new ArithmeticOperation(ArithmeticOperation.Operator.Add, c, d); // tests add operator
    assertEquals("5 + 15", n.toString());
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Sub, c, d); // tests sub operator
    assertEquals("5 - 15", n.toString());
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Mult, c, d); // tests mult operator
    assertEquals("5 * 15", n.toString());
    c = new Number(30);
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Div, c, d); // tests div operator
    assertEquals("30 / 15", n.toString());
    c = new Number(40);
    n = new ArithmeticOperation(ArithmeticOperation.Operator.Rem, c, d); // tests rem operator
    assertEquals("40 % 15", n.toString());
  }
}
