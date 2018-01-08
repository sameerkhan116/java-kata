class wordExist {
	public boolean exist(char[][] board, String word) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(exist(board, i, j, word, 0)) return true;
			}
		}
		return false;
	}
	
	public boolean exist(char[][] board, int x, int y, String word, int i) {
		if(i == word.length()) return true;
		if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != word.charAt(i)) return false;
		board[x][y] = '*';
		boolean result = 	exist(board, x + 1, y, word, i+1) ||
							exist(board, x - 1, y, word, i+1) ||
							exist(board, x, y + 1, word, i+1) ||
							exist(board, x, y - 1, word, i+1);
		board[x][y] = word.charAt(i);
		return result;
	}
	
	public static void main(String[] args) {
		wordExist x = new wordExist();
		char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		char[][] xboard = new char[][] {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
		System.out.println(x.exist(board, "ABCCED"));
		System.out.println(x.exist(board, "SEE"));
		System.out.println(x.exist(board, "ABCB"));
		System.out.println(x.exist(xboard, "ABCESEEEFS"));
		
	}
}