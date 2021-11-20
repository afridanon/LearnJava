package javaproject;
/*
 * In This Chapter You Can Learn Method OverLoading
 * 
 * */
class car{                         // Created a car Class
	public  void speed(int a) {   // Speed calc And Speed Method  
		System.out.println(a);
	}
	public void speed(int a, int b) {     // Created Another Method With Two Parameters
		System.out.println(a+b);         // return Two Parameters Addition value
	}
	public void speed(int a,int b,int c) {    //Created Another Method With Three Parameters
		System.out.println(a+b+c);           // return Three Parameters Addition Value
	}
}
// Main Class
public class MethodOverloading{
	//Main Method
	public static void main(String [] args) {
		car a = new car();  // Main Object(car Object)
		a.speed(1);          // speed = 1
		a.speed(1,2);       // speed = 3
		a.speed(1,2,3);    // spedd = 6
	}
}
