package online_programs;

public class missing_letter
{
    public static char findMissingLetter(char[] array)
    {
      int[] numArr = new int[array.length];
      int req_num = numArr[0];
      for(int i = 0; i < array.length; i++){
        numArr[i] = array[i];
      }
      for(int i = numArr[0], j = 0; i < numArr[0] + numArr.length; i++, j++){
        if(i != numArr[j]){
          req_num = i;
          break;
        }
      }
      return (char)req_num;
    }
    
    public static void main(String[] args) {
        char[] arr = new char[]{'a','b','c','d','f'};
        System.out.println(findMissingLetter(arr));
    }
}
