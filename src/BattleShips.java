import java.util.*;

class BattleShips {
    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        Map<String, Double> result = new HashMap<>();
        
        int[] initBoats = new int[]{0,0,0};
        int[] finalBoats = new int[]{0,0,0};

        // Get length of each of the boat using the number it is identified by and put it in initboats and finalboats
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] > 0) {
                    initBoats[board[i][j] - 1]++;
                    finalBoats[board[i][j] - 1]++;
                }
            }
        }

        // Now go through the attack array
        for(int i = 0; i < attacks.length; i++) {
            int x = attacks[i][0] - 1;
            int y = board.length - attacks[i][1];
            int hit = board[y][x];
            if(hit > 0) finalBoats[hit - 1]--;
        }

        // Get number of boats
        double numberOfSunk = 0, numberOfDamaged = 0, notTouched = 0;

        for(int i = 0; i < initBoats.length; i++) {
            if(initBoats[i] > 0) {
                if(initBoats[i] == finalBoats[i]) notTouched++;
                else if(finalBoats[i] > 0) numberOfDamaged++;
                else numberOfSunk++;
            }
        }

        result.put("sunk", numberOfSunk);
        result.put("damaged", numberOfDamaged);
        result.put("notTouched", notTouched);
        result.put("points", numberOfDamaged*0.5 + numberOfSunk - notTouched);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(damagedOrSunk(new int[][]{
                                                    {0,0,0,2,2,0},
                                                    {0,3,0,0,0,0},
                                                    {0,3,0,1,0,0},
                                                    {0,3,0,1,0,0}}, 
                                                    new int[][]{{2,1}, {1,3}, {4,2}}
                                                ));
    }
}