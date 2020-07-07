public class Graph{

	int vertices;
	DoublyLinkedList<Integer> [] adjacencyList;

	void printGraph(){

	}
	void addEdge(int source, int destination){
		if(source < vertices && destination < vertices){
			this.adjacencyList[s]
		}
	}

	public Graph(int vertices){
		this.vertices = vertices;
		adjacencyList = new DoublyLinkedList[vertices];

		for (int i = 0; i < vertices ; i++ ) {
			adjacencyList[i] = DoublyLinkedList<>();
		}
	}
}