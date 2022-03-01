package Wk6;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class wk6 {
    
	//Qn1
	public void addAndSort(LinkedList<Integer> list, int value) {
        System.out.println("LinkedList before : \n" + Arrays.toString(list.toArray()));
        list.addLast(value);
        Collections.sort(list);
        System.out.println("LinkedList after : \n" + Arrays.toString(list.toArray()));
    }

   
	//Qn2
    public void swapValues(LinkedList<Integer> list, int firstIndex, int secondIndex) {
        int ele1 = list.get(firstIndex);
        int ele2 = list.get(secondIndex);
        list.set(firstIndex, ele2);
        list.set(secondIndex, ele1);
        System.out.println("LinkedList swapValues at index " + firstIndex + " and " + secondIndex + ": \n"  + Arrays.toString(list.toArray()));
    }

  
    //Qn3
    public int findValue(LinkedList<Integer> list, int searchVal) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchVal) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    //Qn4
    public void addNSortHash(HashMap<Integer, Integer> map, int value) {
        System.out.println("Hashmap before addAndSort: ");
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println("\nHashmap after addAndSort: ");
        map.put(map.size(), value);
        List<Integer> sorted = new ArrayList<Integer>(map.values());
        Collections.sort(sorted);
        for (int i = 0; i < map.size(); i++) {
            map.put(i, sorted.get(i));
            System.out.print(map.get(i) + " ");
        }
        System.out.println("");
    }
    
    //Qn5
    public void swapValuesHash(HashMap<Integer, Integer> map, int firstIndex, int secondIndex) {
        int ele1 = map.get(firstIndex);
        int ele2 = map.get(secondIndex);
        map.put(firstIndex, ele2);
        map.put(secondIndex, ele1);
        System.out.println("Hashmap swapValues at index " + firstIndex + " and " + secondIndex + ": ");
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println("");
    }

    
    //Qn6
    public int findValueHash(HashMap<Integer, Integer> map, int searchVal) {
        int index = -1;
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) == searchVal) {
                index = i;
                break;
            }
        }
        return index;
    }

   
}
