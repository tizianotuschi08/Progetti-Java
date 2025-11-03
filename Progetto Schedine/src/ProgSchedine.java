import java.util.Scanner;

public class ProgSchedine {
	
	static Scanner input = new Scanner(System.in);
	
	static Squadra Squadra1 = new Squadra();
	static Squadra Squadra2 = new Squadra();
	
	static Partita game = new Partita();
	
	static Scommesse scom = new Scommesse();
	

	public static void main(String[] args) {
		double quota1=0, quota2=0, quotaX=0;
		int pr1=0, pr2=0, prX=0;
		
		Squadra1.setName("Roma");
		Squadra1.setStrIndicator(1800);
		
		Squadra2.setName("Lazio");
		Squadra2.setStrIndicator(1800);
		
		scom = scom.calculateQuotes(Squadra1.getStrIndicator(), Squadra2.getStrIndicator());
		
		quota1 = scom.getQuotes1();
		quota2 = scom.getQuotes2();
		quotaX = scom.getQuotesX();
		
		pr1 = scom.getPercentage1();
		pr2 = scom.getPercentage2();
		prX = scom.getPercentageX();
		
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(prX);
		
		System.out.println("Squadra1: " + Squadra1.getName() + " " + quota1 + "\nSquadra2: " + Squadra2.getName() + " " + quota2 + "\nPareggio: " + quotaX);
		
		if(game.getResults(Squadra1, Squadra2, pr1, pr2).getSq1().getGoal() > game.getResults(Squadra1, Squadra2, pr1, pr2).getSq2().getGoal()) {
			System.out.println(Squadra1.getName() + " vince! " + Squadra1.getGoal() + " goal!");
		}
		else
			System.out.println(Squadra2.getName() + " vince! " + Squadra2.getGoal() + " goal!");
		
		
	}

}
