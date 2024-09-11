package Collection;

public class Swapa {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		// op n1 = 20 & n2 = 10
		System.out.println("Before swap");
		System.out.println("N1 : " + n1);
		System.out.println("N2 : " + n2);
		int temp = n1;// temp = 10
		n1 = n2;// n1 = 20
		n2 = temp;// n2 = 10
		System.out.println("After swap");
		System.out.println("N1 : " + n1);
		System.out.println("N2 : " + n2);

	}

}
