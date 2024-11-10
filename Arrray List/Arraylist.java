package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
//		adding elements to the ArrayList
		list.add(12);
		list.add(87);
		list.add(45);
		
//		Displaying the data
		System.out.println(list);
		
//		getting the elements from the ArrayList
		System.out.println(list.get(1));

//		Adding element between elements
		list.add(1,100);
		System.out.println(list);
		
//		Updating the Existing elements
		list.set(0, 900);
		System.out.println(list);

//		Removing elements from the ArrayList
		list.remove(0);
		System.out.println(list);

//		Size of the ArrayList
		System.out.println(list.size());
		
//		Sorting the ArrayList
		Collections.sort(list);
		System.out.println(list);
		
//		Looping through ArrayList
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
