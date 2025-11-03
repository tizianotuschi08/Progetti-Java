
public class Partita {
	
	private Squadra sq1;
	private Squadra sq2;
	
	public Partita() {
		
	}
	
	public Partita(Squadra sq1, Squadra sq2) {
		super();
		this.sq1 = sq1;
		this.sq2 = sq2;
	}

	public Squadra getSq1() {
		return sq1;
	}

	public void setSq1(Squadra sq1) {
		this.sq1 = sq1;
	}

	public Squadra getSq2() {
		return sq2;
	}

	public void setSq2(Squadra sq2) {
		this.sq2 = sq2;
	}
	
	public Partita getResults(Squadra squadra1, Squadra squadra2, int num1, int num2) {
	    for (int i = 0; i < 10; i++) {
	        int random = (int)(Math.random() * 300);

	        if (random < num1) {
	            squadra1.setGoal(squadra1.getGoal() + 1);
	        } 
	        else if (random > (300 - num2)) {
	            squadra2.setGoal(squadra2.getGoal() + 1);
	        }
	    }

	    return new Partita(squadra1, squadra2);
	}


}
