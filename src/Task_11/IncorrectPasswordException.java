package Task_11;
//QUS:6 Exception handling message.

@SuppressWarnings("serial")
public class IncorrectPasswordException extends Exception {
	
public IncorrectPasswordException(String message) {
		
		super(message);
	}


}
