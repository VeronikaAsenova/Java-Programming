import java.util.HashSet;
import java.util.Set;

public class Node {
	private Set<Node> neighbours;

	public Node() {
		neighbours = new HashSet<Node>();
	}

	public void addNeighbour(Node n) {
		neighbours.add(n);
	}

	public Set<Node> getNeighbours() {
		return neighbours;
	}
}
