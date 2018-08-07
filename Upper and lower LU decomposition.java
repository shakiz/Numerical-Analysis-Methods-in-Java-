
package upper.and.lower.in.lu;

import java.util.Scanner;

public class UpperAndLowerInLU {

    public static void main(String[] args) {
        System.out.println("Enter the dimension of the matrix:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [][]mat = new double[n][n];
        System.out.println("Enter the matrix element:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = sc.nextDouble();
            }
        }
        if(n==2){
            double [][] lower = new double[n][n];
            lower[0][0] = lower[1][1] = 1;
            lower[0][1] = 0;
 
            double [][]upper = new double[n][n];
            upper[1][0] = 0;
 
            upper[0][0] = mat[0][0];
            upper[0][1] = mat[0][1];
 
            lower[1][0] = mat[1][0]/mat[0][0];
            upper[1][1] = mat[1][1] - (lower[1][0]*upper[0][1]);
 
            System.out.println("The Lower Component is:");
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                    System.out.print(" "+lower[i][j]);
                System.out.println();
            }
            System.out.println("The Upper Component is:");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(" "+upper[i][j]);
                }
                System.out.println();
            }
        }
        if(n==3){
            double [][]lower = new double[n][n];
            lower[0][0] = lower[1][1] = lower[2][2] = 1;
            lower[0][1] = lower[0][2] = lower[1][2] = 0;
 
            double [][]upper = new double[n][n];
            upper[1][0] = upper[2][0] = upper[2][1] = 0;
 
            upper[0][0] = mat[0][0];
            upper[0][1] = mat[0][1];
            upper[0][2] = mat[0][2];
 
            lower[1][0] = mat[1][0]/mat[0][0];
            upper[1][1] = mat[1][1] - (lower[1][0]*upper[0][1]);   //mat[2][2]-(mat[2][1]*mat[1][2]/mat[1][1]);
            upper[1][2] = mat[1][2] - (lower[1][0]*upper[0][2]);
 
            lower[2][0] = mat[2][0]/upper[0][0];
            lower[2][1] = (mat[2][1] - lower[2][1]*upper[0][1])/upper[1][1];
            upper[2][2] = mat[2][2] - (lower[2][0]*upper[0][2]) - (lower[2][1]*upper[1][2]);
 
            System.out.println("The Lower Component is:");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.printf("%.3f ",lower[i][j]);
                }
                System.out.println();
            }
            System.out.println("The Upper Component is:");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.printf("%.3f ",upper[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }  
}
