package antoniofantini.addressbook;

import java.io.IOException;

public class Addressbook {
	private static final String WRONG_INPUT_MESSAGE = "Please provide the option parameter: \n '1' - to find out how many males are in the addressbook \n '2' - to find out who is the oldest person \n '3' - to count how many days there are between Bill and Paul Dates of Birth";

	public static void main(String[] args) throws IOException {
		if (args == null || args.length == 0) {
			throw new RuntimeException(WRONG_INPUT_MESSAGE);
		}
		
		
	}
}
