package linkedl;

class  DoublyLinkedList<T>{

	public class Node {
		public T data; 
		public Node prevNode;
		public Node nextNode;
	}

	public Node headNode;
	public Node tailNode; 
	public int size;

	public  DoublyLinkedList(){
		this.headNode = null;
	}

	public boolean isEmpty(){
		if(headNode == null && tailNode == null){
			return true;
		}

		return false;
	}

	public Node getHeadNode(){
		return headNode;
	}

	public Node getTailNode(){
		return tailNode;
	}

	public int getSize(){

		return size;
	}

	public void printList(){
		if(isEmpty()){
			System.out.println("List is empty");
		}

		Node temp = headNode;
        System.out.print("List : null <- ");

        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " <-> ");
            temp = temp.nextNode;
        }

        System.out.println(temp.data.toString() + " -> null");
		
	}

	public void insertAtHead(T data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = null;
		newNode.nextNode = this.headNode;

		if(headNode != null){
			headNode.prevNode = newNode;
			this.headNode = newNode;
			size++;
		}
	}


	public void insertAtHeadv2(T data){

		Node newNode = new Node();
		newNode.data = data;
		
		if(headNode == null){
			headNode = newNode;
			headNode.nextNode = null;
			headNode.prevNode = null;
		}

		newNode.prevNode = headNode;
		headNode = newNode;
		size++;
	}

	public void insertAtEnd(T data){
		if(isEmpty()){
			insertAtHead(data);
			return;
		}

		Node newNode = new Node();
		newNode.data = data;
		newNode.prevNode = tailNode;
		tailNode.nextNode = newNode;
		tailNode = newNode;
		size++;
	}

	public void deleteAtHead(){

		if(isEmpty()){
			return;
		}

		headNode = headNode.nextNode;

		if(headNode == null){
			tailNode = null;
		}else{
			headNode.prevNode = null;
		}
		size--;
	}


	 public void deleteAtTail() {
        if (isEmpty())
            return;
        tailNode = tailNode.prevNode;
        if (tailNode == null)
            headNode = null;
        else
            tailNode.nextNode = null;
        size--;
    }
}
