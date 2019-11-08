import org.junit.*;
import static org.junit.Assert.*;

public class JUnitBooleanOperationTester {
  
  /**
   * tests value() method in BooleanOperation
   */
  @Test
  public void testValue() {
    State s = new State();
    Number a = new Number(10);
    Number b = new Number(20);
    Comparison c = new Comparison(Comparison.Operator.LT, a, b);
    Comparison d = new Comparison(Comparison.Operator.GT, a, b);
    BooleanOperation f = new BooleanOperation(BooleanOperation.Operator.Or, c, d);
    assertEquals(true, f.value(s));
    f = new BooleanOperation(BooleanOperation.Operator.And, c, d);
    assertEquals(false, f.value(s));
    c = new Comparison(Comparison.Operator.LT, b, a);
    d = new Comparison(Comparison.Operator.GT, a, b);
    f = new BooleanOperation(BooleanOperation.Operator.Or, c, d);
    assertEquals(false, f.value(s));
    c = new Comparison(Comparison.Operator.LT, a, b);
    d = new Comparison(Comparison.Operator.LTE, a, b);
    f = new BooleanOperation(BooleanOperation.Operator.And, c, d);
    assertEquals(true, f.value(s));
  }
  
  /**
   * tests toString() method in BooleanOperation
   */
  @Test
  public void testToString() {
    State s = new State();
    Number a = new Number(10);
    Number b = new Number(20);
    Comparison c = new Comparison(Comparison.Operator.LT, a, b);
    Comparison d = new Comparison(Comparison.Operator.GT, a, b);
    BooleanOperation f = new BooleanOperation(BooleanOperation.Operator.And, c, d);
    assertEquals("10 < 20 && 10 > 20", f.toString());
    f = new BooleanOperation(BooleanOperation.Operator.Or, c, d);
    assertEquals("10 < 20 || 10 > 20", f.toString());
  }
}