import java.util.Hashtable;
import java.util.Hashtable.*;

public class State {
  
  private Hashtable<String, Integer> hash;
  
  public State() {
    hash = new Hashtable<String, Integer>();
  }
  
  public void update(String name, Integer value) {
    hash.put(name, value);
  }
  
  public Integer lookup(String name) {
    if (hash.containsKey(name)) {
      return hash.get(name);
    }
    else {
      return 0;
    }
  }
}