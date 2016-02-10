import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		DeviceFactory factory = DeviceFactory.getInstance();

		System.out.print("Enter device: ");
		String deviceType = input.nextLine();
		System.out.print("Enter model: ");
		String model = input.nextLine();
		System.out.print("Enter brand: ");
		String brand = input.nextLine();

		if (deviceType.equalsIgnoreCase("TABLET")) {
			System.out.print("Enter country : ");
			String country = input.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, country);
			device.sayInfo();
		} else if (deviceType.equalsIgnoreCase("PHONE")) {
			System.out.print("Enter color: ");
			String color = input.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, color);
			device.sayInfo();
		} else if (deviceType.equalsIgnoreCase("LAPTOP")) {
			System.out.print("Enter Operating System: ");
			String OperatingSystem = input.nextLine();
			Device device = factory.getDevice(deviceType, model, brand, OperatingSystem);
			device.sayInfo();
		}
		input.close();
	}

}
