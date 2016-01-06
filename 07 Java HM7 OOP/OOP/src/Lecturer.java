
public class Lecturer extends Person implements CheckHomeworks {

	private String University;
	private final int maxLections = 10;

	public Lecturer() {
		setage(0);
		setFirstname("");
		setLastname("");
		setWorkExperience(0);
		setUniversity("");

	}

	public Lecturer(String Firstname, String Lastnamename, int age, int workexperience, String university) {

		this.University = university;
		this.age = age;
		this.Firstname = Firstname;
		this.Lastname = Lastname;
		this.workExperience = workexperience;

	}

	public String getUniversity() {
		return University;
	}

	public void setUniversity(String university) {
		University = university;
	}

	public int getMaxLections() {
		return maxLections;
	}

	public void sayMaxLections() {
		System.out.println("I have maximum" + getMaxLections() + "per week!");
	}

	public void sayHello() {
		System.out.println("Hello, sweethearts! Are you ready for the exam?");
	}

	public void CheckHomeworks() {
		System.out.println("I have checked the homeworks!");
	}

	public void exercises(String subject) {
		System.out.println("Today I am going to examine  you on " + subject);

	}

	public void exercises(String subject, int numbers) {
		System.out.println("Today I am going to examine  you on " + subject + " and the luckiers are: "  + numbers);
	}

	public void exercises(String subject, int numbers, String date) {
		System.out.println("Today I am going to examine  you on " + subject + " and the luckiers are" + "" +numbers
				+ "and I will tell you the assessment !" + date);
	}

	@Override
	public void CheckHomework() {
		// TODO Auto-generated method stub

	}

}
