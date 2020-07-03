package linkedlist;
import java.util.*;

class UnionAndIntersection{
	
	public static void main(String [] args){
		
		  HashSet<Integer> hashset= new HashSet<Integer>();
		  SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		  SinglyLinkedList<Integer> list2  = new SinglyLinkedList<Integer>();
		  SinglyLinkedList<Integer> result = new SinglyLinkedList<Integer>();

		  
		  for(int i = 0; i < 15; i++){
				list.insertAtEnd(i);
		  }
		  		
			 list.insertAtEnd(0);
			 list.insertAtEnd(1);
		     list.insertAtEnd(9);
			 list.insertAtEnd(3);
			 list.insertAtEnd(4);
			
			System.out.println("list 1 initial print");
			list.printList();


			for(int i = 7; i < 20; i++){
      			list2.insertAtEnd(i);
    		}
    		list2.insertAtEnd(7);
        	list2.insertAtEnd(9);
        	list2.insertAtEnd(4);
        	list2.insertAtEnd(2);
        	list = union(list, list2);


		System.out.println("list 2 initial print");
    		list2.printList();

    	//	result = union(list, list2);

		result = intersection(list, list2);

		System.out.println("Result size is " + result.size);
    		result.printList();



	}


	public static <T> SinglyLinkedList<T> union( SinglyLinkedList<T> list1, SinglyLinkedList<T> list2){
		
				SinglyLinkedList<T>.Node current2  = list2.headNode;

				while(current2 != null){
					
					list1.insertAtHead(current2.data);
					current2 = current2.nextNode;
				}

				//
				list1 = removeDuplicatesV2(list1);
				return list1;
	
	}
	public static <T> boolean contains(SinglyLinkedList<T> list , T data){

		SinglyLinkedList<T>.Node currentNode = list.headNode;

		while (currentNode != null){
			if(currentNode.data.equals(data)){
			   return true;
			}

			currentNode = currentNode.nextNode;
		}
		return false;
	}


	public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList list2){
		SinglyLinkedList<T> finalResult = new SinglyLinkedList<T>();

		list1 = removeDuplicatesV2(list1);
		list2 = removeDuplicatesV2(list2);
		
		SinglyLinkedList<T>.Node   currrent1 = list1.headNode;
		SinglyLinkedList<T>.Node compare = list2.headNode;

		while (currrent1 != null ){

			boolean doeContains = contains(list2, currrent1.data);
			if(doeContains){
				finalResult.insertAtHead(currrent1.data);
			}
			currrent1 = currrent1.nextNode;
		}
//		SinglyLinkedList<T>.Node temp = finalResult.headNode;
//		while (temp != null){
//			System.out.println(temp.data.toString());
//		}
		return finalResult;
	}


	public static  <T> SinglyLinkedList<T>  removeDuplicates(SinglyLinkedList<T> list){

			SinglyLinkedList.Node current = list.headNode;
			SinglyLinkedList.Node duplicate =  list.headNode;

			while(current != null){
				
				duplicate  = current;
				     if (duplicate == null) {
					 	System.out.println("d is empty");
					 }
				while(duplicate != null){
					
					if(current.data.equals(duplicate.nextNode.data)){
						current.nextNode = current.nextNode.nextNode;
						duplicate.nextNode = duplicate.nextNode.nextNode;		
					}
					duplicate = duplicate.nextNode;
				}

				current = current.nextNode;
			}

		return list;
	}


	public static <T>  SinglyLinkedList<T> removeDuplicatesV2(SinglyLinkedList<T> list) {
		SinglyLinkedList<T>.Node current = list.headNode; // will be used for outer loop
		SinglyLinkedList<T>.Node compare = null;     // will be used for inner loop

		while (current != null && current.nextNode != null) {
			compare = current;
			while (compare.nextNode != null) {
				if (current.data.equals(compare.nextNode.data)) { //check if duplicate
					compare.nextNode = compare.nextNode.nextNode;
				} else {
					compare = compare.nextNode;
				}
			}
			current = current.nextNode;

		}
		return list;
	}
}
