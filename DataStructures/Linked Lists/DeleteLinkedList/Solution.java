// Deletion of linkedlist

public class DeleteLinkedList {
	
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
	
	Node head;
	
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
	
	public void deleteFront()
	{
		Node temp = head;
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else if (head.next == null)
		{
			System.out.println("Deleted node: " + head.data);
			head = null;
			return;
		}
		else
		{
			System.out.println("Deleted node: " + head.data);
			head = head.next;
			temp = null;
		}
	}	
}