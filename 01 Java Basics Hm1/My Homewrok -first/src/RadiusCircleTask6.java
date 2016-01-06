import java.util.Scanner;

public class RadiusCircleTask6 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Please enter a radius of circle: ");
		int CircleRadius= input.nextInt();
		
		float Pi= 3.14f;
		
		Float S= (Pi*(CircleRadius*CircleRadius));
		
		
		System.out.println(S);
		
		Float P = (2*(Pi*CircleRadius));
		System.out.println(P);
		
		input.close();

	}

}
