package temp.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjList<T> implements Graph<T> {

	private List<List<T>> graph;
	private int vertexCount;
	private boolean isDirected;
	private boolean[] isVisited;
	
	
	
	
	public GraphAdjList(int vertexCount, boolean isDirected) {
		this.vertexCount = vertexCount;
		this.isDirected = isDirected;
		
		this.isVisited = new boolean[vertexCount];
		this.graph = new ArrayList<List<T>>();
		
		for (int i = 0; i < vertexCount; i++) {
			isVisited[i] = false;
			graph.add(new ArrayList<T>());
		}
		
	}

	@Override
	public void addVertex(T vertex) {
		
	}

	@Override
	public void addEdge(T source, T destination) {
		
	}

	@Override
	public void printDFS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBFS() {
		// TODO Auto-generated method stub
		
	}

}
