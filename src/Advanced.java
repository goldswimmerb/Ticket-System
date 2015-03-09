
public class Advanced extends Ticket {
	
	public Advanced(int daysBefore){
		super();
		price = getPrice(daysBefore);
	}
	
	private double getPrice(int daysBefore){
		//double result;
		if(daysBefore >= 30){return 45.00;}
		else{ return 50.00;}
		
		
	}
	public double getPrice(){ return price;}
}
