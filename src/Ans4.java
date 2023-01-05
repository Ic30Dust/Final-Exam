public class Quiz {
	private double totalScore;
	private double maxScore;

	public Quiz(double totalScore, double maxScore) {
		this.totalScore = totalScore;
		this.maxScore = maxScore;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(double totalScore) {
		this.totalScore = totalScore;
	}

	public double getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(double maxScore) {
		this.maxScore = maxScore;
	}

	public double grade() {
		return totalScore / maxScore;
	}
}
