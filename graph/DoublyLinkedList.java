public class DoublyLinkedList<T> {

	//Node inner class for DLL
	public class Node {
		public T data;
		public Node nextNode;
		public Node prevNode;
	}

	//member variables
	public Node headNode;
	public Node tailNode;
	public int size;

	//constructor
	public DoublyLinkedList() {
		this.headNode = null;
		this.tailNode = null; //null initially
		this.size = 0;
	}

	//returns true if list is empty
	public boolean isEmpty() {
		if (headNode == null && tailNode == null) //checking tailNode to make sure
			return true;
		return false;
	}

	//getter for headNode
	public Node getHeadNode() {
		return headNode;
	}

	//getter for tailNode
	public Node getTailNode() {
		return tailNode;
	}

	//getter for size
	public int getSize() {
		return size;
	}

	//insert at start of the list
	public void insertAtHead(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = this.headNode; //Linking newNode to head's nextNode
		newNode.prevNode = null; //it will be inserted at start so prevNode will be null
		if (!isEmpty())
			headNode.prevNode = newNode;
		else
			tailNode = newNode;
		this.headNode = newNode;
		size++;
	}

	//insert at end of the list
	public void insertAtEnd(T data) {
		if (isEmpty()) { //if list is empty then insert at head
			insertAtHead(data);
			return;
		}
		//make a new node and assign it the value to be inserted
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = null; //it will be inserted at end so nextNode will be null
		newNode.prevNode = tailNode; //newNode comes after tailNode so its prevNode will be tailNode
		tailNode.nextNode = newNode; //make newNode the nextNode of tailNode
		tailNode = newNode; //update tailNode to be the newNode
		size++;
	}

	//print list function
	public void printList() {
		if (isEmpty()) {
			System.out.println("List is Empty!");
			return;
		}

		Node temp = headNode;
		System.out.print("List : null <- ");

		while (temp.nextNode != null) {
			System.out.print(temp.data.toString() + " <-> ");
			temp = temp.nextNode;
		}

		System.out.println(temp.data.toString() + " -> null");
	}

	public void deleteByValue(T data) {
		//if empty then simply return
		if (isEmpty())
			return;

		//Start from head node
		Node currentNode = this.headNode;

		if (currentNode.data.equals(data)) {
			//data is at head so delete from head
			deleteAtHead();
			return;
		}
		//traverse the list searching for the data to delete
		while (currentNode != null) {
			//node to delete is found
			if (data.equals(currentNode.data)) {
				currentNode.prevNode.nextNode = currentNode.nextNode;
				if(currentNode.nextNode != null)
					currentNode.nextNode.prevNode = currentNode.prevNode;
				size--;
			}
			currentNode = currentNode.nextNode;
		}
	}

	public void deleteAtHead(){
		//if list is empty do nothing
		if(isEmpty())
			return;

		//if List is not empty then link head to the
		//nextElement of firstElement.
		headNode = headNode.nextNode;
		headNode.prevNode = null;
		size--;
	}
}
