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
    
    public void FindNthNode(int n)
    {
        
        Node temp = head;
        boolean flag = false;
        int i = 0;
        while(i< n && temp!=null)
        {
            if(i == n-1)
            {
                System.out.println("Nth node is " + Integer.toString(temp.data));
                flag = true;
            }
            
            temp = temp.next;
            i++;
        }
        if(!flag)
        {
            System.out.println("N is larger than number of nodes");
        }
    }

}

public class LinkedListTest
{
    public static void main(String[] args)
	{
		LinkedList myList = new LinkedList();
		myList.Add(10);
		myList.Add(20);
        myList.Add(30);
        myList.Add(40);
        myList.Add(50);
        myList.FindNthNode(10);
        
		
	}
}
