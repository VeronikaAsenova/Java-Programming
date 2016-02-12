
public class Task04Dequeue {

	private Node<Integer> beg;
	private Node<Integer> end;

	public void insertAtBeg(Integer number) {
		System.out.printf("%d will be added in the beginning\n", number);
		Node<Integer> newNode = new Node<Integer>();
		newNode.setValue(number);
		newNode.setNext(beg);
		if (beg != null) {
			beg.setPrevious(newNode);
		}
		if (beg == null) {
			end = newNode;
		}
		beg = newNode;

	}

	public void insertAtEnd(Integer number) {
		System.out.printf("%d will be added in the end\n", number);
		Node<Integer> newNode = new Node<Integer>();
		newNode.setValue(number);
		newNode.setPrevious(end);
		if (end != null) {
			end.setNext(newNode);
		}
		if (end == null) {
			beg = newNode;
		}
		end = newNode;
	}

	public void removeFromBeg() {
		if (beg == null) {
			System.out.println("You tried to delete an element but the deque is already empty!");
			return;
		}
		Node<Integer> newNode = beg.getNext();
		if (newNode != null) {
			newNode.setPrevious(null);
		}
		if (newNode == null) {
			end = null;
		}
		System.out.printf("%d will be removed from the beginning\n", beg.getValue());
		beg = newNode;
	}

	public void removeFromEnd() {
		Node<Integer> newNode = end.getPrevious();
		if (end == null) {
			System.out.println("You tried to delete an element but the deque is already empty!");
			return;
		}
		if (newNode != null) {
			newNode.setNext(null);
		}
		if (newNode == null) {
			beg = null;
		}
		System.out.printf("%d will be removed from the end\n", end.getValue());
		end = newNode;
	}

	public static void main(String a[]) {

		Task04Dequeue deque = new Task04Dequeue();
		deque.insertAtBeg(1);
		System.out.println();
		deque.insertAtEnd(2);
		System.out.println();
		deque.removeFromBeg();
		System.out.println();
		deque.removeFromBeg();
		System.out.println();
		deque.removeFromBeg();
		System.out.println();
		deque.insertAtBeg(3);
		System.out.println();
		deque.insertAtBeg(4);
		System.out.println();
		deque.insertAtEnd(5);
		System.out.println();
		deque.insertAtBeg(6);
		System.out.println();
		deque.removeFromEnd();
		System.out.println();
		deque.removeFromBeg();
	}

}

class Node<T> {

	private Node<Integer> previous;
	private Node<Integer> next;
	private Integer value;

	public Node<Integer> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<Integer> prev) {
		this.previous = prev;
	}

	public Node<Integer> getNext() {
		return next;
	}

	public void setNext(Node<Integer> next) {
		this.next = next;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}
