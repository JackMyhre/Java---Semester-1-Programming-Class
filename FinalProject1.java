package FinalProject;
//Help Received: previous code -Jack Myhre

public class FinalProject1 {
     
	
	public static int roll(int n) {
		
		
		double oneRoll = 1 + Math.random() * 6 ;
		n += oneRoll;
		
		return n;
	}
	
	
	public static int playTurnRoll(int maxRolls) {
			int n = 0;
			int score = 0;
		for(int rolls = 0; rolls <= maxRolls; rolls++) {
			score+=roll(n);
			
			if(roll(n) == 1) {
				score = 0;
				break;
			}
			
		}
		
		return score;
	
	}
	
	public static int playTurnScore(int maxScore, int currentScore) {
		int n = 0;
		int pointTotal = 0;
		
	for(int score = 0; score <= maxScore; score++) {
		pointTotal+=roll(n);
		
		if(pointTotal >= maxScore) {
			break;
		}
		
		if(roll(n) == 1) {
			pointTotal = 0;
			break;
		}
		if(currentScore >= 100) {
			break;
		}
		currentScore += pointTotal;
	}
		return pointTotal;
}
	
	public static int playGame1Player(int turnNumbers) {
		
		int maxScore = 18;
		
		for(int currentScore = 0; currentScore <= 100; currentScore += playTurnScore(maxScore, currentScore)){
			turnNumbers++;
		
		}
		return turnNumbers;
	}
	
	public static int playGame(int player1Score, int player2Score) {
		 player1Score = 0;
		 player2Score = 0;
		 int maxScore = 18;
		 int currentScore = 0;
		 int winner = 0;
		 while(winner == 0) {
			player1Score+=playTurnScore(maxScore, currentScore);
			player2Score+=playTurnScore(maxScore, currentScore);
			
			if(player1Score >= 100) {
				winner = 1;
				break;
			}
			if(player2Score >= 100) {
				winner = 2;
				break;
			}
		 }
		
		return winner;
	}
	public static void main(String[] args) {
		int player1Score = 0;
		int player2Score = 0;
					
			double player1Win = 0;
			double player2Win = 0;
			for(double i = 1; i <= 1000000; i++) {
				if(playGame(player1Score,player2Score) == 1) {
					player1Win++;
				}
				if(playGame(player1Score,player2Score) == 2) {
					player2Win++;
				}
			}
			
			double player1Avg = (player1Win / 1000000) * 100;
			double player2Avg = (player2Win / 1000000) * 100;
			System.out.println("Player 1 average = " + player1Avg);
			System.out.println("Player 2 average = " + player2Avg);
		}	
	}	
	

