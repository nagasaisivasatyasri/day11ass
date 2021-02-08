package satya;

public class NoCustomerExistsException extends Exception {
	NoCustomerExistsException(String message)
	{
		super(message);
	}
}
