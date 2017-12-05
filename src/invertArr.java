
public class invertArr {
	public static int[] invert(int[] array) {
		
		if(array == null || array.length == 0) {
			return new int[] {};
		}
		
		int[] fin = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			fin[i] = array[i] * -1;
		}
		return fin;
	}
	
	public static void main(String[] args) {
		System.out.println(invert(new int[] {-1,-2,-3,-4,-5}));
	}
}
