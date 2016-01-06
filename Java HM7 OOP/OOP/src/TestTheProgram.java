import java.lang.reflect.Array;

public class TestTheProgram {

	public static void main(String[] args) {

		Teacher teacher= new Teacher("Vladislav" , 29, 7, "History");
		
		teacher.sayHello();
		teacher.sayBye();
		teacher.CheckHomework();
		
		System.out.println();
		
		Lecturer lecturer= new Lecturer("Ivan", "Zlatev", 42, 20, "UNSS");
		
		lecturer.sayHello();
		lecturer.sayMaxLections();
		lecturer.CheckHomeworks();
		lecturer.exercises("Macroeconomics");
		lecturer.exercises("macroeconomics", 12);
		lecturer.exercises("macroeconomics", 12, "tomorrow");
		
		System.out.println();
		
		Professor professor =new Professor("Maya", "Bojeva" , 34, 7, "HTMU", "Doctor" );
		
		professor.sayDegree();
		professor.CheckHomeworks();
		professor.ConductExams();
		
		System.out.println();
		
		Assistant assistant=new Assistant("Georgi", "Georgiev", 25, 2, "Sofia University", false);
		
		assistant.sayMyName();
		assistant.CheckHomeworks();
		assistant.chekExams();
		
		System.out.println();
		
		
		SchoolTecaher schoolTeacher = new SchoolTecaher("Rayna" , 38, 12, " Music",  new String[] {"1A", "2B", "7G", "4Z",""});
		
		schoolTeacher.CheckHomewroks();
		schoolTeacher.sayClasses();
		schoolTeacher.entertain();
		
		System.out.println();
		
		CollegeTecher collegeTeacher = new CollegeTecher("Radoslav" , 41, 23, "Math" , "Foreign languages - Yordan Radichkov");
		
		collegeTeacher.CheckHomewroks();
		collegeTeacher.sayArticles();
		
		System.out.println();
		
		System.out.println("The number of the instances are: " + Person.getCounter());
		
		
		
	}

}
