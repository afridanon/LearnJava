//securing the data(sensitive data )

package javaproject;
// Encapsulation
class bank{
	private String username = "afrid";     // sensitive username 
	private int password = 143;          //sensitive password
	public void SetUsername(String username) {              //method to change username
		this.username = username;
	}
	public String GetUsername() {                     //method to get username for validation
		return username;
	}
	public int GetPassword() {                      //       method to get password
		return password ;
	}
	public void SetPassword(int password) {               //method to change password
		this.password = password;
	}
}
 
public class Encapsulation{             //main class
	public static void main(String [] args) {                    //main method of main class
		bank a = new bank();                  //object
	}
}
