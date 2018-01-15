import com.feicui.atm.*;

public class Atm{
	public static void main(String[] args) {
		User[] user = new User[] {
			new User("111","111","Ruby"),
			new User("222","222","Wiess"),
			new User("333","333","Blake"),
			new User("444","444","Yang")
		};
		Login login = new Login();
		login.loginIn(user);
	}
}