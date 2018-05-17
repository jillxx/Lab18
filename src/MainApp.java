
public class MainApp {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.addAtStart(4);
		list.addAtStart(2);
		list.addAtStart(3);
		list.addAtStart(2);
		list.addAtStart(5);
		list.addAtStart(2);
		list.addAtStart(2);
		list.addAtStart(1);
		list.addAtStart(2);
		System.out.println("=========adding node=======");
		list.printAllNodes();
		System.out.println("=======remove all==========");
		list.removeAll(2);
		list.printAllNodes();
		System.out.println("=========remove at index=====");

		System.out.println(list.removeAt(0)); // return true
		list.printAllNodes();
		System.out.println("=========insert============");
		System.out.println(list.insertAt(0, 8));
		list.printAllNodes();
		System.out.println(list.insertAt(2, 6));
		list.printAllNodes();
		System.out.println("======== reverese============");
		list.printReverse();

	}

}
