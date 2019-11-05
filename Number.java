public class Number implements CodeFundamentals {
  
  private Integer number = 0;
  
  public Number(Integer number) {
    this.number = number;
  }
  
  public Integer value(State s) {
    return s.lookup("number");
  }
  
  public String toString() {
    return getNumber() + "";
  }
  
  public Integer getNumber() {
    return number;
  }
}