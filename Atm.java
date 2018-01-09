import com.feicui.atm.*;

public class Atm{
	public static void main(String[] args) {
		User user = new User();
		Login login = new Login(user);
		login.loginIn();
	}
}