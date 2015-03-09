
public class StudentAdvanced extends Advanced {

		public StudentAdvanced(int daysBefore){
			super(daysBefore);
			super.price/=2.0;
		}
		@Override
		public String toString(){
			return super.toString() + "\nStudent ID required.";
		}
}
