public class Variable extends Number implements CodeFundamentals {
  
  /**
   * holds the name of the Variable object
   */
  private String variableName = "";
  
  /**
<<<<<<< HEAD
   * constructor that initializes the Variable object with a name and passes a null value
   * to number until changed
   * @param variableName initializes the variableName
=======
   * Constructor initializes the Variable object with a name
   * @param variableName The name of the variable to be used for calling later
>>>>>>> f5b00ebce6ce223a213cea5f7f79f7e0415cc13e
   */
  public Variable(String variableName) {
    super(null);
    this.variableName = variableName;
  }
  
  /**
<<<<<<< HEAD
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
=======
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
>>>>>>> f5b00ebce6ce223a213cea5f7f79f7e0415cc13e
   */
  public String getName() {
    return variableName;
  }
  
  /**
<<<<<<< HEAD
   * String representation of the Variable object
   * @return String of the Variable object name
=======
   * Visually represents the Variable object as a string
   * @return String from the name of the Variable object
>>>>>>> f5b00ebce6ce223a213cea5f7f79f7e0415cc13e
   */
  public String toString() {
    return getName();
  }
}