
public class printerError {
	public static String printerError(String s) {
        int count = 0;
        String newString = s.replaceAll("[a-m]", "");
        return String.valueOf(newString.length()) + "/" + String.valueOf(s.length());
    }
	
	public static void main(String[] args) {
		printerError x = new printerError();
		System.out.println(x.printerError("aaaxbbbbyyhwawiwjjjwwm"));
	}
}
