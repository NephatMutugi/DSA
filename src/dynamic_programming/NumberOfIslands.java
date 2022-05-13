package dynamic_programming;

public class NumberOfIslands {
    public static int numberOfIslands(char [][] myGrid){
        int count = 0;
        for (int i = 0; i < myGrid.length; i++){
            for (int j = 0; j < myGrid[i].length; j++){
                if (myGrid[i][j] == '1'){
                    count +=1;
                    findIsland(myGrid, i, j);
                }
            }
        }
        return count;
    }

    public static void findIsland(char [][] grid, int i, int j){

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        findIsland(grid, i+1, j); // Up
        findIsland(grid, i-1, j); // Down
        findIsland(grid, i, j-1); // Left
        findIsland(grid, i, j+1); // Right

    }

    public static void main(String[] args) {
        char [][] myGrid = {{'1','0','0','1','0'}, {'1','1','0', '1','0'},
                {'1','1','0', '0', '0'}, {'0','1','0','1','0'}};

        int islands = numberOfIslands(myGrid);
        System.out.println("Islands: " + islands);
    }
}
