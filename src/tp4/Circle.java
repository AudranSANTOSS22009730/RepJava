package tp4;
public class Circle { 

	   private double radius;
	   private String color;

	   public Circle(double r, String c) {  
	      radius = r;
	      color = c;
	   }
	   
	   public String getColor() {
		   return color; 
	   }

	   
	   public Circle(double r) {  
	      radius = r;
	      color = "red";
	   }
	   

	   public double getRadius() {
	     return radius; 
	   }
	   

	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	}
