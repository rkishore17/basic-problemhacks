// Creation of Queue

public class Queue {

	int front = 0;
	int rear = 0;
	int size = 5;
	int queue[] = new int[size];
	
	public int insert(int element)
	{
		if(rear == size-1)
		{
			return element;
		}
		else
		{
			queue[rear ++] = element;
			System.out.println("Pushed into Queue: " + element); 
			return element;			
		}
	}
	
	public void delete()
	{
		if(rear == -1 || front > rear)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			int data = queue[front ++];
			System.out.println("Deleted item: " + data);
		}
	}
	
	public void display()
	{
		if(rear == -1 || front > rear)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i = front; i <= queue.length-1; i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
}
