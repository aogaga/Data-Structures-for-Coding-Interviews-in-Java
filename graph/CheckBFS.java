public class CheckBFS{


	public static String bfs(Graph g){
			String result = "";

			if(g.vertices < 1){
				return result;
			}

			boolean[] visited = new boolean[g.vertices];


			for(int i = 0; i < g.vertices; i++){

				if(!visited[i]){

					return result + bfsVisit(g, i , visited);
				}
			}

			return result;

	}


	public static String bfsVisit(Graph g, int source, boolean[] visited){
		String result = "";

		Queue<Integer> queue = new Queue<>(g.vertices);

		queue.enqueue(source);
		visited[source] = true;


		while(){

			int current_node = queue.dequeue();
			result += String.valueOf(current_node);

			DoublyLinkedList<Integer>.Node temp = null;

			if(g.adjacentList[current_node] != null){
				temp = g.adjacentList[current_node].headNode;

				while(temp != null){
					if(!visited[temp.data]){
						queue.enqueue(temp.data);
						visited[temp.data] = true;
					}

					temp = temp.nextNode;
				}
			}
		}

		return result;
	}

}