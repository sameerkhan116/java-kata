
public class phoneNumber {
	public static String createPhoneNumber(int[] numbers) {
	    StringBuilder sb = new StringBuilder();
	    sb.append("(");
	    for(int i = 0; i < 3; i++) {
	    		sb.append(String.valueOf(numbers[i]));
	    }
	    sb.append(") ");
	    for(int i = 3; i < 6; i++) {
    			sb.append(String.valueOf(numbers[i]));
	    }
	    sb.append("-");
	    for(int i = 6; i < numbers.length; i++) {
			sb.append(String.valueOf(numbers[i]));
	    }
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	}
}
