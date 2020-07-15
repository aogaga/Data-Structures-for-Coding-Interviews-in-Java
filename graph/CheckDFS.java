public class CheckDFS{

	public static String dfs(Graph g){

		String result = "";

		if(g.vertices < 1){
			return result;
		}

		boolean[] visited = new boolean[g.vertices];

		for(int i = 0; i < g.vertices; i++){

			if(!visited[i]){

				result = result + dfsVisit(g, i, visited);
			}
		}


		return result;
	}


	public static String dfsVisit(Graph g, int source, boolean[] visited){

		String result = [];

		Stack<Integer> stack = new Stack<Integer>(g.vertices);
		stack.push(source);

		while(!stack.isEmpty()){

			int current_node = stack.pop();
			result += String.valueOf(current_node);

			DoublyLinkedList<Integer>.Node temp = null;

			if(a.adjacencyList[current_node] != null){
				temp = g.adjacencyList[current_node].headNode;

				while(temp != null){

					if(!visited[temp.data]){
						stack.push(temp.data);
					}

					temp = temp.nextNode;
				}


				visited[current_node] = true;
			}
		}
	}
}