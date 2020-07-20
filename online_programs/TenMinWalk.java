public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if(walk.length != 10){
      return false;
    }
    int nscount = 0;
    int wecount = 0;
    for(int i = 0; i < walk.length; i++){
      if(walk[i] == 'n'){
        nscount++;
      }
      else if(walk[i] == 's'){
        nscount--;
      }
      else if(walk[i] == 'w'){
        wecount++;
      }
      else if(walk[i] == 'e'){
        wecount--;
      }
    }
    if(nscount == 0 && wecount == 0){
      return true;
    }
    return false;
  }

  public static void main(String[] args){
      char[] walk = new char[] {'n','s','n','s','n','s','n','s','n','s'};
      System.out.println(isValid(walk));
  }
}
