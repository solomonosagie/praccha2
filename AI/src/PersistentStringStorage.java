import java.io.*;
import java.util.*;

public class PersistentStringStorage {
    
        Scanner scanner = new Scanner(System.in);
         private String userInput ="null";
         
         public void setuserinput(String userInput) {
        	 this.userInput = userInput;
         }
         
         public String getUserInput() {
        	 return userInput;
         }
         
        // Create or load a text file to store the strings
         public void array_creation() {
         File file = new File("question_answer.txt");
        ArrayList<String> stringList = new ArrayList<>();

        // Load previously stored strings from the file
        if (file.exists()) {
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    stringList.add(fileScanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
         
        // Prompt the user to enter new strings
        outerloop: while  (true) {
            
            for (int i = 0; i < stringList.size(); i++) {
            	
            if (userInput.matches(stringList.get(i))) { 
            	
				System.out.println(" the answer to the question is  " + stringList.get(i+1));
				break outerloop ;
				
			 }
            else {
            	 stringList.add(userInput);
            	 System.out.println("oh sorry I don't know the answer to this question, would you mind telling me  ");
            	 stringList.add(scanner.nextLine());

            	
            }
            
            
            
            }
            
            
                        
           
            
            
        } 
            // Store the string in the ArrayList
        

        // Save the updated strings to the file
        try (PrintWriter writer = new PrintWriter(file)) {
            for (String str : stringList) {
                writer.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Print the stored strings
//        System.out.println("Stored strings:");
//        for ( int i = 0; i < stringList.size(); i++) {
//        	
//		//	if (userInput.contains(stringList.get(i))) { 
//			
//            System.out.println("String " + (i + 1) + ": " + stringList.get(i));
//        
//        }
}
        
}
