package linkedlist;

class RemoveDuplicatesChallenge{
	public static void main(String [] args){
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

		for(int i = 0; i < 9; i++){
				 list.insertAtEnd(i);
			}

		list.insertAtEnd(0);
		list.insertAtEnd(1);
		System.out.print("Before ");
		list.printList();
		removeDuplicates(list);
		System.out.print("After ");
		 list.printList();
	}


	public static <T> void removeDuplicates(SinglyLinkedList<T> list){
	

		SinglyLinkedList.Node current = list.headNode;
		SinglyLinkedList.Node dup = null;
		while(current != null){
			
				dup = current;

				while(dup.nextNode != null){
					if(dup.nextNode.data.equals(current.data)){
						dup.nextNode = dup.nextNode.nextNode;
						current.nextNode = current.nextNode.nextNode;
					}else{

						dup = dup.nextNode;
					}


					
				}

				current = current.nextNode;

		}

	}
			
}
