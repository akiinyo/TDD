public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	String currency() {
		return currency;
	}
}
