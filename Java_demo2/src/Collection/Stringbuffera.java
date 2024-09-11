package Collection;

public class Stringbuffera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is my Java class";

		String strArr[] = str.split(" ");
		for (String ch : strArr) {
			StringBuilder sb = new StringBuilder(ch);
			System.out.print(sb.reverse() +" ");
		}
	}

}
