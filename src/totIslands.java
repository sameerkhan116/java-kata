
public class totIslands {
	public int numsIslands(char[][] grid) {
		int count = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == '1') {
					markX(grid, i, j);
					++count;
				}
			}
		}
		return count;
	}
	
	public void markX(char[][] grid, int i, int j) {
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
		grid[i][j] = '0';
		markX(grid, i+1, j);
		markX(grid, i-1, j);
		markX(grid, i, j+1);
		markX(grid, i, j-1);
	}
	
	public static void main(String[] args) {
		totIslands x = new totIslands();
//		System.out.println(x.numsIslands(11110, 11010, 11000, 00000));
	}
}
