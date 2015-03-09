
public abstract class Ticket {
private int serialNumber;
protected double price;
private String venue = "";
private static int LastNumber =1;
//protected String name?
//Should be here because all tickets have names...?
public Ticket(){
	serialNumber = getNextSerialNumber();
	
	
}
public String getVenue(){return venue;}

public void setVenue(String v){venue = v;}
@Override
public String toString(){
	return "Serial Number: " + serialNumber + "\nvVenue: " + venue + "\nPrice: " + price;
}
private static int getNextSerialNumber(){
	return LastNumber++;
}
}
