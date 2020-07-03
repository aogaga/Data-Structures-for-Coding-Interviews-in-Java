package linkedlist;

class LinkedList<T>{

	public class Node{
		public T data;
		public Node nextNode;
	}


	public Node headNode;
	public int size;

	public LinkedList(){
		headNode = null;
		size = 0;
	}

}
