package String02;

public class PrefixAgain {
  /*
   * Given a string, consider the prefix string made of the first N chars of the string.
   * Does that prefix string appear somewhere else in the string?
   * Assume that the string is not empty and that N is in the range 1..str.length().
   *
   **/

  public boolean prefixAgain(String str, int n) {
    for (int i = 0; i <= str.length() - n; i++) {
      for (int j = n; j <= str.length() - n; j++) {
        if (str.substring(0, n).matches(str.substring(j, j + n))) {
          return true;
        }
      }
    }
    return false;

    //    More elegant solution (compiles in 776 ms vs 792 ms of the provided above:
    //    return (n < str.length() && (str.substring(1)).contains(str.substring(0, n)));
  }

}
