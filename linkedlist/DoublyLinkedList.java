class DoublyLinkedList<T>{

	public class Node{
		public T data;
		public Node nextNode;
		public Node prevNode;
	}	

	public Node headNode;
	public int size;

	public DoublyLinkedList(){
		headNode = null;
	}


	public boolean isEmpty(){	
			return (headNode == null);
	}

	public void insertAtHead(T data){
		
		Node newNode = new Node();
		newNode.data = data;

		if(headNode != null){
			headNode.prevNode = newNode;
			newNode.nextNode = headNode;
		}
	
		newNode.prevNode = null;
		newNode = headNode;
		size++;
	}


	public void printList(){
		if(isEmpty()){
				System.out.println("List is Empty!");
				return;
		}

		Node temp = headNode;
		System.out.println("List : null <- ");

		while(temp.nextNode != null){
			System.out.println(temp.data.toString() + " <-> ");
			temp = temp.nextNode;
		}

		System.out.println(temp.data.toString() + "-> null");
	}


	public void deleteAtHead(){
		if(headNode == null){
			return;
		}

		headNode = headNode.nextNode;
		headNode.prevNode = null;
		size--;
	}


	public void deleteByValue(T data){
		if(isEmpty()) return;

		Node currentNode = headNode;
		
		if(currentNode.data.equals(data)){
				deleteAtHead();
				return;
		}

		while(currentNode != null){
			if(data.equals(currentNode.data)){
					currentNode.prevNode.nextNode = currentNode.nextNode;
					if(currentNode.nextNode != null)
									currentNode.nextNode.prevNode = currentNode.prevNode;
					size--;
			}
			currentNode = currentNode.nextNode;
		}
	}



}
