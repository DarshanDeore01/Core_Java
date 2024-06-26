package Day12_Generic_HW;

public class MyStackMain
{
	
    public static void main(String[] args)
    {
        
        MyStack<Integer> integerStack = new MyStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println("Integer Stack:");
        System.out.println("Top element: " + integerStack.peek());
        System.out.println("Stack size: " + integerStack.size());

        System.out.println("Popped element: " + integerStack.pop());
        System.out.println("Top element after pop: " + integerStack.peek());
        System.out.println("Stack size after pop: " + integerStack.size());

        MyStack<String> stringStack = new MyStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("\nString Stack:");
        System.out.println("Top element: " + stringStack.peek());
        System.out.println("Stack size: " + stringStack.size());

        System.out.println("Popped element: " + stringStack.pop());
        System.out.println("Top element after pop: " + stringStack.peek());
        System.out.println("Stack size after pop: " + stringStack.size());
    }
}
