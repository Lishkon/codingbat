package String02;

public class SameStarChar {
  /*
   * Returns true if for every '*' (star) in the string, if there are chars both immediately
   * before and after the star, they are the same.
   *
   * sameStarChar("xy*yzz") → true
   * sameStarChar("xy*zzz") → false
   * sameStarChar("*xa*az") → true
   *
   * Credit @javaproblems.com
   **/
  public boolean sameStarChar(String str) {
    int len = str.length();
    boolean found = true;

    for (int i = 0; i < len; i++) {
      String tmpString = str.substring(i,i+1);

      if (tmpString.equals("*") && i > 0 && i < len-1) {
        if (str.charAt(i-1) == str.charAt(i+1))
          found = true;
        else
          found = false;
      }
    }
    return found;
  }

}
