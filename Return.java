public class Return implements CodeExecution {
  
  /** 
   * stores the Number object for use in the value method
   */
  private Number number = null;
  
  /**
   * stores the ArithmeticOperation for use in the value method
   */
  private ArithmeticOperation operation = null;
  
  /**
   * stores a special "return" variable for when a return type needs to be initialized
   */
  private Variable retorn = new Variable("return");
  
  /**
   * stores an empty state for later initialization
   */
  private State state = null;
  
  /**
   * initializes the Return type with an Integer return type
   * @param number represents the special "return" type
   */
  public Return(Number number) {
    this.number = number;
  }
  
  /**
   * initializes the Return type with an expression that evaluates into an Integer return type
   * @param operation represents an evaluated expression as the special "return" type
   */
  public Return(ArithmeticOperation operation) {
    this.operation = operation;
  }
  
  /** 
   * getter method for special "return" type variable
   * @return Variable special "return" type
   */
  public Variable getReturn() {
    return retorn;
  }
  
  /**
   * executes the state to update the return type of the function
   * @param state is used to initialize the return type with the inputted values
   */
  public void execute(State state) {
    if (number != null) {
      state.update(getReturn().getName(), number.value(state));
    }
    else {
      state.update(getReturn().getName(), operation.value(state));
    }
  }
  
  /**
   * creates a visual representation of the return type
   * @return String creates a return message with the representation of the return type string
   */
  public String toString() {
    if (number != null) {
      return "return " + number.toString();
    }
    else {
      return "return " + operation.toString();
    }
  }
  
  /**
   * does the same things as the toString() method but indents the String
   * @param tabs dictates how many times the String is indents
   * @return String depicts the String after the indents have been done
   */
  public String toStringTabbed(int tabs) {
    StringBuilder builder = new StringBuilder();
    if (number != null) {
      for (int i = tabs; i > 0; i--) {
        builder.append("\t");
        builder.append("return ");
        builder.append(number.toString());
      }
    }
    else {
      for (int i = tabs; i > 0; i--) {
        builder.append("\t");
        builder.append("return ");
        builder.append(operation.toString());
      }
    }
    return builder.toString();
  }
  
  public State getState() {
    return state;
  }
}