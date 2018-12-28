package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(25);
        queue.add(26);
        queue.add(27);
        queue.add(28);

        System.out.println("Get elements by using for each loop");
        for (Integer X : queue){
            System.out.println(X);
        }
        System.out.println("Getting elements by using Iterator ");
        Iterator it = queue.iterator();
        while(it.hasNext()){
            int i = (Integer) it.next();
            System.out.println(i);
        }

        System.out.println("I want to peek into queue and the value is = " + queue.peek());


	}

}
