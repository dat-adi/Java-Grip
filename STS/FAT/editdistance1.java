public class EditDistance {
  private static int editDistanceHelper(int i, int j, String str1, String str2) {
    if (i == 0) {
      return j;
    }
   
    if (j == 0) {
      return i;
    }
   
    int ans = 1 + Math.min(Math.min(
        editDistanceHelper(i, j - 1, str1, str2), // Insert
        editDistanceHelper(i - 1, j, str1, str2)), // Remove
        editDistanceHelper(i - 1, j - 1, str1, str2) // Replace
    );
   
    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
      ans = Math.min(ans, editDistanceHelper(i - 1, j - 1, str1, str2));
    }
   
    return ans;
  }
   
  public static int editDistance(String str1, String str2) {

    int n = str1.length(), m = str2.length();
    int ans = editDistanceHelper(n, m, str1, str2);
   
    return ans;
  }


  public static void main(String[] args) {
    String str1 = "abad";
    String str2 = "abac";
    System.out.println(editDistance(str1,str2));
  }
}
