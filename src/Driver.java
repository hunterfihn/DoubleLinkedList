public class Driver 
{
	public static void main(String[] args) 
	{
		DoublyLinkedList list = new DoublyLinkedList();
		Node nA = new Node(15);
		Node nB = new Node(23);
		Node nC = new Node(96);
		Node nD = new Node(43);
		Node nE = new Node(5);
		Node nF = new Node(18);
		Node nG = new Node(59);
		Node nH = new Node(72);
		
		list.append(nA);
		list.append(nB);
		list.append(nC);
		list.append(nD);
		list.append(nE);
		list.append(nF);
		list.append(nG);
		list.append(nH);
		
		System.out.println("unsorted list: ");
		list.display();
		System.out.println("sorted list: ");
		list.insertionSort();
		list.display();
	}

}
