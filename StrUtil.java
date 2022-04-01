public class StrUtil {
  public static String reverse(String s) {
    String rStr = new String();
    for (int i = 0; i < s.length(); i++) {
      rStr += s.charAt(s.length()-i-1);
    }
    return rStr;
  }
  public static boolean truePalindrome(String s) {
    return s.equals(reverse(s));
  }
  public static boolean palindrome(String s) {
    return onlyLetters(noCapitals(s)).equals(reverse(onlyLetters(noCapitals(s))));
  }
  public static String noCapitals(String s) {
    return s.toLowerCase();
  }
  public static String noSpaces(String s) {
    String nS = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        nS += s.charAt(i);
      }
    }
    return nS;
  }
  public static String onlyLetters(String s) {
    String lS = "";
    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        lS += s.charAt(i);
      }
    }
    return lS;
  }
}
