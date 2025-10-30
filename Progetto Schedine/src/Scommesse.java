
public class Scommesse {
	
	
	private double quotes1 =0;
	private double quotes2 =0;
	private double quotesX =0;
	
	public Scommesse() {
		
	}
	public Scommesse(double quotes1, double quotes2, double quotesX) {
		super();
		this.quotes1 = quotes1;
		this.quotes2 = quotes2;
		this.quotesX = quotesX;
	}
	public double getQuotes1() {
		return quotes1;
	}
	public void setQuotes1(double quotes1) {
		this.quotes1 = quotes1;
	}
	public double getQuotes2() {
		return quotes2;
	}
	public void setQuotes2(double quotes2) {
		this.quotes2 = quotes2;
	}
	public double getQuotesX() {
		return quotesX;
	}
	public void setQuotesX(double quotesX) {
		this.quotesX = quotesX;
	}
	@Override
	public String toString() {
		return "Scommesse [quotes1=" + quotes1 + ", quotes2=" + quotes2 + ", quotesX=" + quotesX + "]";
	}
	
	public Scommesse calculateQuotes(int n1, int n2) {
		double q1=0, q2=0, qx=0;
		double p1=0,p2=0, px=0;
		
		p1 = 1 / (1 + Math.pow(10, (n2 - n1) / 400.0));
		p2 = 1.0 - p1;
		px = 0.2 + 0.3 * Math.exp(-Math.abs(n1 - n2) / 400.0);
		
		double somma = p1 + p2 + px;
		p1 /= somma;
		p2 /= somma;
		px /= somma;
		
		q1 = 1 / p1;
		q2 = 1 / p2;
		qx = 1 / px;
		
		q1 = Math.round(q1 * 100.0) / 100.0;
	    q2 = Math.round(q2 * 100.0) / 100.0;
	    qx = Math.round(qx * 100.0) / 100.0;
		
		return new Scommesse(q1, q2, qx);
	}
	
}
