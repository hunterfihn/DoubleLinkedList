
public class DoublyLinkedList 
{
	public Node header;
	public Node tail;
	
	public DoublyLinkedList()
	{
		this.header = null;
		this.tail = null;
	}
	
	public void append(Node newNode)
	{
		if(this.header == null)
		{
			this.header = newNode;
			this.tail = newNode;
		}
		else
		{
			this.tail.nextNode = newNode;
			newNode.succNode = this.tail;
			this.tail = newNode;
		}
	}
	
	public void prepend(Node newNode)
	{
		if(this.header == null)
		{
			this.header = newNode;
			this.tail = newNode;
		}
		else
		{
			newNode.nextNode = this.header;
			this.header.succNode = newNode;
			this.header = newNode;
		}
	}
	
	public void insertAfter(Node currNode, Node newNode)
	{
		if(this.header == null)
		{
			this.header = newNode;
			this.tail = newNode;
		}
		else if(currNode == this.tail)
		{
			this.tail.nextNode = newNode;
			newNode.succNode = this.tail;
			this.tail = newNode;
		}
		else
		{
			Node postNode = currNode.nextNode;
			newNode.nextNode = postNode;
			newNode.succNode = currNode;
			currNode.nextNode = newNode;
			postNode.succNode = newNode;
		}
	}
	
	public void removeAfter(Node currNode)
	{
		Node postNode = currNode.nextNode;
		Node succNode = currNode.succNode;
		
		if(postNode != null)
		{
			postNode.succNode = succNode;
		}
		if(succNode != null)
		{
			succNode.nextNode = postNode;
		}
		if(currNode == this.header)
		{
			this.header = postNode;
		}
		if(postNode == this.tail)
		{
			this.tail = succNode;
		}
	}
	
	public int indexOf(int input)
	{
		int count = 0;
		if(this.header == null)
		{
			return -1;
		}
		else
		{
			Node currNode = this.header;
			while(currNode != null && currNode.data != input)
			{
				count++;
				currNode = currNode.nextNode;
			}
			return count;
		}
	}
	
	public void display()
	{
        Node currNode = header;
 
        if (header == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.nextNode;
        }
 
        System.out.println();
	}
	
	public void insertionSort()
	{
		Node currNode = this.header.nextNode;
		while(currNode != null)
		{
			Node nextNode = currNode.nextNode;
			Node searchNode = currNode.succNode;
			while(searchNode != null && currNode.data < searchNode.data)
			{
				searchNode = searchNode.succNode;
			}
			removeAfter(currNode);
			if(searchNode == null)
			{
				currNode.succNode = null;
				prepend(currNode);
			}
			else
			{
				insertAfter(searchNode, currNode);
				
			}
			currNode = nextNode;
		}
	}

}
