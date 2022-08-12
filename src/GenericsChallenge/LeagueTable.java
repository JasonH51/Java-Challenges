package GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LeagueTable<T extends Team> {

	private String leagueName;
	private ArrayList<T> teamList = new ArrayList<T>();

	public LeagueTable(String leagueName) {
		this.leagueName = leagueName;
	}

	public void addTeam(T team) {
		teamList.add(team);
	}

	public String getLeagueName() {
		return this.leagueName;
	}

	public void sortTeams() {
		Collections.sort(teamList, new SortByRating());

		for (T team : teamList) {
			System.out.println(team.getName() + " has rating of " + team.getRating());
		}
	}

	private class SortByRating implements Comparator<Team> {
		// Used for sorting in ascending order of
		// roll number
		public int compare(Team a, Team b) {
			return a.getRating() + b.getRating();
		}
	}
}
