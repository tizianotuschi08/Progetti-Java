import java.util.Scanner;

public class ProgSchedine {
	
	static Scanner input = new Scanner(System.in);
	
	static Squadra Roma = new Squadra("Roma",false,28,1800,0,0,0,0,0,0,0);
	static Squadra Lazio = new Squadra("Lazio",false,28,1500,0,0,0,0,0,0,0);
	static Squadra Napoli = new Squadra("Napoli",false,28,1800,0,0,0,0,0,0,0);

	static Scommesse scom = new Scommesse();

	public static void main(String[] args) {
		
		scom = scom.calculateQuotes(Roma.getStrIndicator(), Lazio.getStrIndicator());
		
		
		
	}

}
