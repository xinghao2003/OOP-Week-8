public class Obstacle {
	private boolean isDestructible;
	private int score;
	private char icon;

	public Obstacle(boolean isDestructible, int score, char icon) {
		this.isDestructible = isDestructible;
		this.score = score;
		this.icon = icon;
	}

	public int Score(){
		return score;
	}

	public boolean IsDestructible(){
		return isDestructible();
	}

	public char Icon(){
		return icon;
	}
}
