package util;

public class CurrencyConverter {

	public static double price;
	public static double quant;
	
	
	public static double IOF() {
		return 0.06 * price * quant;
	}
	
	public static double paid () {
		return price * quant + IOF();
	}
}