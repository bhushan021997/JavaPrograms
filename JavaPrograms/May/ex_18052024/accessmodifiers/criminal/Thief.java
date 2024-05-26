package ex_18052024.accessmodifiers.criminal;

import ex_18052024.accessmodifiers.police.Cop;

public class Thief {
	 public static void main(String[] args) {
		 Cop cop = new Cop(10);
	     System.out.println(cop.gun);
	     cop.canIShoot();
	     cop.display3();
	        
	}

}
