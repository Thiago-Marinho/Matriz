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
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				
				
				if(ref==mat[i][j]) {
					System.out.println("Position: "+i+","+j);
					
					
					if(j > 0) {
						System.out.println("LEFT: "+mat[i][j-1]);//left
					}
					if(j < mat[i].length-1) {
						System.out.println("RIGTH: "+ mat[i][j+1]);//rigth
					}
					if(i > 0) {
						System.out.println("UP: "+mat[i-1][j]);//up
					}
					if(i < mat.length-1) {
						System.out.println("DOWN: "+mat[i+1][j]);//down										
					}
					System.out.println();							
				}			
			}
		
			
		sc.close();
	}
  }
}


	
