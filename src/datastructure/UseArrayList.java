package datastructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
        List<String> students = new ArrayList<>();
         students.add("Joshua");
         students.add("Luis");
         students.add("Mafi");
         students.add("Arif");

        System.out.println("getting elements using for each loop");
         for (Object x : students){
             System.out.println(x);
         }

        System.out.println("getting elements using Iterator and while loop");
        Iterator<String> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        students.remove(students.get(2));

        System.out.println("getting elements after using remove method using for each loop");
        for (Object y : students) {
            System.out.println(y);
        }
        System.out.println("getting elements after using remove method using Iterator and while loop");
        Iterator<String> itr = students.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }




	

	}

}
