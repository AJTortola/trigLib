//Description: Trigonometric Libraries in Java
//Group: Anthony Tortola, Supreyo Atonu, Talha Fareed

public class trigLib {
    public trigLib() {}
	
            public static class trigFunctions{
		
		
		public static double Pi = 3.1415926; //Rounded Pi value
		
		
		public trigFunctions() {} //Default constructor
		
		
		public static double sin(double x){ //sin function

	        
	        x = x / (2 * Pi); //Keep the value in radians
                
	        double value = 1.0;
	              
	        double sum  = 0.0;      

	        for (int i = 1; value != 0.0; i++) {
	            value = value * (x / i);
	            if (i / 4 == 3) 
                        sum = sum - value;
                    if (i / 4 == 1) 
                        sum = sum + value;
	        }

	        return sum;
	    
	    }
		
	}
}
