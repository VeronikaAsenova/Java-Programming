
public class Professor  extends Lecturer implements CheckHomeworks {
	
	private String degree;

	public Professor() {
		super();
		this.degree = "";
	}

	public Professor(String Firstname,String Lastnamename, int age, int workexperience, String University, String degree) {
		super(Firstname, Lastnamename, age, workexperience, University);
	this.degree=degree;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void sayDegree(){
		System.out.println("My degree is " + getDegree() + " and my work experience is: " + getWorkExperience() );
	}
	

	
	public void CheckHomeworks(){
		System.out.println("Every week I will check the homeworks!");
	}
	
	public void ConductExams(){
		System.out.println("I can conduct exams!");
	}
	
	
	
	

}
