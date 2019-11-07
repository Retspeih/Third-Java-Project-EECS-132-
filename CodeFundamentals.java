public interface CodeFundamentals<T> {
  
  /**
   * abstract method that represents the retrieval of values from statements
   * @param state accepts a hashtable and possibly manipulates the data within
   * @return T represents the type returned as a generic
   */
  T value(State state);
  
}