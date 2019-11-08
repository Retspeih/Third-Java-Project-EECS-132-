public class BooleanOperation implements CodeFundamentals {
  
  /**
   * stores the operation that the value function will do
   */
  private Operator operator;
  
  /**
   * stores the left side of the expression
   */
  private Comparison left;
  
  /**
   * stores the right side of the expression
   */
  private Comparison right;
  
  /**
   * creates the Operators for the function to delineate which task the value method will do
   */
  public enum Operator { And, Or;}
  
  /**
   * constructor that initializes values
   * @param operator dictates which operation will be performed
   * @param left depicts the left side of the operation
   * @param right depicts the right side of the operation
   */
  public BooleanOperation(Operator operator, Comparison left, Comparison right) {
    this.operator = operator;
    this.left = left;
    this.right = right;
  }
  
  /**
   * evaluates the left and right using the dictated operation
   * @param state is the hashtable that is being manipulated "memory"
   * @return Boolean based on how the function evaluates the left and right expressions (True/False)
   */
  public Boolean value(State state) {
    switch(operator) {
      case And:
        if (left.value(state) == true && right.value(state) == true) {
        return new Boolean(true);
      }
        else {
          return new Boolean(false);
        }
      case Or:
        if (left.value(state) == true || right.value(state) == true) {
        return true;
      }
        else {
          return false;
        }
      default:
        return false;
    }
  }
  
  /**
   * creates a visual representation of the whole expression as a String
   * @return String showing left side, operation, and then right side of the expression
   */
  public String toString() {
    switch(operator) {
      case And:
        return left.toString() + " && " + right.toString();
      case Or:
        return left.toString() + " || " + right.toString();
      default:
        return "Why are you doing this? ERROR!! Try \"And\" or \"Or\"";
    }
  }
}