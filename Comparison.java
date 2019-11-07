public class Comparison implements CodeFundamentals {
  
  /**
   * the type of operator: (less than, less than/equal to, greater than,
   * greater than/equal to, equal, or not equals)
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
  public enum Operator { LT, LTE, GT, GTE, EQ, NEQ; }
  
  /**
   * constructor that initializes the operator of the function, left expression, and right expression
   * @param operator dictates the type of operation that the value method will use
   * @param left initializes the left side of the expression
   * @param right initializes the right side of the expression
   */
  public Comparison(Operator operator, Number left, Number right) {
    this.operator = operator;
    this.left = left;
    this.right = right;
  }
  
  /**
   * evaluates the expression from the left and right side using the respective operator initialized by the constructor
   * @param state represents the hashtable that will be inputted and modified by the expression evaluation
   * @return Boolean value given from each expression from each operator respectively
   */
  public Boolean value(State state) {
    switch(operator){
      case LT:
        if (left.value(state) < right.value(state)) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
      case LTE:
        if (left.value(state) <= right.value(state)) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
      case GT:
        if (left.value(state) > right.value(state)) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
      case GTE:
        if (left.value(state) >= right.value(state)) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
      case EQ:
        if (left.value(state) == right.value(state)) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
      case NEQ:
        if (left.value(state) < right.value(state)) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
      default:
        if (left.value(state) == right.value(state)) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
    }
  }
  
  /**
   * creates a visualization of the whole operation through a String
   * @return String that shows the left side of the expression, operator, and right side of the expression in order
   */
  public String toString() {
    switch(operator){
      case LT:
        return left.toString() + " < " + right.toString();
      case LTE:
        return left.toString() + " <= " + right.toString();
      case GT:
        return left.toString() + " > " + right.toString();
      case GTE:
        return left.toString() + " >= " + right.toString();
      case EQ:
        return left.toString() + " == " + right.toString();
      case NEQ:
        return left.toString() + " != " + right.toString();
      default:
        return left.toString() + " error " + right.toString();
    }
  }
}