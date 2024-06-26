package Day12_Generic_HW;
import java.util.ArrayList;
import java.util.List;

public class MyStack<T> 
{
    private List<T> stack;

    public MyStack() 
    {
        this.stack = new ArrayList<>();
    }
    public void push(T element) 
    {
        stack.add(element);
    }
    public T pop() 
    {
        if (isEmpty()) 
        {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }
    public T peek()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty() 
    {
        return stack.isEmpty();
    }
    public int size() 
    {
        return stack.size();
    }
}
