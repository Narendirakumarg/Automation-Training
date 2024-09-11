package oops;

// Encapsulation

class Encap {
	private String userName = "user123";
	
	String getUserName() {
		return userName;
	}
	
	/*int getValueOfPI() {//getter method
		return PI;
	}
	
	void setValueOfPI(int pi) {//setter method
		PI = pi;
	}*/
	
}

public class Run1 {
	public static void main(String[] args) {
		Encap e = new Encap();
		System.out.println(e.getUserName());
		//System.out.println(e.getValueOfPI());
		//e.setValueOfPI(3);
		//System.out.println(e.getValueOfPI());
	}
}

