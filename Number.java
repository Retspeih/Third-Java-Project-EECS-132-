public class Number {
  
  /**
   * represents the value that the number type object holds at any moment
   */
  private Integer number = 0;
  
  /**
   * constructor initializes the value of the number object and the value it holds
   * @param number the value that is given to initialize the object respectively
   */
  public Number(Integer number) {
    this.number = number;
  }
  
  /**
   * value function that gets the value of the number field in the Number object
   * @param state represents a hashtable that may hold numbers
   * @return Integer value that the Number object holds
   */
  public Integer value(State state) {
    return getNumber();
  }
  
  /**
   * creates a visual representation of the Number object
   * @return String representation of Integer value
   */
  public String toString() {
    return getNumber() + "";
  }
  
  /**
   * getter method that gets the value of the number instance field
   * @return Integer value of the number field in the Number object
   */
  public Integer getNumber() {
    return number;
  }
  
}