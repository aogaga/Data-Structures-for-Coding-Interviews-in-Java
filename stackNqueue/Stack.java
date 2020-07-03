class Stack<T>{

	private int maxSize;
	private int top;
	private V arr[];

	
	@SuppressWarnings("unchecked")
	public Stack(int max_size){
		maxSize = max_size;
		top  = -1;
		arr = (V[]) new Object[max_size];
	}

	public int getCapacity(){
		return maxSize;
	}


	public boolean isEmpty(){
		return (maxSize == -1);
	}




}
