package ch14.exam08;

public class Student {
	private String name;
	private int englicshScore;
	private int mathScore;
	
	public Student(String name, int englicshScore, int mathScore) {
		this.name = name;
		this.englicshScore = englicshScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglicshScore() {
		return englicshScore;
	}

	public void setEnglicshScore(int englicshScore) {
		this.englicshScore = englicshScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	
}
