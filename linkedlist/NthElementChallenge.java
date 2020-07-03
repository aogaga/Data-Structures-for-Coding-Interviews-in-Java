

class NthElementChallenge{
	
	public static void main(String [] args){
		
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();


		 sll.printList(); //list is empty
		   System.out.println("3rd element from end : " + nthElementFromEnd(sll, 3)); //will return null

		   for(int i=0; i<15; i+=2){
		   		sll.insertAtHead(i);
		   }

		    sll.printList();
		System.out.println(" Size : " + sll.size);
			System.out.println("3rd element from end : " + nthElementFromEnd(sll, 3)); //will return 4
			System.out.println("10th element from end : " + nthElementFromEnd(sll, 10));//will return null

	}



	public static <T> Object nthElementFromEnd(SinglyLinkedList<T> list, int n){
	
		int pfromBehind = (list.size) - n;

	//	System.out.println(" size from behind" + pfromBehind);
		int count = 0;
		if(pfromBehind < 0 ){
			return null;
		}

		SinglyLinkedList<T>.Node  current = list.headNode;

		while(current != null){
			if(count == pfromBehind){
//				System.out.println(count + " - " + current.data);
				return current.data;
			}
			count++;
			current = current.nextNode;
		}
		return null;
	}

}
