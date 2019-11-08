public class ConditionalStatement implements CodeExecution {
  
  /**
   * stores the BooleanOperation object that must be initialized by the constructor
   * affects the execute method
   */
  private BooleanOperation operation = null;
  
  /**
   * stores the Comparison object that must be initialized by the constructor
   * affects the execute method
   */
  private Comparison operation2 = null;
  
  /**
   * represents the then statement of a conditional statement
   */
  private CompoundStatement then = null;
  
  /** 
   * represents the else statement of a conditional statement
   */
  private CompoundStatement elsa = null;
  
  /**
   * constructor that initializes values
   * @param operation initializes a BooleanOperation object that will act as the condition
   * @param then acts as the then statement of the ConditionalStatement
   * @param elsa acts as the else statement of the ConditionalStatement
   */
  public ConditionalStatement(BooleanOperation operation, CompoundStatement then, CompoundStatement elsa) {
    this.operation = operation;
    this.then = then;
    this.elsa = elsa;
  }
  
  /**
   * constructor that initializes values
   * @param operation2 initializes a Comparison object that will act as the condition
   * @param then acts as the then statement of the ConditionalStatement
   * @param elsa acts as the else statement of the ConditionalStatement
   */
  public ConditionalStatement(Comparison operation2, CompoundStatement then, CompoundStatement elsa) {
    this.operation2 = operation2;
    this.then = then;
    this.elsa = elsa;
  }
  
  /**
   * depending on the boolean operation, will execute the then statements if true, or else statements if false
   * @param state hashtable used for data storage and "memory"
   */
  public void execute(State state) {
    if (operation != null) {
      if (operation.value(state) == true) {
        then.execute(state);
      }
      else {
        elsa.execute(state);
      }
    }
    else {
      if (operation2.value(state) == true) {
        then.execute(state);
      }
      else {
        elsa.execute(state);
      }
    }
  }
  
  /**
   * visual representation of the ConditionalStatement as a String
   * @return String of the ConditionalStatement and subsequents statements within
   */
  public String toString() {
    if (operation != null) {
      return "if (" + operation.toString() + ")\n" + then.toStringTabbed(1) + "else\n" + elsa.toStringTabbed(1);
    }
    else {
      return "if (" + operation2.toString() + ")\n" + then.toStringTabbed(1) + "else\n" + elsa.toStringTabbed(1);
    }
  }
}