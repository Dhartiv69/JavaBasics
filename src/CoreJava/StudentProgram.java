package CoreJava;

public class StudentProgram {

	public static void main(String[] args) {
		
		Student s1 = new Student (29,"Siya");
        Student s2 = new Student (8,"Diya");
        Student s3 = new Student (5,"Dhairya");
        Student s4 = new Student (45,"Angel");
        
        Student[] students = {s1,s2,s3,s4};
        
        Student temp = null;
        
        for (Student s : students) {
            System.out.println("Student Name : " + s.getName());
            System.out.println("Student Roll No. - " + s.getRoll_no());
            System.out.println("--------------------------");
        }
            for (int i = 0; i<students.length; i++) {
            	Student a1 = students [i];
            	for (int j = 1+i; j<students.length; j++) {
            		Student a2 = students [j];
            		if(a1.getRoll_no() < a2.getRoll_no()) {
            			temp = a1;
            			students[i] = a2;
            			students[j] = temp;
            		}
            	}
            	
            }
	        System.out.println("Descending Order : ");
            for (Student s :students) {
	    	  System.out.println(s.getRoll_no());
	     }

    }
}