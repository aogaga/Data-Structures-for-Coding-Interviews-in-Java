class SinglyLinkedList<T>{

	public class Node {
		public T data;
		public Node nextNode;
	}


	public Node headNode;
	public int size;

	public SinglyLinkedList(){
		headNode = null;
		size = 0;
	}

	public boolean isEmpty(){
		if(headNode == null){
			return true;
		}
		return false;
	}

	public void insertAtHead(T data){

		Node newNode = new Node();
		newNode.data = data;

		if(headNode == null){
			headNode = newNode;
		}{
			newNode.nextNode = headNode;
		headNode = newNode;
		}

		
		size++;
	}

	public void printList(){
		if(isEmpty()){
			System.out.println("List is isEmpty");
			return;
		}

		Node temp = headNode;
		System.out.println("List");

		while(temp.nextNode != null){
			System.out.println(temp.data.toString() + "-> ");
			temp = temp.nextNode;
		}

		System.out.println(temp.data.toString() + "-> null");
	}


	public void insertAtEnd(T data){
		Node newNode = new Node();
		newNode.data = data;
		if(headNode == null){

			insertAtHead(data);
			return;

		}else{

			Node tempNode = headNode;

			while(tempNode.nextNode != null){

				tempNode = tempNode.nextNode;
			}


			tempNode.nextNode = newNode;

			size++;
		}
		
	}


	public void insertAfter(T data, Node previous){

		Node newNode = new Node();
		newNode.data = data;



		Node tempNode = headNode;

		while(tempNode != null && !tempNode.data.equals(previous.data)){

			tempNode = tempNode.nextNode;
		}


		newNode.nextNode = tempNode.nextNode;
		tempNode.nextNode = newNode;
		size++;

	}


	public boolean searchNode(T data){
		Node tempNode = headNode;
		while(tempNode != null){

			if(tempNode.data.equals(data)){
					return true;
			}
			
			tempNode = tempNode.nextNode;
		}

		return false;
	}

	public  void deleteAtHead(){

		if(headNode != null){
			headNode = headNode.nextNode;
			size--;
		}

	}


	public void deleteByValue(T data){

		Node tempNode = headNode;

		if(tempNode.data.equals(data)){
			deleteAtHead();
		}

		while(tempNode.nextNode != null){

			if(tempNode.nextNode.data.equals(data)){
				Node tempNextNode = tempNode.nextNode;

				tempNode.nextNode = tempNextNode.nextNode;
				tempNextNode = null;
				size--;	
				return; 
			}
		}
	}



	public int length(){
		int count = 0;

		Node node = headNode;

		while(node != null){
			count++;
			node = node.nextNode;
		}
		return count;
	}


	public Static void reverse(SinglyLinkedList<T> list){
		
		Node previous = null;
		Node currrent = list.headNode;
		Node next = null;

		while(currrent != null){
			next = currrent.nextNode;
			currrent.nextNode = previous;
			previous = currrent;
			currrent = next;
		}

		list.headNode = previous;

    }
		public static <T> void reverseV2 (SinglyLinkedList<T> list){

			Node first = headNode;
			Node secondNode = first.nextNode;

			if(headNode.nextNode == null){
				return headNode;
			}

			while(secondNode != null){
				Node temp = secondNode.nextNode;

				second.nextNode = first;
				first = secondNode;
				secondNode = temp;
					
				
			}

		}


	public static <T> boolean detectLoop(SinglyLinkedList<T> list){}
	
}


1->2->3->4->5