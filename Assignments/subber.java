import java.util.*;

class subber{
    private static boolean checkSubstring(String main, String sub){
        int i, j = 0;
        int subLen = sub.length();
        boolean res = false;
        for(i = 0; i < main.length(); i++){
            if(main.charAt(i) == sub.charAt(0)){
                int k = i;
                for(j = 0; j < subLen; j++){
                    if(main.charAt(k) == sub.charAt(j)){
                        res = true;
                        k++;
                    } else {
                        res = false;
                        break;
                    }
                }

                if(res == true){
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string : ");
        String mainString = sc.nextLine();

        System.out.println("Enter the sub string : ");
        String subString = sc.nextLine();

        boolean subStatus = checkSubstring(mainString, subString);
        if(subStatus == true){
            System.out.println("The string contains a substring");
        } else {
            System.out.println("The string does not contain a substring");
        }
    }
}
