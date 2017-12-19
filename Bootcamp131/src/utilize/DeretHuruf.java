package utilize;

import java.util.Arrays;

public class DeretHuruf {

	public static String[] getChar(int n){
		String[] data = new String[n];
		
		int a = 65;
		for(int i = 0; i < n; i++ ){
			data[i] = Character.toString((char) a);
			a = a + 1;
		}
		
		return data;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(getChar(19)));
	}
}
