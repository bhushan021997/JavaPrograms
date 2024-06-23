package ex_25052024WrapperClassandException.Exception;

import java.io.File;
import java.io.FileReader;

public class Lab224 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String path = "C://a.txt";
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

	}

}
