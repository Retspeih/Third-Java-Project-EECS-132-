public class Variable extends Number implements CodeFundamentals {
  
  /**
   * holds the name of the Variable object
   */
  private String variableName = "";
  
  /**
   * constructor that initializes the Variable object with a name and passes a null value
   * to number until changed
   * @param variableName initializes the variableName
   */
  public Variable(String variableName) {
    super(null);
    this.variableName = variableName;
  }
  
  /**
   * takes a State and looks through the hashtable using the Variable object name
   * @param state is the State object that holds a hashtable for "memory"
   * @return Integer value associated with the Variable object name "key"
   */
  public Integer value(State state) {
    return state.lookup(variableName);
  }
  
  /**
   * getter method that returns the name of the Variable object
   * @return String name of the Variable object
   */
  public String getName() {
    return variableName;
  }
  
  /**
   * String representation of the Variable object
   * @return String of the Variable object name
   */
  public String toString() {
    return getName();
  }
}