import java.util.*;

class UnionAndIntersection{
	
	public static void main(String [] args){
		
			HashSet<Integer> hashset= new HashSet<Integer>();
		  SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
			    SinglyLinkedList<Integer> list2  = new SinglyLinkedList<Integer>();
			for(int i = 0; i < 9; i++){
				list.insertAtEnd(i);
			}

			 list.insertAtEnd(0);
			 list.insertAtEnd(1);
			 list.insertAtEnd(3);
			 list.insertAtEnd(4);
			
			System.out.println("list 1 initial print");

			list.printList();
		

    for(int i = 5; i < 15; i++){
		  list2.insertAtEnd(i);
		}
		list2.insertAtEnd(7);
			list2.insertAtEnd(9);
									list2.insertAtEnd(4);
								list2.insertAtEnd(2);	
			list = union(list, list2);

		list.printList();
	 		

	}


	public static <T> SinglyLinkedList<Integer> union( SinglyLinkedList<T> lista, SinglyLinkedList<T> listb){
			SinglyLinkedList<T> result = new SinglyLinkedList<T>();

		
				SinglyLinkedList<T>.Node currentb  = listb.headNode;

				while(currentb != null){
					
					lista.insertAtHead(currentb);
					currentb = currentb.nextNode;
				}


				lista = removeDuplicates(lista);
			
				SinglyLinkedList<T>.Node final = lista.headNode;
				
				while(final != null){
					result.insertAtHead(final);
				}
			
				return result;
	
	}

	
	public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList list2){

					return null;
	}


	public static  <T> SinglyLinkedList<T>  removeDuplicates(SinglyLinkedList<T> list){

			SinglyLinkedList.Node current = list.headNode;
			SinglyLinkedList.Node duplicate = null;

			while(current != null){
				
				duplicate  = current;
				
				while(duplicate.nextNode != null){
					
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

}
