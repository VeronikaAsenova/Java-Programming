package Town;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		HashSet<Town> town = new HashSet<Town>();
		Town Vidin = new Town("Vidin", "Bulgaria", 382737);
		Town Paris = new Town("Paris", "France", 65031813);
		Town Burgas = new Town("Burgas", "Bulgria", 219606);
		Town Kusadasi = new Town("Kusadasi", " Turkey", 314300);
		Town Varna = new Town("Varna", "Bulgaria", 330000);
		
		
		town.add(Vidin);
		town.add(Paris);
		town.add(Burgas);
		town.add(Kusadasi);
		town.add(Varna);
		
		System.out.println(town.contains(Varna));
		town.remove(Varna);
		System.out.println(town.toString());
	}

	
}
