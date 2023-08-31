
public class Circle {

	private double radius =0;
	String option =null;
	double d;
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
 

 public double calculatearea (){
	return d= Math.PI* Math.pow(radius, 2);
 }
 
 // This is to calculate the perimeter.	
   public double calculateperimeter(){
	 return 2*Math.PI*radius;
   }
   public void check() {
	 if(option.equals("yes")) {
			System.out.println(d);
			System.out.println("bed");
			System.out.println("work");
	}

}


}
