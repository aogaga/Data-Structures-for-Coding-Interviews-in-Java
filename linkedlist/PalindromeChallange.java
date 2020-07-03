class PalindromeChallange{
	public static void main(String [] args){
		 DoublyLinkedList<Integer> list1 = new DoublyLinkedList<Integer>();
		 
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
