package LottaryGame;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		try {
			Menu.menu ();
		} catch (IOException e) {
			System.out.println("Error!!!");
			e.printStackTrace();
			
		}
		
		
	}
	

}
