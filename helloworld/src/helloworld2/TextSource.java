package helloworld2;

interface TextReceiver {
	void receiveText(String text);
}

class TickerTape implements TextReceiver {
	public void receiveText(String text) {
		System.out.println("TICKER: " + text);
	}
}

public class TextSource {
	// Reference to the implemented Interface
	TextReceiver receiver;

	TextSource(TextReceiver r) {
		receiver = r;
	}

	public void sendText(String s) {
		receiver.receiveText(s);
	}

	public static void main(String[] args) {
		// Create a object of the class that implements the interface
		TickerTape tickerTape = new TickerTape();
		TextSource myCar = new TextSource(tickerTape);
		// Send a text message, which is our event.
		myCar.sendText("Hallo");
		String foo = null;
		if (foo == null) {
			throw new AssertionError("Error out!");
		}
		// assert false:"bad direction";
		// System.out.println("completed.");
	}
}