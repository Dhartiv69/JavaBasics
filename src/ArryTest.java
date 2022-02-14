
public class ArryTest {

	public static void main(String[] args) {
		
      /*	int firstOrder = 90;
		int secondOrder = 358;
		int thirdOrder = 244;
		int fourthOrder = 78;
		int fifthOrder = 374;*/
		
		/*double sum = firstOrder + secondOrder + thirdOrder + fourthOrder + fifthOrder;
		System.out.println("Addition : " + sum);
		System.out.println("Average : " + (sum/5));*/
		
		int []todayOrder =new int[] {90, 358, 244, 78, 374};
		
		//System.out.println("Today Order is : " + todayOrder);
		
		for(int i =0; i<todayOrder.length; i++) {
			
			System.out.println("Today Order["+i+"] is : "+ todayOrder[i]);
		}
		
		System.out.println();
	    
		int count = 0;
		for (int elm : todayOrder) {
			count = count + elm;
			
				System.out.println(elm);

			}
				
				System.out.println("Total order : "+ count);
							
		}
			
	

 }
