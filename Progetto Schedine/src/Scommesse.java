
public class Scommesse {
	
	private double quotes1 =0;
	private double quotes2 =0;
	private double quotesX =0;
	private int percentage1 =0 ;
	private int percentage2 =0;
	private int percentageX=0;
	
	public Scommesse() {
		
	}
	public Scommesse(double quotes1, double quotes2, double quotesX, int percentage1, int percentage2, int percentageX) {
		super();
		this.quotes1 = quotes1;
		this.quotes2 = quotes2;
		this.quotesX = quotesX;
		this.percentage1 = percentage1;
		this.percentage2 = percentage2;
		this.percentageX = percentageX;
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
	
	public int getPercentage1() {
		return percentage1;
	}
	public void setPercentage1(int percentage1) {
		this.percentage1 = percentage1;
	}
	public int getPercentage2() {
		return percentage2;
	}
	public void setPercentage2(int percentage2) {
		this.percentage2 = percentage2;
	}
	public int getPercentageX() {
		return percentageX;
	}
	public void setPercentageX(int percentageX) {
		this.percentageX = percentageX;
	}
	
	public Scommesse calculateQuotes(int n1, int n2) {
		double q1=0, q2=0, qx=0;
		double c1=0,c2=0, cx=0;
		int p1=0, p2=0, px=0;
		
		c1 = 1 / (1 + Math.pow(10, (n2 - n1) / 400.0));
		c2 = 1.0 - c1;
		cx = 0.2 + 0.3 * Math.exp(-Math.abs(n1 - n2) / 400.0);
		
		double somma = c1 + c2 + cx;
		c1 /= somma;
		c2 /= somma;
		cx /= somma;
		
		p1 = (int)(c1 *100);
		p2 = (int)(c2 *100);
		px = (int)(cx *100);
		
		q1 = 1 / c1;
		q2 = 1 / c2;
		qx = 1 / cx;
		
		q1 = Math.round(q1 * 100.0) / 100.0;
	    q2 = Math.round(q2 * 100.0) / 100.0;
	    qx = Math.round(qx * 100.0) / 100.0;
		
		return new Scommesse(q1, q2, qx, p1, p2, px);
	}
	@Override
	public String toString() {
		return "Scommesse [quotes1=" + quotes1 + ", quotes2=" + quotes2 + ", quotesX="
				+ quotesX + ", percentage1=" + percentage1 + ", percentage2=" + percentage2 + ", percentageX="
				+ percentageX + "]";
	}
	
	
	
	
	
}
