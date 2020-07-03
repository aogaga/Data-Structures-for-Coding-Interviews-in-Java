class PalindromeChallange{
	public static void main(String [] args){
		 DoublyLinkedList<Integer> list1 = new DoublyLinkedList<Integer>();
		list1.insertAtEnd(1);
		list1.insertAtEnd(2);
		list1.insertAtEnd(2);
		list1.insertAtEnd(1);
		System.out.print("1st ");
		list1.printList();
		DoublyLinkedList<Integer> list2 = new DoublyLinkedList<Integer>();
		list2.insertAtEnd(6);
		list2.insertAtEnd(8);
		list2.insertAtEnd(6);
		list2.insertAtEnd(6);
		System.out.print("2nd ");
		list2.printList();
		System.out.println("Is 1st list a palindrome?  " + isPalindrome(list1));
		System.out.println("Is 2nd list a palindrome?  " + isPalindrome(list2));
		 
	}


	public static <T> boolean isPalindrom(DoublyLinkedList<T> list){
	 	DoublyLinkedList<T>.Node start = list.headNode;
		DoublyLinkedList<T>.Node end = list.endNode;
		
		if(start != end ){
			return false;
		}

		if(start == null){
			return true;
		}

		while(start != null ){
			
			if(!start.data.equals(end.data)){
				return false;
			}
			
			start = start.nextNode;
			end = end.prevNode;
		}

		return true;
	}

}
