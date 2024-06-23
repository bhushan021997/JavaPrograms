package ex_28052024CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println(" - To Print Arraylist - 1 ");
        
       for (Object obj:mylist) {
    	   System.out.println(obj);
       }
       System.out.println(" - To Print Arraylist - 2 ");
       for(int i=0; i<mylist.size(); i++)
       {
    	   System.out.println(mylist.get(i));
       }
       
       System.out.println(" - To Print Arraylist - 3 ");
       
       Iterator <String> it=mylist.iterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       

	}

}
