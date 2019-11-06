public class Variable implements CodeFundamentals {
  
  private String variableName = "";
  
  /**
   * Constructor initializes the Variable object with a name
   * @param variableName The name of the variable to be used for calling later
   */
  public Variable(String variableName) {
    this.variableName = variableName;
  }
  
  /**
   * Takes a state and uses the name of the variable to lookup the value
   * @param state Inputted state object that represents a hashtable
   * @return the Integer value associated with the state using the variableName key
   */
  public Integer value(State state) {
    return state.lookup(variableName); // looks up the value associated with the key of the Variable
  }
  
  /**
   * Getter method
   * @return the name of the created Variable object
   */
  public String getName() {
    return variableName;
  }
  
  /**
   * Visually represents the Variable object as a string
   * @return String from the name of the Variable object
   */
  public String toString() {
    return getName();
  }
}