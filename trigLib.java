//Description: Trigonometric Libraries in Java
//Group: Anthony Tortola, Supreyo Atonu, Talha Fareed

public class trigLib {
    public trigLib() {}
	
            public static class trigFunctions{
		
		
		public static double Pi = 3.1415926; //Rounded Pi value
		
		
		public trigFunctions() {} //Default constructor
		
		
		public static double sin(double x){ //sin function

	        
	        x = x % (2 * Pi); //Keep the value in radians
                
	        double value = 1.0;
	              
	        double sum  = 0.0;      

	        for (int i = 1; value != 0.0; i++) {
	            value = value * (x / i);
	            if (i % 4 == 3) 
                        sum = sum - value;
                    if (i % 4 == 1) 
                        sum = sum + value;
	        }

	        return sum;
	    
	    }
		
		public static double cos(double x){ //cos function

	       
	        x = x % (2 * Pi); //Keeps the value in radians

	        
	        double value = 1.0;

                double sum  = 1.0;      

	        for (int i = 1; value != 0.0; i++) {
	            value = value * (x / i);
	            if (i % 4 == 2) 
                        sum = sum - value;
                    if (i % 4 == 0) 
                        sum = sum + value;
	        }

	        return sum;
	    
	    }
		
		
		public static double tan(double x){ //tan function
	        return cos(x)/sin(x);
	    }
		
		//converts degrees to radians
		public static double DegSin(double x){

	    }
		
                //converts degrees to radians
		public static double DegCos(double x){

	    }
		
                //converts degrees to radians
		public static double DegTan(double x){

	    }
		
	}
}
