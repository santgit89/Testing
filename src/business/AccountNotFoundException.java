package business;

@SuppressWarnings("serial")
public class AccountNotFoundException extends RuntimeException {
	@Override
	public String toString() {
		
		return "account is not valid";
	}
}
