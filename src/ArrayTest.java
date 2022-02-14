
public class ArrayTest {

	public static void main(String[] args) {
		
      /*	int firstOrder = 90;
		int secondOrder = 358;
		int thirdOrder = 244;
		int fourthOrder = 78;
		int fifthOrder = 374;*/
		
		
		int[] todayOrder=new int[] {90, 358, 244, 78, 374};
		
		//System.out.println("Today Order is : " + todayOrder);
		
		for(int i =0; i<todayOrder.length; i++) {
			
			System.out.println("Today Order is : "+ todayOrder[i]);
		}
		
		System.out.println();
	    
		/*int count = 0;//each loop
		for (int elm : todayOrder) {
			count = count + elm;
			System.out.println(elm);}
				System.out.println("Total order : "+ count);*/
		
		int total = 0;
		
		for (int elm =0; elm<todayOrder.length; elm++) {
			
			total = total + todayOrder[elm];
			
		}
		System.out.println("Total is :" + total);				
		}
			
}
