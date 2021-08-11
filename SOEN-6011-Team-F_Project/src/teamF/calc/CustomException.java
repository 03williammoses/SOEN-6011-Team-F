package teamF.calc;

public class CustomException extends Exception{
	String message;
	public CustomException(String message) {
		this.message = message;
	}
}
