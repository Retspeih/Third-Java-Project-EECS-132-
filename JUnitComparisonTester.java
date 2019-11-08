import org.junit.*;
import static org.junit.Assert.*;

public class JUnitComparisonTester {
  
  /**
   * tests value() method in Comparison
   */
  @Test
  public void testValue() {
    State s = new State();
    Number n = new Number(10);
    Variable v = new Variable("yeems");
    s.update("yeems", 50);
    Comparison c = new Comparison(Comparison.Operator.LT, n, v); // tests LT
    assertEquals(true, c.value(s));
    c = new Comparison(Comparison.Operator.LTE, n, v); // tests LTE
    assertEquals(true, c.value(s));
    c = new Comparison(Comparison.Operator.GT, n, v); // tests GT
    assertEquals(false, c.value(s));
    c = new Comparison(Comparison.Operator.GTE, n, v); // tests GTE
    assertEquals(false, c.value(s));
    c = new Comparison(Comparison.Operator.EQ, n, v); // tests EQ
    assertEquals(false, c.value(s));
    c = new Comparison(Comparison.Operator.NEQ, n, v); // tests NEQ
    assertEquals(true, c.value(s));
    c = new Comparison(Comparison.Operator.LT, v, n); // tests LT
    assertEquals(false, c.value(s));
    c = new Comparison(Comparison.Operator.LTE, v, n); // tests LTE
    assertEquals(false, c.value(s));
    c = new Comparison(Comparison.Operator.GT, v, n); // tests GT
    assertEquals(true, c.value(s));
    c = new Comparison(Comparison.Operator.GTE, v, n); // tests GTE
    assertEquals(true, c.value(s));
    c = new Comparison(Comparison.Operator.EQ, v, n); // tests EQ
    assertEquals(false, c.value(s));
    c = new Comparison(Comparison.Operator.NEQ, v, n); // tests NEQ
    assertEquals(false, c.value(s));
  }
  
  /**
   * tests toString() in Comparison
   */
  @Test
  public void testToString() {
        State s = new State();
    Number n = new Number(10);
    Number v = new Number(50);
    Comparison c = new Comparison(Comparison.Operator.LT, n, v); // tests LT
    assertEquals("10 < 50", c.toString());
    c = new Comparison(Comparison.Operator.LTE, n, v); // tests LTE
    assertEquals("10 <= 50", c.toString());
    c = new Comparison(Comparison.Operator.GT, n, v); // tests GT
    assertEquals("10 > 50", c.toString());
    c = new Comparison(Comparison.Operator.GTE, n, v); // tests GTE
    assertEquals("10 >= 50", c.toString());
    c = new Comparison(Comparison.Operator.EQ, n, v); // tests EQ
    assertEquals("10 == 50", c.toString());
    c = new Comparison(Comparison.Operator.NEQ, n, v); // tests NEQ
    assertEquals("10 != 50", c.toString());
  }
}