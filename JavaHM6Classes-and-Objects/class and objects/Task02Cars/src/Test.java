import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Test {

	public static void main(String[] args) {
		
		
		Car[] cars = new Car[10];
		cars[0] = new SUV(30000, false);
		cars[1] = new SUV(40000, true);
		cars[2] = new SUV(12000, false);
		cars[3] = new SUV(50000, true);
		cars[4] = new SUV(35000, true);
		cars[5] = new Automobile(18000, 11);
		cars[6] = new Automobile(12000, 6);
		cars[7] = new Automobile(13000, 10);
		cars[8] = new Automobile(11000, 7);
		cars[9] = new Automobile(8000, 5);
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			cars[i].sayPrice();
			cars[i].sayFuel();
			
			System.out.println();
			
			
			cars[i].saySUV();
			}
		} 

		
	}


