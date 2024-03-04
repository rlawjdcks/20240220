package spring5;

public class Greeting {
	public String getMessage(int hour) {
		String message;
		if (hour >= 17 || hour <5) {
			message ="수고많다";
		}  else if (hour <11) {
			message ="좋은아침";
		} else {
			message ="안녕";
		}
		return message;
	}
}
