
public class Auditorium {
	public static char[] lettering = {'a','b','c','d','e','f','g','h','i','j','k'};
		private Seat[][] seating;
		public Auditorium(int rows, int columns){
		seating = new Seat[rows][columns];
		for(int i = 0;i<seating.length;i++){
			for(int j =0; j<seating[0].length;j++){
				seating[i][j]=new Seat();
			}
			
		}
		}
		public void setOccupied(int row, int column, String state){
			seating[row][column].setOccupation(state);
		}
		
		public String getOccupied(int row, int column){
			return seating[row][column].getOccupation();
		}
		public boolean isOccupied(int row, int column){
			return seating[row][column].getOccupation() == "R";
		}
		public String toString(){
		String result = "";
		int xx =0;
		
			
		for(int i = 0;i<seating.length;i++){
			result +=lettering[xx] + ": ";
			xx++;
			for(int j =0; j<seating[0].length;j++){
				result+=seating[i][j].getOccupation()+" ";
				
			}
			result+="\n";
		}
			
		
		
		return result;
		
}
}
