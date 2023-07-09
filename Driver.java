
public class Driver {
	String[] driverNames = {"A", "B", "C", "D", "E"};
    String[] carModels = {"Sedan", "HatchBack", "5 Seater", "Sedan", "HatchBack"};
    double[] ratings = {4.0, 4.3, 4.8, 4.1, 4.7};
    double[] distancesFromCustomer= {500.0, 1000.0, 200.0, 700.0, 430.0};
    public void print() {
    for(int i=0;i<driverNames.length;i++) {
    	System.out.println(driverNames[i]+" "+carModels[i]+" "+ratings[i]+" "+distancesFromCustomer[i]);
    }
    }
}
	   