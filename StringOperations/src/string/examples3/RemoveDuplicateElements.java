package string.examples3;

import java.util.HashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		String[] array = {"xyz","abc","klm","xyz","opq","abc"};
//		for(int i = 0 ; i<array.length;i++) {
//			for( int j = i+1;j<array.length;j++) {
//				if((array[i].equals(array[j]))) {
//					System.out.println("Duplicate elements is:" + array[j]);
//				}
//			}
		HashSet  hs = new HashSet<String>();
		for(String e : array) {
			if(!hs.add(e)) {
				System.out.println("Duplicate element:"+e);
			}
		}
	}
	
}
