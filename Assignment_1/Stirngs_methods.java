package Assignment_1;

public class Stirngs_methods {
	    public static void main(String[] args) {
	        String str = "Hello Ram, meet Anusha and Lokesh.";

	        
	        String replaced = str.replace("Ram", "Lokesh");
	        System.out.println("After replace: " + replaced); 

	        
	        String replacedAll = str.replaceAll("\\b[a-zA-Z]{4}\\b", "Hi");
	        System.out.println("After replaceAll: " + replacedAll); 

	        
	        String substring = str.substring(6, 9);
	        System.out.println("Substring (6, 9): " + substring); 

	        
	        String[] splitArray = str.split(" ");
	        System.out.println("Split words:");
	        for (String word : splitArray) {
	            System.out.println(word);
	        }

	        
	        char charAt = str.charAt(11);
	        System.out.println("Character at index 11: " + charAt); 

	        
	        Integer number = 123;
	        String numberString = number.toString(); 
	        System.out.println("Integer to String: " + numberString);
	    }
	}


