package ex_28052024CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab232 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		// List mylist1 = new List();
        // List is an interface , can you create object of List interface?
        // List mylist2 = new ArrayList();
        // List is an interface , can you create object of ArrayList class?
        List mylist = new ArrayList();
        ArrayList mylist1 = new ArrayList();
        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll
        mylist.add("Bhushan");
        mylist.add("Bhura");
        mylist.add("Mahesh");
        mylist.add("Abhilash");
        mylist.add("Vijay");
        
//        System.out.println(mylist);
//        System.out.println(mylist.size());
//        
//        mylist.remove("Vijay");
//        // Removes the first occurrence of the specified element from this list,
//        System.out.println(mylist);
//        
////        mylist.clear();
////        System.out.println(mylist);
////        System.out.println(mylist.isEmpty());
//        mylist.add("Pramod");
//        mylist.add("Anusha");
//        mylist.add("Kiran");
//        mylist.add("Pramod"); // Duplicate
//        mylist.add("Pramod");
//        System.out.println(mylist);
//        mylist.add("Dutta");
//        System.out.println(mylist);
//        
//        mylist.set(0, "Viajy");
//        
//        mylist.add(123);
//        mylist.add(true);
//        System.out.println(mylist);
//
//        System.out.println(" ------ ");
//        System.out.println(mylist);
//        
        //for each
        
//        for (int i=0; i<mylist.size();i++)
//        {
//        	System.out.println(mylist.get(i));
//        }
        
        for (Object oj: mylist)
        {
        	System.out.println(oj);
        }


	}

}
