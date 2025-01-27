package string.examples;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        String str = "Madam";
//       // String str2 = "";
 //       char[] charArray = str2.toCharArray();
//        for(int i = charArray.length-1;i>=0;i-- ) {
//        	System.out.println(charArray[i]);
//        }
        String str2 = "FullstackJavaDeveloper";
       String str3 = "";
        for(int i = str2.length()-1;i>=0;i-- ) {
        	
        	str3 = str3+str2.charAt(i);
        }
        System.out.println("Reversed String:" + str3);
	}

}
