package GenericsChallenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeagueTable<Football> leagueTable = new LeagueTable<Football>("Soccer");
//		Soccer soccerTeam = new Soccer("teamName", "soccer", "somerules here");
		Football footballTeam = new Football("Name", "Football", "somerules here");
		Football footballTeam1 = new Football("Name1", "Football", "somerules here");
		Football footballTeam2 = new Football("Name2", "Football", "somerules here");
		Football footballTeam3 = new Football("Name3", "Football", "somerules here");
		Football footballTeam4 = new Football("Name4", "Football", "somerules here");

		leagueTable.addTeam(footballTeam);
		leagueTable.addTeam(footballTeam1);
		leagueTable.addTeam(footballTeam2);
		
		footballTeam.setResults(footballTeam4, 2, 0);
		footballTeam.setResults(footballTeam1, 32, 0);
		footballTeam.setResults(footballTeam2, 2, 5);
		footballTeam.setResults(footballTeam3, 1, 0);
		
		footballTeam1.setResults(footballTeam4, 12, 10);
		footballTeam1.setResults(footballTeam, 2, 10);
		footballTeam1.setResults(footballTeam2, 2, 15);
		footballTeam1.setResults(footballTeam3, 11, 0);
		
		footballTeam2.setResults(footballTeam4, 24, 0);
		footballTeam2.setResults(footballTeam1, 3, 04);
		footballTeam2.setResults(footballTeam, 2, 54);
		footballTeam2.setResults(footballTeam3, 14, 0);
		
		leagueTable.sortTeams();
	}

}
