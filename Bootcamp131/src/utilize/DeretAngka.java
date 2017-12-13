package utilize;

public class DeretAngka {

	//untuk mendapatkan nilai 1 - n, example : 1,2,3,4..dst.
	public static int[] getDeret_1(int n){
		int[] data = new int[n];
		
		int a = 1;
		for(int i = 0; i < n; i++){
			data[i] = a;
			a = a + 1;
		}
		
		return data;
	}
	
	//example : 0, 2, 4, 6, dst..
	public static int[] getDeret_2(int start, int n){
		int[] data = new int[n];
		int a = start;
		for(int i = 0; i < n; i++){
			data[i] = a;
			a = a + 2;
		}
		return data;
	}
}
