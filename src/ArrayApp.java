import java.util.HashMap;

public class ArrayApp {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };
		// a.use an array to find the frequency
		 int[] count = new int[arr.length];
		 int temp = 0;
		 for (int i = 0; i < arr.length; i++) {
		 temp = arr[i];
		 count[temp]++;
		 }
		 for (int j = 0; j < count.length; j++) {
		 if(count[j] != 0)
		 System.out.println(j+":"+count[j] );
		 }

		 System.out.println("=====================");
		 // The Big-O is O(n).
		 
		 
		// use a HashMap to find the frequency.
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (hm.containsKey(key)) {
				int value = hm.get(key);
				hm.put(arr[i], value + 1);

			} else
				hm.put(key, 1);

		}
		for (Integer key : hm.keySet()) {
			System.out.print(key);
			System.out.print(":");
			System.out.println(hm.get(key));
		}
	}
	 // The Big-O is O(n).
}
