package javaActivity2_4;

public class CustomException extends Exception{
	
	private String message;
	
	
	public CustomException(String customString) {
		
		this.message = customString;
	}
	
	@Override
	public String getMessage() {
		
		return message;
	}

}
