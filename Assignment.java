public class Assignment implements CodeFundamentals, CodeExecution {
  
  /**
   * stores the Variable object for a value/its key
   */
  private Variable variable = null;
  
  /**
   * stores the Number object for a value
   */
  private Number number = null;
  
  /**
   * stores the ArithmeticOperation object for an expression
   */
  private ArithmeticOperation operation = null;
  
  /**
   * stores the State object hashtable "memory"
   */
  private State state = null;
  
  /**
   * constructor initializes the Variable object and Number object
   * @param variable stores the Variable object for key use
   * @param number stores the Number object for Integer values needed later
   */
  public Assignment(Variable variable, Number number) {
    this.variable = variable;
    this.number = number;
  }
  
  /**
   * constructor initializes the Variable object and ArithmeticOperation object
   * @param variable stores the Variable object for key use
   * @param operation stores the ArithmeticOperation object for storing evaluated statements
   */
  public Assignment(Variable variable, ArithmeticOperation operation) {
    this.variable = variable;
    this.operation = operation;
  }
  
  /**
   * getter method that returns the location of the Variable object
   * @return Variable location in memory
   */
  public Variable getVariable() {
    return variable;
  }
  
  /**
    * getter method that returns the location of the Number object
    * @return Number location in memory
    */
  public Number getNumber() {
    return number;
  }
  
  /**
   * getter method that returns the location of the ArithmeticOperation object
   * @return ArithmeticOperation location in memory
   */
  public ArithmeticOperation getArithmeticOperation() {
    return operation;
  }
  
  /**
   * checks if the Number object or ArithmeticOperation objects were instantiated and evaluates
   * their value functions to update the hashtable and assign the Variable object with their
   * evaluated values
   * @param state hashtable used for storage "memory"
   * @return Integer value that is assigned to the Variable object
   */
  public Integer value(State state) {
    if (number != null) {
      state.update(variable.getName(), number.value(state));
    }
    else {
      state.update(variable.getName(), operation.value(state));
    }
    this.state = state;
    return state.lookup(variable.getName());
  }
  
  /**
   * checks if the Number object or ArithmeticOperation objects were instantiated and evaluates
   * their value functions to update the hashtable and assign the Variable object with thier
   * evaluated values
   * @param state hashtable used for storage "memory"
   */
  public void execute(State state) {
    if (number != null) {
      state.update(variable.getName(), number.value(state));
    }
    else {
      state.update(variable.getName(), operation.value(state));
    }
    this.state = state;
  }
  
  /**
   * gives a visual representation of an Assignment operation through a String that changes depending
   * on if the Number object is instantiated or the ArithmeticOperation object is
   * @return String that depicts the assignment operation
   */
  public String toString() {
    if (number != null) {
      return variable.getName() + " := " + number.value(state) + "\n";
    }
    else {
      return variable.getName() + " := " + operation.value(state) + "\n";
    }
  }
  
  /** does the same thing as toString() but indents the line
    * @param tabs dictates how many times to indent the line
    * @return String representation of the operation with howevery many indents were inputted
    */
  public String toStringTabbed(int tabs) {
    StringBuilder builder = new StringBuilder();
    if (number != null) {
      for (int i = tabs; i > 0; i--) {
        builder.append("\t");
      }
      builder.append(variable.getName());
      builder.append(" := ");
      builder.append(number.value(state));
    }
    else {
      for (int i = tabs; i > 0; i--) {
        builder.append("\t");
      }
      builder.append(variable.getName());
      builder.append(" := ");
      builder.append(operation.value(state));
    }
    return builder.toString();
  }
}