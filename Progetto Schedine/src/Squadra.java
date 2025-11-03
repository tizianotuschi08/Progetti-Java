
public class Squadra {

	private String name = "";
	private boolean home=false;
	private int numPlayers = 0;
	private int strIndicator = 0;
	private int strPercentage = 0;
	private int goal=0;
	private int redCard =0;
	private int yellowCard=0;
	private int injury=0;
	private int gameWin=0;
	private int gameLost=0;
	private int gameDraw=0;
	
	public Squadra() {
		
	}
	
	public Squadra(String name, boolean home, int numPlayers, int strIndicator, int strPercentage, int goal, int redCard, int yellowCard,
			int injury, int gameWin, int gameLost, int gameDraw) {
		super();
		this.name = name;
		this.home = home;
		this.numPlayers = numPlayers;
		this.strIndicator = strIndicator;
		this.strPercentage = strPercentage;
		this.goal = goal;
		this.redCard = redCard;
		this.yellowCard = yellowCard;
		this.injury = injury;
		this.gameWin = gameWin;
		this.gameLost = gameLost;
		this.gameDraw = gameDraw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public int getStrIndicator() {
		return strIndicator;
	}

	public void setStrIndicator(int strIndicator) {
		this.strIndicator = strIndicator;
	}
	
	public void setStrPercentage(int strPercentage) {
		this.strPercentage = strPercentage;
	}
	
	public int setStrPercentage() {
		return strPercentage;
	}

	public boolean isHome() {
		return home;
	}

	public void setHome(boolean home) {
		this.home = home;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	public int getRedCard() {
		return redCard;
	}

	public void setRedCard(int redCard) {
		this.redCard = redCard;
	}

	public int getYellowCard() {
		return yellowCard;
	}

	public void setYellowCard(int yellowCard) {
		this.yellowCard = yellowCard;
	}

	public int getInjury() {
		return injury;
	}

	public void setInjury(int injury) {
		this.injury = injury;
	}

	public int getGameWin() {
		return gameWin;
	}

	public void setGameWin(int gameWin) {
		this.gameWin = gameWin;
	}

	public int getGameLost() {
		return gameLost;
	}

	public void setGameLost(int gameLost) {
		this.gameLost = gameLost;
	}

	public int getGameDraw() {
		return gameDraw;
	}

	public void setGameDraw(int gameDraw) {
		this.gameDraw = gameDraw;
	}
	
	
	
}
