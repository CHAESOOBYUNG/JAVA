package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		   /*
		   int x = 5; 
		   double y = 0.0;
		   
		   double z = x / y; // Infinity 
		   System.out.println(Double.isInfinite(z)); //true 
		   // double z = x % y; //NaN
 		   // System.out.println(Double.isNaN(z)); //true
		   
		   System.out.println(z + 2); //Infinity or NaN
		   
		   if ( Double.isInfinite(z) || Double.isNaN(z) ) {
		   		 System.out.println("값 산출 불가"); 
		   } else { 
		   	 System.out.println(z + 2); 
		   } */
		
		   int x = 5; 
		   int y = 0;
		   
		   try {
			   int z = x / y;
			   // int z = x % y;
			   System.out.println("z=" + z);
		   } catch (Exception e) {
			   System.out.println("0으로 나눌 수 없습니다");
		   }
		   
		  
		

	}

}
