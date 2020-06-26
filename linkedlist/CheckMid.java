class CheckMid{
 public static void main(String [] args){
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(123);
		list.insertAtEnd(101);
		list.insertAtEnd(61);
		list.printList();
		 System.out.println("Middle element is : " + findMiddle(list));
 }

 public static <T> Object findMiddle(SinglyLinkedList<T> list) {
		if(list.isEmpty()){
			return null;
		}	

		SinglyLinkedList.Node mid = list.headNode;
		SinglyLinkedList.Node current = list.headNode;


		while(mid != null  && current != null && current.nextNode != null){
				current = current.nextNode.nextNode;
				if(current != null){
					mid = mid.nextNode;
				}
		}
		
		return mid.data;
 }



}
