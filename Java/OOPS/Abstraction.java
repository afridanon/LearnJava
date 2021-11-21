// abstraction
package javaproject;
/*
 * abstract class
 * */
abstract class animal{
	String color = "red";
	abstract void name();  //abstarct method 

}
/*
 * if any class extends extends animal class(SUPER CLASS)
 * must override abstract method(MUST HAVE ABSTRaCT METHOD)
 * 
 * */
// cat class extends animal class
class cat extends animal{
	@Override             //overriding abstract method
	void name() {      //thats why name method
		System.out.println("cat");
	}
	public void color() {   //normal method
		System.out.println(super.color);
	}
}
// main class
public class Abstraction{
	public static void main(String [] args) {   //main  method of main class 
		animal a = new cat();   //cat object which belongs to animal class
		cat c = new cat();     // cat object which belong to cat class like (INHERITENCE)
		a.color();  //gives compiled time error
		/*
		 * You Can Only Access method and parameters which available in animal class
		 * */
		c.color();  // print super.color(RED)
		/*
		 * you can access any method and parameters in cat class and animal class  
		 * 
		 * */
	}
}
