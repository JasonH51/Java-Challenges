package GenericsChallenge;

public class Soccer extends Team {

	private String rules;
	private String sportName;

	public Soccer(String name, String sportName, String rules) {
		super(name);
		this.rules = rules;
		this.sportName = sportName;
	}

	public String getRules() {
		return rules;
	}

	public String getSportName() {
		return sportName;
	}

}
