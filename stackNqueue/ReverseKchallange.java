class ReverseKChallange {

	public static void main(String [] args){
	
		Queue<Integer> queue = new Queue<Integer>(10);
		  queue.enqueue(1);
		  queue.enqueue(2);
		  queue.enqueue(3);
		  queue.enqueue(4);
		  queue.enqueue(5);
		  queue.enqueue(6);
		  queue.enqueue(7);
		  queue.enqueue(8);
	      queue.enqueue(9);
	      queue.enqueue(10);
			
		  reverseK(queue, 5);

		   System.out.print("Queue: ");
		   while(!queue.isEmpty()) {
			   System.out.print(queue.dequeue() + " ");
			}

		   System.out.println("");
	}

	public static <V> void reverseK(Queue<V> queue, int k){
		Stack<V> stack = new Stack<V>(k);
		
		int diff = queue.getCurrentSize() - k;
		
		for(int i = 0; i < k; i++){
			stack.push(queue.dequeue());
		}
	

		while(!queue.isFull()){
			queue.enqueue(stack.pop());
		}
		
		for(int i  = 0; i < diff; i++){
			queue.enqueue(queue.dequeue());
		}

	}
}
