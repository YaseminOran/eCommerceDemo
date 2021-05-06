package eCommerseDemo2.core.utils;

public class Validation {
	
	public static boolean run(boolean... logics) {
   	 for(boolean b : logics) {
   		 if(!b) return false;
   	 }
   	 return true;
    }

}
