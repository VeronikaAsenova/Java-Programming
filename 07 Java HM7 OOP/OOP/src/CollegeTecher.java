
public class CollegeTecher extends Teacher {

	private String College;

	public CollegeTecher() {
		super();
		College = "";
	}

	public CollegeTecher(String name, int age, int workExperience, String subject,String College) {
		super(name, age, workExperience, subject);
		this.College=College;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}
	
	public void CheckHomewroks() {
		System.out.println("I can check homeworks! ");
	}
	
	public void sayArticles(){
		System.out.println("I can write scientific articles");
	}
	
	
	
	
}
