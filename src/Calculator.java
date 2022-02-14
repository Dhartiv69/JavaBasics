import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double fnumber, snumber; 
		char operator;
		
		System.out.println("Enter First Number :");
		fnumber = sc.nextDouble();
		
		System.out.println("Enter Second Number :");
		snumber = sc.nextDouble();
		
		System.out.println("Enter the Operator (+, - , * , / )");
		operator = sc.next().charAt(0);
		sc.close();
		
		switch (operator) {
		case '+':
			System.out.println("Addition : " + (fnumber + snumber));
			break;
			
		case '-':
			System.out.println("Subtraction : "+ (fnumber - snumber));
		    break;
		    
		case '*':
			System.out.println("Multiplication : "+ (fnumber * snumber));
			break;
			
		case '/' :
			System.out.println("Division : "+ (fnumber / snumber));
			break;
			
		default:
			System.out.println("Invalid Operator");
			break;
		}
		
	}

	
}
