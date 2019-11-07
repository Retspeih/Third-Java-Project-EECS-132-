import java.util.Hashtable;
import java.util.Hashtable.*;

public class State {
  
  /**
   * hashtable that State uses to store values in "memory"
   */
  private Hashtable<String, Integer> hash;
  
  /**
   * constructor that initializes the State object and creates the respective hashtable
   */
  public State() {
    hash = new Hashtable<String, Integer>();
  }
  
  /**
   * takes a key and value and locks the value in the hashtable with the key
   * @param name represents the key
   * @param value represents the Integer value locked behind the key
   */
  public void update(String name, Integer value) {
    hash.put(name, value);
  }
  
  /**
   * uses a key to look through the hashtable and retrieve the value locked with the key
   * @param name represents the key that will unlock the value
   * @return Integer value associated with the key
   */
  public Integer lookup(String name) {
    if (hash.containsKey(name)) {
      return hash.get(name);
    }
    else {
      return 0;
    }
  }
}