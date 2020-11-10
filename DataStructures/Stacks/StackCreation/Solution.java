// Creation of Stack

public class Stack {
	int top;
	int MAX_SIZE = 5;
	int stack_size[] = new int[MAX_SIZE];
	
	public int push(int data)
	{
		if(top == MAX_SIZE -1)
		{
			System.out.println("Stack is full");
			return data;
		}
		else
		{
			stack_size[top ++] = data;
			System.out.println(data + "Pushed into stack"); 
			return data;
		}
		
	}
	
	public void pop()
	{
		if(top < 0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			int data = stack_size[top--];
			System.out.println(data + "Removed from stack"); 
		}
	}
	
	public void display()
	{
		if(top < 0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int i=stack_size.length-1; i>=0 ;i--)
			{
				System.out.println("Item to display: " + stack_size[i]);
			}
		}
	}
}
