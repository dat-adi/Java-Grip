package online_programs;

class TwoSum
{
    public static int[] twoSum(int[] numbers, int target)
    {
        int temp1 = 0, temp2 = 0;
        for(int i = 0; i < numbers.length; i++){
            temp1 = numbers[i];
            for(int j = 0; j < numbers.length; j++){
                temp2 = numbers[j]; 
                if(temp1 + temp2 == target && i != j){
                    return new int[]{temp1,temp2};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args){
        int[] narr = new int[] {2, 3, 1, 5};
        int tar = 8;
        for(int i = 0; i < twoSum(narr, tar).length; i++){
            System.out.println(twoSum(narr, tar)[i]);
        }
    }
}
