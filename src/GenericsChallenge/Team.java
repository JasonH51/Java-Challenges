package GenericsChallenge;

public class Team {

	private String name;
	private int win;
	private int lose;
	private int draw;
	private int gamesPlayed;

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getWin() {
		return win;
	}

	public int getLose() {
		return lose;
	}

	public int getDraw() {
		return draw;
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setResults(Team opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			win++;
		} else if (ourScore == theirScore) {
			draw++;
		} else {
			lose++;
		}
		gamesPlayed++;
		if (opponent != null) {
			opponent.setResults(null, theirScore, ourScore);
		}

	}

	public int getRating() {
		return win * 2 + draw - lose;
	}

}
