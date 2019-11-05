public class ArithmeticOperation<K,V> implements CodeFundamentals {
  
  private Operator operator;
  private Variable variable;
  private Number number;
  
  public enum Operator { Add, Sub, Mult, Div, Rem; }
  
  public <K,V> ArithmeticOperation(Operator operator, K left, V right) {
    this.operator = operator;
    //this.variable = variable;
    //this.number = number;
  }
  
  public Integer value(State s) {
    return s.lookup(variable.getName()) - number.getNumber(); // Fix
  }
}