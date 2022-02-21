import java.util.Arrays;

public class Shape {
	
      public static void main(String arg[]) {
    	  
    	 ShapeData shape1 = new ShapeData (6);
    	 ShapeData shape2 = new ShapeData (5, 2); 
    	 ShapeData shape3 = new ShapeData (1.0);
    	 
    	 System.out.println("Area of Squre is : "+shape1.getArea());
    	 System.out.println("Area of Rectangle is : "+shape2.getArea());
    	 System.out.println("Area of Circle is : "+shape3.getAreaOfCircle());
    	 
    	 
    	double [] shapes = {36, 10, 3.14};
    	System.out.println( "Ascending Numbers: ");
    	
    	Arrays.sort(shapes);
    	System.out.println( Arrays.toString(shapes));
            int Temp = 0;
            System.out.println("--------------------");
            System.out.println("Descending Numbers : ");	
            for (int i= 0; i<shapes.length; i++) {
            	for (int j = i+1; j<shapes.length; j++) {
            		if (shapes[i]<shapes[j]) {
            			Temp = (int) shapes[i];
            			shapes[i] = shapes[j];
            			shapes [j] = Temp;
            		}
            	
            	}
            	
            }
    	    
            for (int i= 0; i<shapes.length; i++) {
            	System.out.print(shapes[i] + " ");
            }
      
      }

}



class ShapeData {
	
	
	private int length;
	private int width;
	private double redius;
	

	public ShapeData(int length) {
		
		this.length = length;
		this.width = length;
	}
	
	
	public ShapeData(int length, int width) {
		
		this.length = length;
		this.width = width;
	}
 
	public ShapeData(double redius) {
		
		this.redius = redius;
	}


	public int getArea () {
		 int area = length * width;
		 
	   return area;	
	}
     
    public double getAreaOfCircle() {
    	double area = Math.PI * redius * redius;
       return area;
    }
    	
    	
  


	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
    public double getRedius() {
		return redius;
	}
    public void setRedius(int redius) {
		this.redius = redius;
	}
	
	
	
}
	
	
