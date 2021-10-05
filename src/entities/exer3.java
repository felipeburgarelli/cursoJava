package entities;

public class exer3 {
	
	public  String name;
	public double etapa1;
	public double etapa2;
	public double etapa3;
	
	public double finalGrade() {
		return etapa1 + etapa2 + etapa3;
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
