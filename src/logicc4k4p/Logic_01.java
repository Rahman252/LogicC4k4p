package logicc4k4p;

public class Logic_01 {
	// Function to demonstrate printing pattern 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int rows = 20;
	        for(int i = rows; i >= 1; --i) {
	            for(int j = 1; j <= i; ++j) {
	               int angka = j;
	               int ang = 0;
	               if (angka > (rows/2)){
	                System.out.print((rows - j) + " "); 
	               }else{
	               	 System.out.print(j + " ");
	               }
	                
	            }
	            System.out.println();
	        }
		}
}
