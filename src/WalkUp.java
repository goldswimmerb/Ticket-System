
public class WalkUp extends Ticket {
	//protected double price;
	
	public WalkUp(){
		price = 50.0;
	}
	//public void setName(String n){name = n;}
	
	//public String getName(){return name;}
	public double getPrice() { return price;}
	
	public String toString(){
		return super.toString();
	}
}
