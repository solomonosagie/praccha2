import java.util.Scanner;

public class Outer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    	math math=new math();
    	Trigonometry trigo = new Trigonometry();
        String contin = "NULL";
        String co = "NULL";// the password the user will enter
        PersistentStringStorage pss = new PersistentStringStorage();
       
        System.out.println("you would need to sign in to use me");
        System.out.println("please enter you first name below ");
        Inner.name =keyboard.nextLine();
        do {
        System.out.println("please enter the password   below ");
        co=keyboard.nextLine();
            if (!co.equalsIgnoreCase(Inner.password)) {
            	System.out.println(" i found out that you entred the wrong password ");
            }else {System.out.println("you entred the correct password");}
        } while(!Inner.password.equals(co));
        do {
            System.out.println("Ask me a question: ");
            String userQuestion = keyboard.nextLine().toLowerCase();

            if (userQuestion.contains("what can you do") || userQuestion.contains("tell me what you can do")) {
                System.out.println(Inner.name+" I can do mathematical operations like addition, subtraction, division, modulo, and factorial.\nYou can also ask me simple questions like how I am doing. Please keep in mind that I am still an AI in progress.\nI can also tell you the time and date. I can't do much, but I am learning.");
    
            } else if (userQuestion.contains("how are you") || userQuestion.contains("how are you doing")) {
                System.out.println(Inner.name+ " I am doing well, thank you for asking!"); 
                System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
                keyboard.nextLine();
                contin = keyboard.nextLine();
            } else if (userQuestion.contains("addition")||userQuestion.contains("plus")||userQuestion.contains("sum")||userQuestion.contains("add")){
            	 System.out.println(Inner.name+ " I see you would like to add ");
            	 System.out.println(Inner.name+" enter the value of the firstnumber ");
            	 math.number1=keyboard.nextDouble();
            	 System.out.println(Inner.name+" enter the value of the secondnumber ");
            	math.number2= keyboard.nextDouble();
            	System.out.println(Inner.name+" the answer of your  addition is "+math.sum());
            	
            }else if (userQuestion.contains("subtraction")||userQuestion.contains("SUBTRACTION")||userQuestion.contains("subtract")||userQuestion.contains("minus")){
           	 System.out.println(Inner.name+" I see you would like to  subtract");
           	 System.out.println(Inner.name+" enter the value of the firstnumber ");
           	 math.number1=keyboard.nextDouble();
           	 System.out.println(Inner.name+" enter the value of the secondnumber ");
           	math.number2= keyboard.nextDouble();
           	
           	System.out.println( Inner.name+" the answer of your subtraction is " + math.subtract());
            System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
            keyboard.nextLine();
            contin = keyboard.nextLine();
            
           }
            else if (userQuestion.contains("DIVISION")||userQuestion.contains("division")||userQuestion.contains("divide")||userQuestion.contains("DIVIDE")){
              	 System.out.println(Inner.name+" I see you would like to  divide");
              	 System.out.println(Inner.name+" enter the value of the firstnumber ");
              	 math.number1=keyboard.nextDouble();
              	 System.out.println(Inner.name+" enter the value of the secondnumber ");
              	math.number2= keyboard.nextDouble();
              	System.out.println( Inner.name+" the answer of your division  is " + math.divide());

            System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
            keyboard.nextLine();
            contin = keyboard.nextLine();
            
            }
            
            else if (userQuestion.contains("multiplication")||userQuestion.contains("multiply")||userQuestion.contains("product")||userQuestion.contains("multiplication")){
             	 System.out.println(Inner.name+" I see you would like to do modulus");
             	 System.out.println(Inner.name+" enter the value of the firstnumber ");
             	 math.number1=keyboard.nextDouble();
              System.out.println(Inner.name+" enter the value of the secondnumber ");
             	math.number2= keyboard.nextDouble();
             	System.out.println( Inner.name+" the answer of your  multiply is " + math.product());

           System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
           keyboard.nextLine();
           contin = keyboard.nextLine();}
            
            
           else if (userQuestion.contains("modulus")||userQuestion.contains("remaining")||userQuestion.contains("remaimnder")||userQuestion.contains("modulus")){
           	 System.out.println(Inner.name+" I see you would like to check the raimnder of two numbers ");
           	 System.out.println(Inner.name+" enter the value of the firstnumber ");
           	 math.number1=keyboard.nextDouble();
            System.out.println(Inner.name+" enter the value of the secondnumber ");
           	math.number2= keyboard.nextDouble();
           	System.out.println( Inner.name+" the answer of your remainder is " + math.modulus());

         System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
         keyboard.nextLine();
         contin = keyboard.nextLine();  
           }
         
         
         
         // for factoring
         else if (userQuestion.contains("factorial")||userQuestion.contains("fact")){
           	 System.out.println(Inner.name+" I see you would like to check the factor of a number");
           	 System.out.println(Inner.name+" enter the number to factor");
           	 
           
           	System.out.println( Inner.name+" factorial of the number " + math.factorial(keyboard.nextLong()));

         System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
         keyboard.nextLine();
         contin = keyboard.nextLine();  
         }
            
            
         else if (userQuestion.contains("do you know")||userQuestion.contains("question")){
        	 pss.setuserinput(userQuestion);
        	 pss.array_creation();
           	
        	 
        	 
        	 
        
         System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
         keyboard.nextLine();
         contin = keyboard.nextLine();  
         }
            
         
         else if (userQuestion.contains("power")||userQuestion.contains("exponents")){
        	 double number = 0;
        	 double power = 0;
           	 System.out.println(Inner.name+" I see you would like to know the power of numbers");
           	 System.out.println(Inner.name+" enter the number for power");
           	 number = keyboard.nextDouble();
           	 System.out.println(Inner.name+" enter the power");
           	 power = keyboard.nextDouble();

           	 
           
           	System.out.println( Inner.name+" answer is " + math.exponents(number, power));

         System.out.println(Inner.name+" Do you wish to continue? Press Enter to continue, or type 'exit' to quit.");
         keyboard.nextLine();
         contin = keyboard.nextLine();  
         }
            
            
         else if (userQuestion.contains("Trignometry")||userQuestion.contains("trig")){
             System.out.println(Inner.name+" Please enter the value of the angle or the proportion.");
        	 double angle = Math.toRadians(keyboard.nextDouble());  
        	 keyboard.nextLine();
             System.out.println(Inner.name+" Now, please enter the type of function sin, cos, tan, arcsin, arccos, arctan");
             String choiceTrig = keyboard.nextLine().toLowerCase();
             
             switch(choiceTrig) {           
             case "sin":
                 System.out.println(Inner.name+" The sin of the angle is"+ trigo.calculateSin(angle));
                 break;
                 
             case "cos":
                 System.out.println(Inner.name+" The cos of the angle is"+ trigo.calculateCos(angle));
                 break; 
                 
             case "tan":
                 System.out.println(Inner.name+" The tan of the angle is"+ trigo.calculateTan(angle));
                 break;
                 
             case "arcsin":
                 System.out.println(Inner.name+" The sin inverse of the value is"+ trigo.calculateSinInverse(angle));
                 break;
                 
             case "arccos":
                 System.out.println(Inner.name+" The cos inverse of the value is"+ trigo.calculateCosInverse(angle));
                 break;
             
                 
             case "arctan":
                 System.out.println(Inner.name+" The tan inverese of the value is"+ trigo.calculateTanInverse(angle));
                 break;

             default :
            	 System.out.print("error");
             }
             
        	 
        	
         }

         
        
         
         
         
         
         
         
         
         
         
         }while (!contin.equalsIgnoreCase("exit"));

        keyboard.close();
        
        }}





		/*
	 case 4:
		 System.out.println("enter the value of the f
		 math.number1=keyboard.nextDouble();
		 System.out.println("enter the value of the secondnumber ");
		math.number2= keyboard.nextDouble(); 
		System.out.println(math.product()); 
		break;
	 case 3:
		 System.out.println("enter the value of the firstnumber ");
		 math.number1=keyboard.nextDouble();
		 System.out.println("enter the value of the secondnumber ");
		math.number2= keyboard.nextDouble(); 
		System.out.println(math.divide()); 
		break;
		
		
	 case 5:
		 System.out.println("enter the value of the firstnumber ");
		 math.number1=keyboard.nextDouble();
		 System.out.println("enter the value of the secondnumber ");
		math.number2= keyboard.nextDouble(); 
		System.out.println(math.modulus()); 
	 }
		System.out.println( " do you wish to continue ");

		System.out.println( " what is the password ");
		keyboard.nextLine();
		again= keyboard.nextLine();*/
		
		
	
//	System.out.println(inner.input);


