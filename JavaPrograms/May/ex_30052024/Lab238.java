package ex_30052024;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List - ArrayList, LinkedList, Vector,Stack
	    // Set - HashSet, LinkedHashSet, TreeSet
	    // Map - HashMap, LinkedHashMap, TreeMap
	    // Queue - PriorityQueue, LinkedList
	    // Hashtable, Properties

	    
	        List<String> courseList = new ArrayList<>();
	        courseList.add("ATB");
	        courseList.add("MTB");
	        courseList.add("PyATB");
	        courseList.add("LAPIB");
	        courseList.add("SDET Blueprint");

	        List numList = new ArrayList();
	        numList.add(150);
	        numList.add(100);
	        numList.add(100);
	        numList.add(399);
	        
	        //AddALL method is used to add both list together without think about data types

	        courseList.addAll(numList);
	        System.out.println(courseList);
	    }

	}


