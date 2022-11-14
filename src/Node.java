public class Node 
{
	public int data;
	public Node succNode;
	public Node nextNode;
	
	public Node(int data)
	{
		this.data = data;
		this.succNode = null;
		this.nextNode = null;
	}
}