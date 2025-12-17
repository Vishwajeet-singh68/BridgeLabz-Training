import java.util.*;
public class surroundedRegion {
    static int[] r={0,0,-1,1};
    static int[] c={-1,1,0,0};
    public static void solve(char[][] board) {
        int n=board.length, m=board[0].length;
        for(int i=0;i<m;i++){
            if(board[0][i]=='O')
                bfs(board, 0,i);
            if(board[n-1][i]=='O'){
                bfs(board, n-1,i);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O')
                bfs(board, i,0);
            if(board[i][m-1]=='O')
                bfs(board, i,m-1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='.')
                    board[i][j]='O';
            }
        }
    }
    public static void bfs(char board[][],int row, int col){
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{row,col});
        board[row][col]='.';
        while(!q.isEmpty()){
            int arr[]=q.poll();
            for(int i=0;i<4;i++){
                int nrow=arr[0]+r[i];
                int ncol=arr[1]+c[i];
                if(nrow<0 || ncol<0 || nrow>=board.length || ncol>=board[0].length || board[nrow][ncol]!='O')
                    continue;
                board[nrow][ncol]='.';
                q.add(new int[]{nrow,ncol});
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();     
        int m=sc.nextInt();
        char board[][]=new char[n][m];      
        for(int i=0;i<n;i++){
            String str=sc.next();
            for(int j=0;j<m;j++){
                board[i][j]=str.charAt(j);
            }
        }
        solve(board);
        for(int i=0;i<n;i++){   
            for(int j=0;j<m;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}