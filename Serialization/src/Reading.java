import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Reading {
	
	public static void main(String[] args) {
		System.out.println("Writing objects... ");
		
		try(FileInputStream fileInput = new FileInputStream("vehicle.data")){
			
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			
			Vehicle[] vehicle = (Vehicle[])objectInput.readObject();
			ArrayList<Vehicle> vehicleList = (ArrayList<Vehicle>)objectInput.readObject();
			
			for(Vehicle myVehicles: vehicleList) {
				System.out.println(myVehicles);
			}
			
			// Commented out code is from previous lecture
			// Vehicle vehicle1 = (Vehicle)objectInput.readObject();
			// Vehicle vehicle2 = (Vehicle)objectInput.readObject();
			
			objectInput.close();
			//System.out.println(vehicle1);
			//System.out.println(vehicle2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
