package String02;

public class DoubleChar {
  /*
   * Given a string, return a string where for every char in the original, there are two chars.
   *
   * doubleChar("The") → "TThhee"
   * doubleChar("AAbb") → "AAAAbbbb"
   * doubleChar("Hi-There") → "HHii--TThheerree"
   **/
  public String doubleChar(String str) {
    String res = "";
    for (int i = 0; i < str.length(); i++) {
      int j = 0;
      while (j < 2) {
        res+=str.charAt(i);
        j++;
      }
    }
    return res;
  }

}
