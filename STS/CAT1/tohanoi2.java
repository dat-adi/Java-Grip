// Tower of Hanoi
class Solution {

  //Stack
  class Stack {
    int capacity;
    int top;
    int arr[];
  }

  // Create Stack
  Stack create(int capacity) {

    Stack stack = new Stack();
    stack.capacity = capacity;
    stack.top = -1;
    stack.arr = new int[capacity];

    return stack;
  }

  //Stack is full when the top is equal
  // to the last index
  boolean isFull(Stack stack) {
    return (stack.top == stack.capacity - 1);
  }

  // To check Stack is empty or not
  boolean isEmpty(Stack stack) {
    return (stack.top == -1);
  }

  //Function to add an item in Stack
  void push(Stack stack, int item) {
    if (isFull(stack))
      return;

    stack.arr[++stack.top] = item;
  }
  //Function to remove an item from Stack
  int pop(Stack stack) {

    if (isEmpty(stack))
      return Integer.MIN_VALUE;

    return stack.arr[stack.top--];
  }

  // Function to move disks between the poles
  void moveDisks(Stack src, Stack dest, char s, char d) {

    int pole1 = pop(src);
    int pole2 = pop(dest);

    // When pole 1 is empty
    if (pole1 == Integer.MIN_VALUE) {

      push(src, pole2);
      move(d, s, pole2);
    }

    // When pole2 pole is empty
    else if (pole2 == Integer.MIN_VALUE) {

      push(dest, pole1);
      move(s, d, pole1);
    }

    // When top disk of pole1 > top disk of pole2
    else if (pole1 > pole2) {

      push(src, pole1);
      push(src, pole2);
      move(d, s, pole2);
    }
    // When top disk of pole1 < top disk of pole2
    else {

      push(dest, pole2);
      push(dest, pole1);
      move(s, d, pole1);
    }
  }

  //Function to show the movement of disks
  void move(char fromPeg, char toPeg, int disk) {

    System.out.println("Move the disk " + disk + " from " + fromPeg + " to " + toPeg);
  }

  // Implementation
  void Iterative(int num, Stack src, Stack aux, Stack dest) {

    int i, total_num_of_moves;
    char s = 'S', d = 'D', a = 'A';

    // Rules in algorithm will be followed
    if (num % 2 == 0) {

      char temp = d;
      d = a;
      a = temp;
    }
    total_num_of_moves = (int)(Math.pow(2, num) - 1);

    // disks with large diameter are pushed first
    for (i = num; i >= 1; i--)
      push(src, i);
    for (i = 1; i <= total_num_of_moves; i++) {

      if (i % 3 == 1)
        moveDisks(src, dest, s, d);

      else if (i % 3 == 2)
        moveDisks(src, aux, s, a);

      else if (i % 3 == 0)
        moveDisks(aux, dest, a, d);
    }
  }

  public static void main(String[] args) {

    // number of disks
    int num = 3;

    Solution ob = new Solution();
    Stack src, dest, aux;

    src = ob.create(num);
    dest = ob.create(num);
    aux = ob.create(num);

    ob.Iterative(num, src, aux, dest);
  }
}