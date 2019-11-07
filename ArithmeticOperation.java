public class ArithmeticOperation implements CodeFundamentals {
  
  /**
   * the type of operator: (add, subtract, multiply, divide, or remainder)
   */
  private Operator operator;
  
  /**
   * the left expression
   */
  private Number left;
  
  /**
   * the right expression
   */
  private Number right;
  
  /**
   * creates the Operators for the function to delineate which task the value method does
   */
  public enum Operator { Add, Sub, Mult, Div, Rem; }
  
  /**
   * constructor initializes the values for the type of Operator, the left expression
   * and the right expression for the arithmetic operation
   * @param operator represents the type of oepration being done
   * @param left represents the left side of the expression
   * @param right represents the right side of the expressio
   */
  public ArithmeticOperation(Operator operator, Number left , Number right) {
    this.operator = operator;
    this.left = left;
    this.right = right;
  }
  
  /**
   * value method computes the overall value of the operation when both expressions
   * are evaluated using the respective operation
   * @param state takes a hashtable and manipulates the value into the hashtable as "memory"
   * @return the Integer value of the operation
   */
  public Integer value(State state) {
    switch(operator) {
      case Add:
        return left.value(state) + right.value(state);
      case Sub:
        return left.value(state) - right.value(state);
      case Mult:
        return left.value(state) * right.value(state);
      case Div:
        return left.value(state) / right.value(state);
      case Rem:
        return left.value(state) % right.value(state);
      default:
        return left.value(state) + right.value(state);
    }
  }
  
  /**
   * represents the operation with left and right side expressions as String
   * @return the String representation
   */
  public String toString() {
    switch(operator) {
      case Add:
        return left.toString() + " + " + right.toString();
      case Sub:
        return left.toString() + " - " + right.toString();
      case Mult:
        return left.toString() + " * " + right.toString();
      case Div:
        return left.toString() + " / " + right.toString();
      case Rem:
        return left.toString() + " % " + right.toString();
      default:
        return left.toString() + " + " + right.toString();
    }
  }
}
