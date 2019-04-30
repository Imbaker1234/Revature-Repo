package yourworkhere;

public class CompoundCalculator {
	
	/*
		public static double calculate(double principle, double rate, int time)  { 

			
			double CI = principle * 
						(Math.pow((1 + rate / 100), time)); 
			
			return CI; 
		} 
	*/

    public static double calculate(double principle, double rate, int time) {

        double amount = principle * ((1 + rate / 100) * (1 + rate / 100) * (1 + rate / 100));

        double ci = amount - principle;

        ci = ImbConversions.CurrencyConvert(ci);

        return ci;
    }

} 
