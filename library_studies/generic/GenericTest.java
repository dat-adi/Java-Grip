package library_studies.generic;

class GenericTest {

    public static < E > void printArray( E[] arr){
        for( E element : arr){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args){
        Integer[] intArr = {12, 32, 52, 56, 23};
        Character[] charArr = {'Y', 'o', 'i', 't', 's', 'm', 'e'};

        System.out.print("Integer array : ");
        printArray(intArr);

        System.out.println("Char array : ");
        printArray(charArr);
    }
}

