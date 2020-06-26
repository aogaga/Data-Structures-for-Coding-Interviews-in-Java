class SinglyLinkedList<T>{

		public class Node{
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
			return (headNode == null);
		}

		public void insertAtHead(T data){
			
			Node newNode = new Node();
			newNode.data = data;

			newNode.nextNode = headNode;
			headNode = newNode;
			size++;
		}


		public void printList(){
				if(isEmpty()){
					System.out.println("List is Empty");
					return;
				}

				Node temp = headNode;
				System.out.println("List: ");

				while(temp.nextNode != null){
					System.out.println(temp.data.toString() + " -> ");
					temp = temp.nextNode;
				}	

				System.out.println(temp.data.toString() + " -> null");

		}


	public void insertAtEnd(T data) {
		
		Node newNode = new Node();
		newNode.data = data;

		if(headNode == null){
			insertAtHead(data);
			return;
			}

		Node tempNode = headNode;

		while(tempNode.nextNode != null){

				tempNode = tempNode.nextNode;

		}

		tempNode.nextNode = newNode;
		size++;

	}	

	public void insertAfter(T data, T previous){
			Node newNode = new Node();
			newNode.data = data;

			Node tempNode = headNode;

			while(tempNode != null){
				
					if(tempNode.data.equals(previous)){
						newNode.nextNode = tempNode.nextNode;
						tempNode.nextNode = newNode;
						size++;
						return;
					}else{

						tempNode = tempNode.nextNode;

					}
			}
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

   public void deleteAtHead() {
			if(headNode == null){
				return;				
			}

			headNode = headNode.nextNode;

	 }


	public void deleteByValue(T data){
		
		Node tempNode = headNode;
		if(headNode.data.equals(data)){
			deleteAtHead();
			return;
		}
		while(tempNode != null){
			if(tempNode.nextNode.data.equals(data)){
				Node nodeToDelete = tempNode.nextNode;
				tempNode.nextNode = nodeToDelete.nextNode;
				size--;
				return;
			}

			tempNode = tempNode.nextNode;

		}
	}

	
	public int length(){
		Node temp = headNode;
		int counter = 0;

		while(temp != null){
			counter++;
			temp = temp.nextNode;
		}

		return counter;
	}




}
