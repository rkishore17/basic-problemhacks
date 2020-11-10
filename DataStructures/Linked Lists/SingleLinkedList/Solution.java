//Creation of SingleLinkedList

public class SingleLinkedList {
	
	static class Node 
	{
		int data;
		Node next;
	
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node temp = null;
	
	//Insertion of Node from front_side
	public void insertFront(int data)
	{		
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	
	//Insertion of Node from rear_side
	public void insertRear(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	//Counting of Node
	public void count()
	{
		Node currentNode = head;
		int count = 0;
		while(currentNode != null)
		{
			count ++;
			currentNode = currentNode.next;
		}
		System.out.println("No.of node in list: " + count);
	}
	
	//Displaying of Node
	public void display() 
    { 
		Node currentNode = head;
		while(currentNode != null)
		{
            System.out.print(currentNode.data + " "); 
            currentNode = currentNode.next; 
        }
        System.out.println();
    }
	
	public void findMiddleNode()
	{
		Node midElement = head;
		Node forwardElement = head; 
 
		while(forwardElement !=null) {
			forwardElement = forwardElement.next;
			if(forwardElement != null && forwardElement.next != null) { 
				midElement = midElement.next; 
				forwardElement = forwardElement.next; 
			}
		}
		System.out.println(midElement.data);
	}
}
