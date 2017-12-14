package utilize;

import java.util.Arrays;

public class DeretAngka {

	//untuk mendapatkan nilai 1 - n, example : 1,2,3,4..dst.
	public static int[] getDeret_1(int n, boolean reverse){
		int[] data = new int[n];
		
		int a = 1;
		for(int i = 0; i < n; i++){
			data[i] = a;
			
			if(reverse == true && i >= n / 2)
				a = a - 1;
			else
				a = a + 1;
		}
		
		return data;
	}
	
	//example : 0, 2, 4, 6, dst..
	public static int[] getDeret_2(int start, int n, boolean reverse){
		int[] data = new int[n];
		int[] dataTrue = new int[n];
		
		int a = start;
		for(int i = 0; i < n; i++){
			data[i] = a;
			
			if(reverse == true && i >= n / 2)
			a = a - 2;
			else
			a = a + 2;
		}
		return data;
	}
	
	public static int[] getFibonachi(int n, boolean reverse){
		int[] data = new int[n]; //1,1,2,3,5,8
		int[] dataTrue = new int[n]; //1,1,2,1,1
		data[0] = 1;
		data[1] = 1;
		//if false
		for(int i = 2; i < n; i++){
			data[i] = data[i - 1] + data[i - 2];	
		}
		//reverse true
		int a = 0;
		for(int i = 0; i < n; i++){
			dataTrue[i] = data[a];
			if(i < n/2){
				a = a + 1;
			} else {
				a = a - 1;
			}
		}
		if(reverse == true){
			return dataTrue;
		} 
		
		return data;
	}
	
	public static int[] triFibonachi(int n, boolean reverse){
		int[] data = new int[n];
		int[] dataTrue = new int[n];
		
		data[0] = 1;
		data[1] = 1;
		data[2] = 1;
		
		for(int i = 3; i < n; i++){
			data[i] = data[i - 1] + data[i - 2] + data[i - 3];
		}
		
		//if true
		int a = 0;
		for(int i = 0; i < n; i++){
			dataTrue[i] = data[a];
			if(i < n/2){
				a = a + 1;
			} else {
				a = a - 1;
			}
		}
		
		if(reverse == true){
			return dataTrue;
		}
		
		return data;
	}
	
	//[1, 0, 3, 0, 5, 0, 3, 0, 1]
	public static String[] genapGanjil(int n){
		String[] data = new String[n];
		int[] deret = getDeret_1(n, true);
		
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				data[i] = deret[i] + "";
			} else {
				data[i] = " ";
			}
		}
		return data;
	}
	
	public static String[] getChar(int n){
		return new String[]{
			"A", "B", "C", "D", "E", "F", "G"	
		};
	}
	
	public static String[] genapGanjilFibonachi(int n){
		String[] data = new String[n];
		String[] dataChar = getChar(n);
		
		int[] dataFib = getFibonachi(n, true);
		System.out.println(Arrays.toString(dataFib));
		
		int[] deret = getDeret_1(n, true);
		
		int a = 0;
		int ab = 0;
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				if(i <= n / 2){
					data[i] = dataFib[a++] + "";
				} else {
					data[i] = dataFib[--a] + "";
				}
			} else {
				data[i] = dataChar[a - 1]+"";
			}
		}
		return data;
	}
	
	public static void main(String args[]){
		//String[] data = DeretAngka.genapGanjilFibonachi(9);
		
		//System.out.println(Arrays.toString(data));
		DeretAngka.getChar(5);
	}
	
}
