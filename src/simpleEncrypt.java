public class simpleEncrypt {

	  public static String encrypt(final String text, final int n) {
		    int i = 0;
		    String encrypted = text;
		    while(i < n) {
		    		encrypted = encryption(encrypted);
		    		i += 1;
		    }
		    return encrypted;
    
	  }
  
	  private static String encryption(final String text) {
		  String a = "";
		  String b =  "";
		  
		  if(text.length() % 2 != 0) {
			  for(int i = 0; i < text.length(); i += 2) {
				  a += text.charAt(i);
			  }
			  for(int i = 1; i < text.length() - 1; i += 2) {
				  b += text.charAt(i);
			  }
		  } else {
			  for(int i = 0; i < text.length(); i += 2) {
				  a += text.charAt(i);
			  }
			  for(int i = 1; i < text.length(); i += 2) {
				  b += text.charAt(i);
			  }
		  }
		  return b + a;
	  }
  
	  public static String decrypt(final String encryptedText, final int n) {
	    int i = 0;
	    String unencrypted = encryptedText;
	    while(i < n) {
	    		unencrypted = decryption(unencrypted);
	    		i += 1;
	    }
	    return unencrypted;
	  }
	  
	  private static String decryption(final String encryptedText) {
		  int mid = encryptedText.length() / 2;
		  String s = "";
		  String[] parts = {encryptedText.substring(0, mid), encryptedText.substring(mid)};
		  String a = parts[1];
		  String b = parts[0];
		  int i = 0;
		  while (i < a.length() && i < b.length()){
	            s += a.charAt(i) +""+ b.charAt(i); 
	            i++;
	        }
	        while (i < a.length() ){
	            s += a.charAt(i); 
	            i++;
	        }
	        while (i < b.length()){
	            s += b.charAt(i); 
	            i++;
	        }
	        return s;
	  }
  
	  public static void main(String[] args) {
//		  simpleEncrypt x = new simpleEncrypt();
//		  System.out.println(x.encryption("  "));
//		  System.out.println(x.encrypt("This is a test!!", 1));
//		  System.out.println(x.decryption("hsi  etTi sats!"));
//		  System.out.println(x.decrypt("OI[PMFLFKCGJO]", 4));
	  }
}