class NthElementChallenge{
	
	public static void main(String [] args){
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		 sll.printList(); //list is empty
		   System.out.println("3rd element from end : " + nthElementFromEnd(sll, 3)); //will return null

		   for(int i=0; i<15; i+=2){
		   		sll.insertAtHead(i);
		   }

		    sll.printList();
			System.out.println("3rd element from end : " + nthElementFromEnd(sll, 3)); //will return 4
			System.out.println("10th element from end : " + nthElementFromEnd(sll, 10));//will return null

	}



	public static <T> Object nthElementFromEnd(SinglyLinkedList<T> list, int n){
	
		int pfromBehind = list.size - n;

		if(pfromBehind < 0 ){
			return -1;
		}

		SinglyLinkedList<T>.Node  current = list.headNod;

		while(current != null){
			if(pfromBehind == 0){
				return current.data;
			}
			current = current.nextNode;
		}
		return null;
	}

}
