
public class Inner {
private String response;// this are the things i am going to program  that the robot would say 
 private String input ; ;/// this is for what the user would put in and would need to be saved 
public static  String name;// this is to get the user name from the user  and use it in the program 
public static  final  String password ="flower";// this is the password for the program  

public String getResponse() {
	return response;
}
public void setResponse(String response) {
	this.response = response;
}
public String getInput() {
	return input;
}
public void setInput(String input) {
	this.input = input;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;

}

/// this part is for the math functions 
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


}
