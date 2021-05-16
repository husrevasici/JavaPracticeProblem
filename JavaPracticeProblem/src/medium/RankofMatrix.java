package medium;

import java.util.Arrays;
import java.util.Scanner;

public class RankofMatrix {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();

		int rank;

		int[][] array = new int[3][3];
		
	
		
		while (count-- > 0) {			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					array[i][j] = scan.nextInt();
				}
				System.out.println();
			}
			
			 rank=(
					  (array[0][0]*array[1][1]*array[2][2])+
					  (array[1][0]*array[2][1]*array[0][2])+
					  (array[2][0]*array[0][1]*array[1][2])
					 )
					-
					 (
					  (array[0][2]*array[1][1]*array[2][0])+
					  (array[1][2]*array[2][1]*array[0][0])+
					  (array[2][2]*array[0][1]*array[1][0])
					 );

			if(rank==0) {
				System.out.println("2");
			}
			else {
				System.out.println("3");
			}
			
		}
		
	
	}
}
