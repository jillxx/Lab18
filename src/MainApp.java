
public class MainApp {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

		list.addAtStart(4);
		list.addAtStart(2);
		list.addAtStart(3);
		list.addAtStart(2);
		list.addAtStart(2);
		list.addAtStart(2);
		list.addAtStart(2);
		list.addAtStart(1);
		list.addAtStart(2);

		//list.printAllNodes();
		list.removeAll(2);
        System.out.println("test====================");
		//list.removeAt(0);
		System.out.println(list.removeAt(2));
		System.out.println("test====================");
      
		
		list.printAllNodes();
		//list.printReverse();

	}

}
