// Inheritance

package javaproject;
// calc class only one method which is addition
class calc{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
/*
 * now we want add one more method to our project
 *it doest make sense to add one more method to calc class
 *thats why we take a class called advcalc which extends calc class
 * */
// now advcalc have two method which is add sub
class advcalc extends calc{
	public void sub(int a ,int b) {
		System.out.println(a-b);
	}
}
/*
 * now we want add one more method to our project
 *it doest make sense to add one more method to advcalc class
 *thats why we take a class called veryadvcalc which extends advcalc class
 * */
//now our class has three methods which is add , sub , mul
class veryadvcalc extends advcalc{
	public void mul(int a , int b) {
		System.out.println(a*b);
	}
}
//main class
public class jav{
	public static void main(String [] args) {  //mian method
		veryadvcalc a = new veryadvcalc();    //object of veryadvcalc
		a.add(2,3);               // perform addition operation
		a.sub(5, 2);             // performs subtraction operation
		a.mul(5, 2);            // performs multiply operatio
	}
}
