import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Stack; 
  
class StackPermutation{ 
    static boolean checkStackPermutation(int a[], int b[], int n){ 
        Queue<Integer> input = new LinkedList<>(); 
  
        for(int i = 0; i < n; i++){ 
            input.add(a[i]); 
        } 
  
        Queue<Integer> output = new LinkedList<>(); 
        for(int i = 0; i < n; i++){ 
            output.add(b[i]); 
        } 
  
        Stack<Integer> tempStack = new Stack<>(); 
        while(!input.isEmpty()){ 
            int ele = input.poll(); 
  
            if(ele == output.peek()){ 
                output.poll(); 
                
                while(!tempStack.isEmpty()){ 
                    
                    if(tempStack.peek() == output.peek()){ 
                        tempStack.pop(); 
                        output.poll(); 
                    } 
                    
                    else{
                        break;
                    }
                } 
            }  
            else{ 
                tempStack.push(ele); 
            } 
        } 
  
        return (input.isEmpty() && tempStack.isEmpty()); 
    } 
  
    public static void main(String[] args){ 
        
        int a[] = { 1, 2, 3 }; 
        int b[] = { 2, 1, 3 }; 
        int n = a.length;
        
        if(checkStackPermutation(a, b, n)){ 
            System.out.println("Yes"); 
        }
        else{
            System.out.println("No"); 
        }
    } 
}