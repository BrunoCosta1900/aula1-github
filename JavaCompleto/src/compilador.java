
public class compilador {

	public static void main(String[] args) {
		
		double price = 400.00;
		
		double disconto;
		
		if (price < 200.00) {
			disconto = price * 0.1;
		}
		else {
			disconto = 0;
		}
		System.out.println(disconto);

	}

}
