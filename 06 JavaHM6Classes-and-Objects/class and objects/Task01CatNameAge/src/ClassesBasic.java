
public class ClassesBasic {

	public static void main(String[] args) {

		cat[] cats= new cat[10];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new cat("Deizy the "+ i, 7 + i);
		}
		
		for (cat cat : cats) {
			cat.say();
		}
	}

}
