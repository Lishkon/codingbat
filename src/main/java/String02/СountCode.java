package String02;
/*
 * Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any
 * letter for the 'd', so "cope" and "cooe" count.
 * countCode("aaacodebbb") → 1
 * countCode("codexxcode") → 2
 * countCode("cozexxcope") → 2
 **/

public class СountCode {
  public int countCode(String str) {
    String regex = "co\\we";
    int count = 0;
    for (int i = 0; i <= str.length()-4; i++) {
      if (str.substring(i,i+4).matches(regex)) {
        count++;
      }
    }
    return count;
  }
}


