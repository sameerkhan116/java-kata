public class outlier {
	static int find(int[] integers) {
		int find = 0;
		if(integers[0] % 2 == 0) {
			if(integers[2] % 2 == 0 || integers[1] % 2 == 0) {
				for(int i : integers) {
					if(i % 2 != 0) {
						find = i;
					}
				}
			} else {
				for(int i : integers) {
					if(i % 2 == 0) {
						find = i;
					}
				}
			}
		}
		if(integers[0] % 2 != 0) {
			if(integers[2] % 2 != 0 || integers[1] % 2 != 0) {
				for(int i : integers) {
					if(i % 2 == 0) {
						find = i;
					}
				}
			} else {
				for(int i : integers) {
					if(i % 2 != 0) {
						find = i;
					}
				}
			}
		}
		return find;
	}
	
	public static void main(String[] args) {
		System.out.println(find(new int[] {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
	}
}