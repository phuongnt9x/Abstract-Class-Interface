package clean_code;

public class TennisGame {
	public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
		String score = "";
		int tempScore = 0;
		if (scoreOfPlayer1 == scoreOfPlayer2) {
			score = isDraw(scoreOfPlayer1);
		} else {
			boolean isAdvantagePlayer1 = scoreOfPlayer1 >= 4;
			boolean isAdvantagePlayer2 = scoreOfPlayer2 >= 4;
			if (isAdvantagePlayer1 || isAdvantagePlayer2) {
				int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
				if (minusResult == 1)
					score = "Advantage player1";
				else if (minusResult == -1)
					score = "Advantage player2";
				else if (minusResult >= 2)
					score = "Win for player1";
				else
					score = "Win for player2";
			} else {
				for (int i = 1; i < 3; i++) {
					if (i == 1)
						tempScore = scoreOfPlayer1;
					else {
						score += "-";
						tempScore = scoreOfPlayer2;
					}
					switch (tempScore) {
					case 0:
						score += "Love";
						break;
					case 1:
						score += "Fifteen";
						break;
					case 2:
						score += "Thirty";
						break;
					case 3:
						score += "Forty";
						break;
					}
				}
			}
		}
		return score;
	}

	private static String isDraw(int scoreOfPlayer) {
		String score;
		switch (scoreOfPlayer) {
		case 0:
			score = "Love-All";
			break;
		case 1:
			score = "Fifteen-All";
			break;
		case 2:
			score = "Thirty-All";
			break;
		case 3:
			score = "Forty-All";
			break;
		default:
			score = "Deuce";
			break;

		}
		return score;
	}

}
