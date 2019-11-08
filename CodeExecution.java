public interface CodeExecution {
  
  /**
   * abstract method that classes that implement will have to override
   * @param state represents the hashtable
   */
  void execute(State state);
  
}