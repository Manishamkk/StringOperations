package string.examples2;

public class NumberOfStringOccurance {

	public static void main(String[] args) {
//	        String string = "Java is a programming language. Java platform independent language";
//	        String[] words = string.toLowerCase().split(" ");
//	        String word1 = "java";
//            String word2 = "language";
//	        int occurance = 0;
//	        int occurance2 = 0;
//	        for (int i = 0; i < words.length; i++) {
//	            if (words[i].equals(word1)) {
//	                occurance++;
//	            }
//	            else if (words[i].equals(word2)) {
//	            	occurance2++;
//	            }
//	        }
//	        System.out.println(occurance);
//	        System.out.println(occurance2);
//	        
//	} 
	        String string = "Java is a programming language. Java platform independent language";
	        String cleanString = string.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");
	        String[] words = cleanString.split("\\s+");
	        String word1 = "java";
	        String word2 = "language";

	        int occurance = 0;
	        int occurance2 = 0;
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].equals(word1)) {
	                occurance++;
	            } else if (words[i].equals(word2)) {
	                occurance2++;
	            }
	        }
	        System.out.println(occurance);
	        System.out.println(occurance2);
	    }
}