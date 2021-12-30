package OOP.assigment.Object;

public class Student {
	private int idStudent;
	private String name;
	private double scoreMath;
	private double scoreEnglish;
	private double scoreLiterature;
	private double scoreAveg;
	
	
	// ===GETTER SETTER===//

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScoreMath() {
		return scoreMath;
	}

	public void setScoreMath(double scoreMath) {
		this.scoreMath = scoreMath;
	}

	public double getScoreEnglish() {
		return scoreEnglish;
	}

	public void setScoreEnglish(double scoreEnglish) {
		this.scoreEnglish = scoreEnglish;
	}

	public double getScoreLiterature() {
		return scoreLiterature;
	}

	public void setScoreLiterature(double scoreLiterature) {
		this.scoreLiterature = scoreLiterature;
	}

	
	public double getScoreAveg() {
		this.scoreAveg = (double)(scoreMath + scoreEnglish + scoreLiterature)/3;
		return scoreAveg;
	}

	
//	public void setScoreAveg(double scoreAveg) {
//		
//		this.scoreAveg = scoreAveg;
//	}

	
	
	
	//==CONSTRUCTOR==//
	
	public Student() {
		
	}

	public Student(int idStudent, String name, double scoreMath, double scoreEnglish, double scoreLiterature) {
		
		this.idStudent = idStudent;
		this.name = name;
		this.scoreMath = scoreMath;
		this.scoreEnglish = scoreEnglish;
		this.scoreLiterature = scoreLiterature;
	}

	// ===METHODS===//

	public String Rank() {
		if (scoreAveg >= 8.5) {
			return "Giỏi";
		} else if (scoreAveg >= 6.5) {
			return "khá";
		} else if (scoreAveg >= 5.0) {
			return "trung bình";
		} else if (scoreAveg >= 3.5) {
			return "yếu";
		} else {
			return "kém";
		}
	}

	public void Showinfo() {
		System.out.println("ID Hoc Sinh" + getIdStudent() + "\nHo va Ten" + getName() + "\nĐiểm Toán " + getScoreMath()
				+ "\nĐiểm Văn " + getScoreLiterature() + "\nĐiểm Anh " + getScoreEnglish());
	}


	// Xét học bổng
	public void CheckschoolShip() {
		String check = Rank().toLowerCase();
		if (check.equals("giỏi")) {
			System.out.println("có học bổng");
		} else {
			System.out.println("không có học bổng");
		}
	}

	// Xét lên lớp
	public void Pass() {
		if (scoreAveg > 5) {
			System.out.println("Được lên lớp");
		} else if (scoreAveg >= 3.5) {
			System.out.println("Phải thi lại");
		} else {
			System.out.println("Ở lại lớp");
		}
	}
	
//	//tinh diem trung binh
//	public double CalscoreAveg() {
//		double score = ((double)(getScoreEnglish()+getScoreLiterature()+getScoreMath()/3));
//		return score;
//	}
}
