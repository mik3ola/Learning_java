package learning_java;

public class Grade {
	

	public static void main(String[] args) {
		studentGrade("Michael", 9);
		studentGrade("Micha", 88);
		

	}
	
	public static void studentGrade(String name, int score) {
		
		String grade;
		
				
		if (score >= 90) {
			grade = "A";
		}
		else if(score < 90 && score >= 70) {
			grade = "B";
		}
		else {grade = "D";
		}
		System.out.println("Student name = "+ name + " Grade "+ grade);
	}

}
