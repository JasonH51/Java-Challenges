package Challenges;

public class CodeBlocksChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gameover = true;
		int score = 1000;
		int levelCompleted = 5;
		int bonus = 20;
		
		if(gameover) {
			int finalScore = score +(levelCompleted * bonus);
			System.out.println("Your final score is " + finalScore);
			
			score = 10000;
			levelCompleted = 8;
			bonus = 200;
			
			System.out.println("score set to " + score);
			System.out.println("levelCompleted set to " + levelCompleted);
			System.out.println("bonus set to " + bonus);
			
			displayHighScore("Jason", calcHighScore(1100));
			displayHighScore("Jason", calcHighScore(800));
			displayHighScore("Jason", calcHighScore(110));
			displayHighScore("Jason", calcHighScore(90));
			
		}
	}
	
	public static int calcHighScore(int playerScore) {
		if (playerScore > 1000) {
			return 1;
		} else if (playerScore > 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore > 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}
	
	public static void displayHighScore(String name, int position) {
		System.out.println(name + " managed to get in to position " + position + " on the high score table.");
	}

}
