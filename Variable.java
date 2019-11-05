public class Variable implements CodeFundamentals {
  
  private String variableName = "";
  
  public Variable(String variableName) {
    this.variableName = variableName;
  }
  
  public Integer value(State s) {
    return s.lookup(variableName);
  }
  
  public String getName() {
    return variableName;
  }
  
  public String toString() {
    return getName();
  }
}