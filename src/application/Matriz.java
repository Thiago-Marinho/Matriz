package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter matrix row and column: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		System.out.println("Enter the numbers that go into the matrix:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter a matrix number:");
		int ref = sc.nextInt();
		int res = verification(mat.clone(),ref);
		
		/*for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(ref==mat[i][j]) {
					if(0== mat[i][j-1]) {
					System.out.print(mat[i][j-1]);//left
					}
					System.out.print(mat[i][j+1]);//rigth
				}*/
			
		
		
		sc.close();
	}

	public static int verification(int matriz [][], int ref) {
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				
				
				if(ref==matriz[i][j]) {
					System.out.println("Position: "+i+","+j);
					
					
					if(j > 0) {
						System.out.println("LEFT: "+matriz[i][j-1]);//left
					}
					if(j < matriz[i].length-1) {
						System.out.println("RIGTH: "+ matriz[i][j+1]);//rigth
					}
					if(i > 0) {
						System.out.println("UP: "+matriz[i-1][j]);//up
					}
					if(i < matriz.length-1) {
						System.out.println("DOWN: "+matriz[i+1][j]);//down										
					}
					System.out.println("");		
					
				}
					
			}
		}
		
		return 0;
	}
}

