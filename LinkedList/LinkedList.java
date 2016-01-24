import java.io.*;

class Node
{
	public int data;
	public Node next;
	public Node(int val)
	{
		data = val;
		next = null;
	}	
}

class LinkedList
{
	private Node head;
	public LinkedList()
	{
		head = null;
	}

	public void Add(int val)
	{
		Node newNode = new Node(val);	
		if(null == head)
		{
			head = newNode;
			
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void PrintNodes()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(Integer.toString(temp.data) + " --> ");
			temp = temp.next;
		}
		System.out.print("NULL");

	}

	public static void main(String[] args)
	{
		LinkedList myList = new LinkedList();
		myList.Add(10);
		myList.Add(20);
		myList.PrintNodes();
	}

}
