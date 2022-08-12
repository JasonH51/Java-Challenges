package GenericsChallenge;

public class Football extends Team {

	private String rules;
	private String sportName;

	public Football(String name, String sportName, String rules) {
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
