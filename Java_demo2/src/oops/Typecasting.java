package oops;

//public class Typecasting {
//
//	public static void main(String[] args) {
//		int a = 135;
//		byte b = (byte)a;
//		System.out.println(b);
//	}
//
//}

// Widening Type Casting

 

//class Typecasting { 
//    public static void main(String[] args) 
//    { 
//        int i = 10; 
//  
//        // Wideing TypeCasting (Automatic Casting) 
//        // from int to long 
//        long l = i; 
//  
//        // Wideing TypeCasting (Automatic Casting) 
//        // from int to double 
//        double d = i; 
//  
//        System.out.println("Integer: " + i); 
//        System.out.println("Long: " + l); 
//        System.out.println("Double: " + d); 
//    } 
//}

// Narrow Type Casting

//Java Program to demonstrate Narrow type casting 

 

class Typecasting { 
 public static void main(String[] args) 
 { 
     double i = 100.245; 

     // Narrowing Type Casting 
     short j = (short)i; 
     int k = (int)i; 

     System.out.println("Original Value before Casting"
                        + i); 
     System.out.println("After Type Casting to short "
                        + j); 
     System.out.println("After Type Casting to int "
                        + k); 
 } 
}