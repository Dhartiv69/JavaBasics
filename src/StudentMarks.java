import java.util.Scanner;
public class StudentMarks {
    
	public static void main(String[] args) {
		
		StudentsData s1 = new StudentsData();
		s1.studentName("Siya Zalavadiya");
		s1.studentSubject("10");
		s1.subjectName("English-1,English-2,Mathematics,Science,Social Studies,Gujarati,Hindi,Sanskrit,Computer,Drawing");
	
	    int marks, i, sum=0, largest, smallest;
	    Scanner sc = new Scanner(System.in);
	    
	    
	    System.out.println("Please Enter number of Subject : " );
	    marks = sc.nextInt();
	    
	    
	    int [] a = new int [marks];
	    System.out.println("Please Enter "+marks+ " Subject Marks : ");
	    
	    for (i = 0; i<marks; i++) {
	    	
	    	a[i] = sc.nextInt();
	    	}
	    for (i = 0; i<marks; i++) {
	    	
	    	sum = sum + a[i];
	    }
	     System.out.println("Total Marks = " + sum);
	     
	     System.out.println("Avrage = " + sum/marks);
	     
	     largest = a[0];
	     smallest = a[0];
	     for (i = 0; i<marks; i++) {
	    	 if (largest<a[i]) {
	    		 largest = a[i];
	    	 }
	    	 else if (smallest>a[i]) {
	    		 smallest = a[i];
	    	 }
	     }
	     
	      System.out.println("Largest Marks = " +largest);
	
	      System.out.println("Smallest Marks = " +smallest);
	
	}
	
	
}


