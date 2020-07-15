class Node {

	private int data;
	private Node leftChild;
	private Node rightChild;


	public Node(int value){
		this.data = value;
		leftChild = null;
		rightChild = null;
	}


	public Node getLeftChild(){
		return leftChild;
	}

	public Node getRightChild(){
		return rightChild;
	}


	public int getData(){
		return data;
	}


	public void setData(int value){
		data = value;
	}

	public void setLeftChild(Node left){
		leftChild = left;
	}

	public void setRightChild(Node right){
		rightChild = right;
	}
}