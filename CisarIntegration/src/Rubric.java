
/**
 * @author jacis
 * This file is filled with private fields , public getters 
 * and setters, and constructors with and without parameters. 
 * The class calls for the time and changes into military time.
 */
public class Rubric {
  
  private int hour;
  private int minute;
  private int second;
  
  public Rubric() {
    this(0, 0, 0);
  }
  
  /**
   * @param h Finds the hour.
   */
  public Rubric(int h) {
    this(h, 0, 0);
    }

  /**
   * @param h Finds the hour.
   * @param m Finds the minute.
   */
  public Rubric(int h, int m) {
    this(h, m, 0);
  }
  
  /**
   * @param h Finds the hour.
   * @param m Finds the minute.
   * @param s Finds the second.
   */
  Rubric(int h, int m, int s) {
    setTime(h, m, s);
  }
  
  /**
   * @param h Sets the hour.
   * @param m Sets the minute.
   * @param s Sets the second.
   */
  public void setTime(int h, int m, int s) {
    setHour(h);
    setMinute(m);
    setSecond(s);
  }
  
  /**
   * @param h Displays the hour between greater than 0 and
   * less than 24.
   */
  public void setHour(int h) {
    hour = ((h >= 0) && h < 24) ? h : 0;
  }
  
  /**
   * @param m Displays the minute greater than 0 and
   * less than 60.
   */
  public void setMinute(int m) {
    
    minute = ((m >= 0) && m < 60) ? m : 60;
  }
  
  /**
   * @param s Displays the second greater than 0 and
   * less than 60.
   */
  public void setSecond(int s) {
    second = ((s >= 0) && s < 60) ? s : 0;
  }
  
  public int getHour() {
    return hour;
  }
  
  public int getMinute() {
    return minute;
  }
  
  public int getSecond() {
    return second;
  }
  
  public String toMilitary() {
    return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
}
  // %02d rounds to 2 decimal places
}
