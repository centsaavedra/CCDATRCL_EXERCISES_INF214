// Array implementation of Stack
public class App {
  public static void main(String[] args) {

    // Create new Stack Object
    Stack fruits_stack = new Stack(4);

    // Insert new elements into the stack
    fruits_stack.push("Mango");
    fruits_stack.push("Strawberry");
    fruits_stack.push("Orange");
    fruits_stack.push("Grapes");

    // Show the size of the stack
    System.out.println("The size of the stack is: " + fruits_stack.size());

    // Show top element in the stack
    System.out.println("The top of the stack is: " + fruits_stack.peek());

    // Remove top element in the stack
    fruits_stack.pop();

    System.out.println("After pop");

    // Show all elements in Stack
    fruits_stack.printStack();

    // Show top element in the stack
    System.out.println("The top of the stack is: " + fruits_stack.peek());
  }
}