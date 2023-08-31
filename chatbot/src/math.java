
public class math {
  double number1 =0.0;
  double number2 = 0.0;
  
  
  
  
  
	   public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}
	
	public void setNumber2(double number2) { 
		this.number2 = number2;
	}
	
	public double sum() {
		  return  number1+number2 ;
	  }
	
	public double subtract() {
		return number1-number2;
	}
	public  double modulus() {
		return number1%number2;
	}
	public  double divide() {
		return number1/number2;}
	public double  product(){
		return number1 *number2 ;
	}
	
	
	public long factorial(long number) {
		for (long i = number; i>1;) {
			i--;
			number *=i;
			if (number<=0) {
				break;
			}
		
		
		}
		return number;
	}
	
	
	
	public double exponents(double number, double power) {
		return Math.pow(number, power);
	}
	
	}
	
	
	
	
	
	












