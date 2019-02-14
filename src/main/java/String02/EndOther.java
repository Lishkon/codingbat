package String02;

/**
 * Returns true if either of the strings appears at the very end of the other string,
 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 *
 * Note: str.toLowerCase() returns the lowercase version of a string.
 *
 * @param a
 * @param b
 */
public class EndOther {
  public boolean endOther(String a, String b) {
    return a.length() < b.length() ? b.toLowerCase().endsWith(a.toLowerCase()) : a.toLowerCase().endsWith(b.toLowerCase());
  }
}
