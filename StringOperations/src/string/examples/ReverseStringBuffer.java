package string.examples;

public class ReverseStringBuffer {

	public static void main(String[] args) {
		String text = "Manisha Kadam";
		StringBuffer  text2 = new StringBuffer();
		text2.append(text);
		text2.reverse();
		System.out.println("Reverse string by using StringBuffer class:"+text2);
	}
	
	
}
