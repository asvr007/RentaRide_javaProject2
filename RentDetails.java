
import java.util.Scanner;

public class RentDetails extends Driver{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Customer input
        System.out.print("Enter the ride distance (in km): ");
        double rideDistance = scanner.nextDouble();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter the requested car model: ");
        String requestedCarModel = scanner.nextLine();
        Driver d=new Driver();
        d.print();
        String selectedDriver=null;
        double minDistance=9999;
        for(int i=0;i<5;i++) {
        	if(d.carModels[i].equals(requestedCarModel)&&d.ratings[i]>=4.0&&d.distancesFromCustomer[i]<minDistance) {
        		selectedDriver=d.driverNames[i];
        		minDistance=d.distancesFromCustomer[i];
        	}
        }
        System.out.println("Driver " + selectedDriver+ " will get you to the destination.");
        double totalCharge = rideDistance * 8.0;
        System.out.println("Your charge will be Rs " + totalCharge);



	}

}