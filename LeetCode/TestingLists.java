import java.util.ArrayList;
class TestingLists{
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        Integer[] intArray = new Integer[list1.size()];
        intArray = list1.toArray(intArray);
        for(int i = 0; i < list1.size(); i++){
            System.out.println(intArray[i]);
        }
    }
}