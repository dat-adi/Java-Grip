package HashTables;

import java.util.Scanner;

class quadratic_probing{
    private static class QuadraticProbingHashTable
    {
        private int currentSize, maxSize;
        private String[] keys;
        private String[] vals;
        
        public QuadraticProbingHashTable(int capacity){
            currentSize = 0;
            maxSize = capacity;
            keys = new String[maxSize];
            vals = new String[maxSize];
        }

        public void makeEmpty(){
            currentSize = 0;
            keys = new String[maxSize];
            vals = new String[maxSize];
        }

        public int getSize(){
            return currentSize;
        }

        public boolean isFull(){
            return currentSize == maxSize;
        }

        public boolean isEmpty(){
            return getSize() == 0;
        }

        public boolean contains(String key){
            return get(key) != null;
        }

        private int hash(String key){
            return key.hashCode() % maxSize;
        }

        public void insert(String key, String val){
            int tmp = hash(key);
            int i = tmp, h = 1;
            do{
                if (keys[i] == null){
                    keys[i] = key;
                    vals[i] = val;
                    currentSize++;
                    return;
                }
                
                if (keys[i].equals(key)){
                    vals[i] = val;
                    return;
                }

                i = (i + h * h++) % maxSize;
            } while (i != tmp);
        }
        public String get(String key){
            int i = hash(key), h = 1;
            while (keys[i] != null)
            {
            if (keys[i].equals(key))
            return vals[i];
            i = (i + h * h++) % maxSize;
            System.out.println("i "+ i);
            }
            return null;
        }
        
        public void remove(String key){
            if (!contains(key))
                return;
            int i = hash(key), h = 1;
            while (!key.equals(keys[i]))
                i = (i + h * h++) % maxSize;
            
            keys[i] = vals[i] = null;
            for (i = (i + h * h++) % maxSize; keys[i] != null; i = (i + h * h++) % maxSize){
                String tmp1 = keys[i], tmp2 = vals[i];
                keys[i] = vals[i] = null;
                currentSize--;
                insert(tmp1, tmp2);
            }
            currentSize--;
        }

        public void printHashTable(){
            System.out.println("\nHash Table: ");
            for (int i = 0; i < maxSize; i++)
                if (keys[i] != null)
                    System.out.println(keys[i] +" "+ vals[i]);
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size:-");
        QuadraticProbingHashTable qpht = new QuadraticProbingHashTable(scan.nextInt() );
        char ch;
        while(true){
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. Insert into Hash Table");
            System.out.println("2. Remove from Hash Table");
            System.out.println("3. Retrieve value from Hash table");
            System.out.println("4. Clear the Hash Table");
            System.out.println("5. Size of Hash Table");
            System.out.println("6. Exit");
            System.out.println();
            int choice = scan.nextInt();
            
            switch (choice){
                case 1 :
                System.out.println("Enter key and value");
                qpht.insert(scan.next(), scan.next() );
                break;
                case 2 :
                System.out.println("Enter key");
                qpht.remove( scan.next() );
                break;
                case 3 :
                System.out.println("Enter key");
                System.out.println("Value = "+ qpht.get( scan.next() ));
                break;
                case 4 :
                qpht.makeEmpty();
                System.out.println("Hash Table Cleared\n");
                break;
                case 5 :
                System.out.println("Size = "+ qpht.getSize() );
                break;
                case 6 :
                System.exit(0);
                break;
                default :
                System.out.println("Wrong Entry \n ");
                break;
            }
            qpht.printHashTable();
        }
    }
}