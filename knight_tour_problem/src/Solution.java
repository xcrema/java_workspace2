
public class Solution {
	
	static final int N = 8;
	public static void main(String[] args) {
		startKnightTour();
	}

	private static void startKnightTour() {
		// TODO Auto-generated method stub
		
		int[][] sol = new int[N+1][N+1];
		
		for(int i=1; i<=N; i++)
			for(int j=1; j<=N; j++)
				sol[i][j] = -1;
		
		int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
	    int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
		
		sol[1][1] = 0;
		
		if(knightTour(sol, 1, 1, 1, xMove, yMove)) {
			for(int i=1; i<=N; i++) {
				for(int j=1; j<=N; j++) {
					System.out.print(sol[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
	}

	private static boolean knightTour(int[][] sol, int i, int j, int stepCount, int[] xMove, int[] yMove) {
		// TODO Auto-generated method stub
		
		if(stepCount == N*N)
			return true;
		
		for(int k=0; k<8; k++) {
			
			int nextI = i+xMove[k];
			int nextJ = j+yMove[k];
			
			if(isValid(sol, nextI, nextJ)) {
				sol[nextI][nextJ] = stepCount;
				if(knightTour(sol, nextI, nextJ, stepCount+1, xMove, yMove))
					return true;
				sol[nextI][nextJ] = -1;
			}
		}
		return false;
	}

	private static boolean isValid(int[][] sol, int nextI, int nextJ) {
		// TODO Auto-generated method stub
		if(nextI>=1 && nextJ>=1 && nextI<=N && nextJ<=N)
			if(sol[nextI][nextJ] == -1)
				return true;
		return false;
	}
}
