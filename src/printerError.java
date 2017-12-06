
public class printerError {
	public static String printerError(String s) {
        String newString = s.replaceAll("[a-m]", "");
        return String.valueOf(newString.length()) + "/" + String.valueOf(s.length());
    }
	
	public static void main(String[] args) {
		System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
	}
}
