package LeetCode;

class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if(walk.length != 10){
      return false;
    }
    int nscount = 0;
    int wecount = 0;
    for (char c : walk) {
      if (c == 'n') {
        nscount++;
      } else if (c == 's') {
        nscount--;
      } else if (c == 'w') {
        wecount++;
      } else if (c == 'e') {
        wecount--;
      }
    }
    return nscount == 0 && wecount == 0;
  }

  public static void main(String[] args){
      char[] walk = new char[] {'n','s','n','s','n','s','n','s','n','s'};
      System.out.println(isValid(walk));
  }
}
