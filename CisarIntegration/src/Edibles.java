/**<p>What both Salad and steak have in common is that they are both food
   and When the program is ran, if "steak" had no text, then both classes would
   print "New example of something edible". Both classes inherit what the food 
   class contains sicnd they extend from the food class. With what is in the 
   code right now, only the salad class will inherit from 
   the food class because the steak class has its own text</p>
 * @author Joseph Cisar 
 */
public class Edibles {
  /**
   * @param args is sued when the main of a public class is used.
   */
  public static void main(String[] args) {
    /**
     * The steak and salad classes inherit edibles.
     */
    Steak steakObject = new Steak();
    Salad saladObject = new Salad();
    
    steakObject.eat();
    saladObject.eat();
  }
}
