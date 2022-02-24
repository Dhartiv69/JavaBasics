
public class Shape {

	public static void main(String arg[]) {
    	  
    	 ShapeData shape1 = new ShapeData ("SQURE - ",8);
    	 ShapeData shape2 = new ShapeData ("RECTANGLE - ",8, 2); 
    	 ShapeData shape3 = new ShapeData ("CIRCLE - ",7);
    	 
    	 System.out.println("Shape Name and Area : "+shape1.getName()+shape1.getArea());
    	 System.out.println("Shape Name and Area : "+shape2.getName()+shape2.getArea());
    	 System.out.println("Shape Name and Area : "+shape3.getName()+shape3.getArea());
    	 
    	 System.out.println("-----------------------------------------");
    	
    	 ShapeData[] shapes = {shape1, shape2, shape3};
    	 
    	 ShapeData temp = null ;
    	 System.out.println("Ascending Order");
    	 
    	 for (int i =0; i<shapes.length; i++) {
    		 ShapeData s1 = shapes [i];
    		 
    		 for(int j=1+i; j<shapes.length; j++) {
    			 ShapeData s2 = shapes [j]; 
    		  if (s1.getArea()>s2.getArea()) {
    	    	 temp = s1;
    	    	 shapes[i] = s2;
    	         shapes[j] = temp;
    	     }
    	 
       }

    }
    			
    	 for (ShapeData s : shapes) {
    		 System.out.println(s.getArea());
    		 }
      }
}  

class ShapeData {
	
	
	private String name;
	private int length;
	private int width;
	private double area;
	private final double PI = 3.14;

	public ShapeData() {
		
	}
	
	public ShapeData(String name,int length) {
		this.name = name;
		this.length = length;
		this.width = length;
		setArea();
	}
	
	
	public ShapeData(String name, int length, int width) {
		this.name = name;
		this.length = length;
		this.width = width;
		setArea();
	}


	private void setArea () {
		if (name.equals("SQURE - ")) {
		   this.area = length *length;
    } else if (name.equals("RECTANGLE - ")) {
    	   this.area = length * width;
    } else if (name.equals("CIRCLE - ")) {
    	   this.area = PI * length * length;
    } else {
    	   this.area = 0;
    }
}  	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
    public double getArea() {
		return area;
	}

	
	
}
