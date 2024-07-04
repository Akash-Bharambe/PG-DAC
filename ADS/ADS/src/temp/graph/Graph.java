package temp.graph;

public interface Graph<T> {
	
	void addVertex(T vertex);
	
	void addEdge(T source, T destination);
	
	void printDFS();
	
	void printBFS();
}
