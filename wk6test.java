package Wk6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class wk6test {
	 public static void main(String[] args) {
	        List<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));
	        wk6 wk = new wk6();
	        wk.addAndSort((LinkedList<Integer>) list, 6);
	        wk.swapValues((LinkedList<Integer>) list, 1, 6);

	        HashMap<Integer, Integer> map = new HashMap<>();
	        map.put(0, 1);
	        map.put(1, 3);
	        map.put(2, 5);
	        map.put(3, 7);
	        map.put(4, 9);
	        map.put(5, 11);
	        wk.addNSortHash(map, 6);
	        wk.swapValuesHash(map, 1, 6);

	        List<Integer> randlist = new LinkedList<Integer>();
	        HashMap<Integer, Integer> randMap = new HashMap<>();
	        int randNo;
	        int randValToSearch = ThreadLocalRandom.current().nextInt(1000, 9999+1);

	        for (int i = 0; i < 500; i++) {
	            randNo = ThreadLocalRandom.current().nextInt(1000, 9999+1);
	            randlist.add(randNo);
	            randMap.put(i, randNo);
	        }
	        System.out.println("Index of random value in linked list: " + wk.findValue((LinkedList<Integer>) randlist, randValToSearch));
	        System.out.println("Index of random value in hash map: " + wk.findValueHash(randMap, randValToSearch));
	    }
}
