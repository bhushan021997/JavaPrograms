package ex_30052024;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ttacourseList = new LinkedList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");
        System.out.println(ttacourseList);

        Vector<String> v2 = new Vector<>();
        v2.add("ATB");
        v2.add("MTB");
        v2.add("LAPIT");
        v2.add("SDET Blueprint");

        Enumeration e = v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

	}

}
