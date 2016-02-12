
public class Test {
	private static Graph g;

	public static void main(String[] args) {

		g = new Graph(6);
		g.addEdge(1, 5);
		g.addEdge(4, 1);
		g.addEdge(4, 3);
		g.addEdge(3, 6);
		System.out.println("Are the nodes neighbours? -> " + g.areConnected(1, 6));
		System.out.println("Is there a path bettween the nodes: " + 1 + " and " + 2 + " -> " + g.hasPath(1, 2));
		System.out.println("Is there a path bettween the nodes: " + 1 + " and " + 4 + " -> " + g.hasPath(1, 4));
		System.out.println("Is there a path bettween the nodes: " + 6 + " and " + 1 + " -> " + g.hasPath(6, 1));
	}
}
