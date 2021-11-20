package javaproject;
/*
 * In this Chapter You Can learn Constructor OverLoading 
 * Important Topic In OOPS Concept 
 * */


class calc{             //created a calc Class
	public calc(int a) {         //First Constructor taking only one parameter
		System.out.println(a);
	}
	public calc(int a,int b) {        //second Constructor taking two parameters
		System.out.println(a + "  "+b);
	}
	public calc(int a,int b,int c) {  // third Constructor taking Three parameters
		System.out.println(a +"   " + b +"   "+c);
		
	}
}

// main class
public class ConstructorOverloading {
	// main method
	public static void main(String args) {
		calc a = new calc(1);         // calling first constructor
		calc b = new calc(1,2);      // calling second constructor
		calc c = new calc(1,2,3);   // calling third constructor
		
	}
}
