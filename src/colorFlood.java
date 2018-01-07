import java.util.Arrays;

public class colorFlood {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        color(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
	
	public void color(int[][] grid, int i, int j, int color, int newColor) {
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != color) return;
		grid[i][j] = newColor;
		color(grid, i + 1, j, color, newColor);
		color(grid, i - 1, j, color, newColor);
		color(grid, i, j + 1, color, newColor);
		color(grid, i, j - 1, color, newColor);
	}
	
	public static void main(String[] args) {
		colorFlood x = new colorFlood();
		int[][] image = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
		System.out.println(Arrays.deepToString(x.floodFill(image, 1, 1, 2)));
	}
}
