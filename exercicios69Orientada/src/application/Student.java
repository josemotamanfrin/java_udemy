package application;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double pass = 60.00;
	
	
	
	public double finalGrade() {
		double total=  nota1 + nota2 + nota3;
		return total ;
		
	
	}
	public double missingPoints() {
		if(finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
	
	
	

}
