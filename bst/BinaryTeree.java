public class BinaryTeree{


	private Node root;

	public Node getRoot(){
		return root;
	}


	public void setRoot(Node root){
		this.root = root;
	}


	public boolean add(int value){

		if(this.isEmpty()){
			//setRoot(new Node(vale))

			Node newNode = new Node(value);
			root = newNode;
			return true;
		}



		Node currentNode = root;


		while(currentNode != null){
			Node leftChild = currentNode.getLeftChild();
			Node rightChild = currentNode.getRightChild();

			if(currentNode.getData() > value){
				// go left 

				if(leftChild == null){
					leftChild = new Node(value);
					currentNode.setLeftChild(leftChild);
					return true;
				}
				currentNode = leftChild;
			}else{

					if(rightChild == null){
						rightChild = new Node(value);
						currentNode.setRightChild(rightChild);
						return true;
					}
					currentNode = rightChild;
				}

		}

		return false;
	}


	public boolean isEmpty(){
		return root == null;
	}


	public void printTree(Node current){
		if(current == null){
			return;
		}

	 	System.out.print(current.getData() + ",");
		printTree(current.getLeftChild());
		printTree(current.getRightChild());
	}
}