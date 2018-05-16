
/**
 * @author Jill Xu
 *
 */
public class LinkedList {
	private Node head;
	private Node current;// this will have current value
	public int count;

	public LinkedList() {
		head = new Node();
		current = head;

	}

	public void addAtStart(Object data) {
		Node newNode = new Node();
		newNode.value = data;
		newNode.next = head.next;// new node will have a reference of the head's next reference
		head.next = newNode;// now the head will refer to the newNode
		count++;

	}

	public void removeAll(Object o) {// remove all occurrences of Object o from the list

		Node removeNode = new Node();
		while (current.next != null) {
			// System.out.println(current.next.value);

			if (current.next.value.equals(o)) {
				removeNode = current.next;
				current.next = removeNode.next;
				// System.out.println("after: "+ current.next.value);
				count--;
			} else {
				current = current.next;
			}
			if (current.next == null)
				break;
		}

	}

	public boolean removeAt(int index) {
		Node removeNode = new Node();
		current = head;
		for (int i = count - 1; i >= 0; i--) {

			if (i == index) {
				removeNode = current.next;
				current.next = removeNode.next;
				count--;
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void printReverse() {
		current = head;
		Node previous = null;
		while (current != null) {
			Node next = current.next; // store next item
			current.next = previous;// swap nodes
			previous = current;// increment
			current = next;
		}
		head = previous;
		// print
		Node curr = head;
		System.out.println("Head -->");
		while (curr.next != null) {
			System.out.println(curr.value);
			curr = curr.next;
			System.out.println("-->");
		}
		System.out.println("NULL");
	}

	public boolean insertAt(int index, Object o) {
		return false;

	}

	public void printAllNodes() {
		System.out.println("Head -->");
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value);
			System.out.println("-->");
		}
		System.out.println("NULL");
	}

	// ================================================================

	public void removeFromStart() {
		if (count == 1) {
			head = null;
			current = null;
			count = 0;
		}
		if (count > 1) {
			head = head.next;
			count--;
		} else {
			System.out.println("There are no elements in the list!");
		}
	}

}
