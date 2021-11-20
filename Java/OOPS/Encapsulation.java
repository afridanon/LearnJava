package javaproject;
// Encapsulation
class bank{
	private String username = "afrid";
	private int password = 143;
	public void SetUsername(String username) {
		this.username = username;
	}
	public String GetUsername() {
		return username;
	}
	public int GetPassword() {
		return password ;
	}
	public void SetPassword(int password) {
		this.password = password;
	}
}

public class Encapsulation{
	public static void main(String [] args) {
		bank a = new bank();
	}
}
