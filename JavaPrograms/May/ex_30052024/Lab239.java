package ex_30052024;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Lab239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List - ArrayList, LinkedList, Vector,Stack
	    // Set - HashSet, LinkedHashSet, TreeSet
	    // Map - HashMap, LinkedHashMap, TreeMap
	    // Queue - PriorityQueue, LinkedList
	    // Hashtable, Properties

	    
		List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");
        ttacourseList.add(123);
        ttacourseList.add(true);
        ttacourseList.add(3.14f);

//        java.util.Iterator iterator = ttacourseList.iterator();
//        while (iterator.hasNext()) {
//            ttacourseList.add("pramod");
//            System.out.println(iterator.next());
//        }
//
//        for (Object course :ttacourseList){
//            System.out.println(course);
//        }
////
//        for (int i = 0; i < ttacourseList.size() ; i++) {
//            System.out.println(ttacourseList.get(i));
//        }
        System.out.println(ttacourseList.size());
        // List - ArrayList, LinkedList
        ListIterator lt = ttacourseList.listIterator();
        while(lt.hasNext()){
        	lt.add("EC");
System.out.println(lt.next());

        }
        
        System.out.println(ttacourseList.size());
        
       // System.out.println(ttacourseList);
        
        //System.out.println(ttacourseList);
//        
//        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
//        while(lt2.hasPrevious()){
//            //ttacourseList.add("Gen AI");
//            lt2.add("Gen AI");
//            System.out.println(lt2.hasPrevious());
//        }

//        System.out.println(ttacourseList);

	    }

	}


