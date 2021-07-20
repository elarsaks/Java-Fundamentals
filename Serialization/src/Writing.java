import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Writing {
	
	public static void main(String[] args) {
		System.out.println("Writing objects... ");
		
		Vehicle[] vehicle = {new Vehicle(805, "Toyota"), new Vehicle(505, "Ford"), new Vehicle(203, "Chevrolet")};
		
		ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>(Arrays.asList(vehicle));
		
		// Commented out lines are from previous lecture
		// Vehicle car = new Vehicle(369, "Toyota");
		// Vehicle truck = new Vehicle(852, "Ford");
		// System.out.println(car);
		// System.out.println(truck);
		
		try (FileOutputStream fileOutput = new FileOutputStream("vehicle.data")){
			
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			
			objectOutput.writeObject(vehicle);
			objectOutput.writeObject(vehicleList);
			
			// objectOutput.writeObject(car);
			// objectOutput.writeObject(truck);
			// objectOutput.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
