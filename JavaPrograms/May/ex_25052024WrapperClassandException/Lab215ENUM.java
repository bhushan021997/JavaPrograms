package ex_25052024WrapperClassandException;

public class Lab215ENUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d1=Day.FRIDAY;
		System.out.println(d1);
		
		Size s=Size.SMALL;
		System.out.println(s);
		s.setSize("XXLL");
		System.out.println(s.getSize());

	}

}


enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String size;

    Size(String s) {
        this.size = s;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}