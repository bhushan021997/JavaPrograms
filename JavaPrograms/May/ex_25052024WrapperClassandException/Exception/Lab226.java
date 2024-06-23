package ex_25052024WrapperClassandException.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int a = 10/0; //UnChecked - JVM don't know?
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f = new FileReader(new File("c://a.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

	}

}
