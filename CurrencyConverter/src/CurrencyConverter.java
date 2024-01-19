import java.util.Currency;
import java.util.Scanner;
import java.util.Locale;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale[] country = Locale.getAvailableLocales();
		Locale c1 = Locale.JAPAN;
		Currency money = Currency.getInstance(c1);
		System.out.println(money);
		
		System.out.println();
	
		/*
		for(int x = 0; x < country.length; x++) {
			String countryName = country[x].getDisplayCountry();
			System.out.println(countryName);
		}
		*/
		

		
		
	}

}
