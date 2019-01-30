package String02;

/*
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
 *
 * bobThere("abcbob") → true
 * bobThere("b9b") → true
 * bobThere("bac") → false
 * */
public class BobThere {
  public boolean bobThere(String str) {
    for (int i = 0; i <= str.length() - 3; i++) {
      if (str.substring(i, i+3).matches("b\\wb")) {
        return true;
      }
    }
    return false;
  }
}
