

// Number of Islands
// 🔗https://neetcode.io/problems/count-number-of-islands?list=neetcode150

/*
 * <DFS作戦>
 * 土地を見つけたとき: 
 * 上下左右に隣接する土地があれば、DFS的に訪れて島全体を無にしていく。
 * 
 * ↑繰り返す
 */

class Solution {
    static int M;
    static int N;
    static final int[][] directions = {{1,0}, {-1,0},
                                       {0,1}, {0,-1}}; 

    public int numIslands(char[][] grid) {
        int count = 0;

        M = grid.length;
        N = grid[0].length;

        // m * n のgridに対して、島があったらcount++
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                // System.out.println(i+" "+ j + "<- i,j");
                if(grid[i][j] == '1'){
                    bfs(grid, i, j);
                    count++;
                    System.out.println("--- 島が一つ消え去りました ---");
                }
            }
        }

        return count;
    }

    // r = 見つけた土地の行row, c = 見つけた時の列column
    public void bfs(char[][] grid, int r, int c){
        // System.out.println(r+" "+c + "がbfsされます");
        // 海だったり、r, cがはみ出てたら引き返す(return)
        if( r > M-1 || c > N-1 ||
            r < 0 || c < 0 || grid[r][c] == '0'){
            return;
        }

        // すでに訪れた場所は海にしてしまう。
        grid[r][c] = '0';
        for(int[] dir: directions){
            bfs(grid, r+dir[0] , c+dir[1]);
        }
    }
}
