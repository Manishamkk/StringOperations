package string.examples2;

public class ReverseAllSentence {

	public static void main(String[] args) {
		String str[] = "My name is Manisha".split(" ");
		String str2 = "";
		for(int i = str.length-1;i>=0;i--) {
			str2 = str2 + str[i] + " ";
		}
		System.out.println(str2.substring(0,str2.length()-1));
  	}
}
