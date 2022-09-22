import java.util.Scanner;

public class Sudoku	{
    public static void main(String[] args){

        // take the input from the user
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];
	System.out.println("Enter the input sudoku");
        for(int i=0; i<=8; i++){
            for(int j=0; j<=8; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        solveSudoku(arr, 0 , 0);
        System.out.println("---------Solved Sudoku Below-----------");

        // print the solved sudoku
        for(int i=0; i<=8; i++){
            for(int j=0; j<=8; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean solveSudoku(int[][] arr, int row, int col){
        if(row >= arr.length-1 && col >= arr.length){
            return true;
        }
        if(col >= arr[row].length){
            return solveSudoku(arr, row+1,0);
        }

        if(arr[row][col] == 0){
            for(int i=1; i<=9; i++){
                if(isSafe(arr, row, col, i)){
                    arr[row][col] = i;
                    if( solveSudoku(arr,row, col+1)){
                        return true;
                    }
                    arr[row][col] = 0;
                }
            }
            return false;
        }
        return solveSudoku(arr, row, col+1);
    }

    public static boolean isSafe(int[][] arr, int row, int col, int number){
        // row
        for(int i=0; i<9; i++){
            if(arr[row][i] == number){
                return false;
            }
        }
        // col
        for(int i=0; i<9; i++){
            if(arr[i][col] == number){
                return false;
            }
        }
        // box
        int p = (row/3)*3;
        int q = (col/3)*3;

        for(int i=p ; i<p+3; i++){
            for(int j=q; j<q+3; j++){
                if(arr[i][j] == number){
                    return false;
                }
            }
        }
        return true;
    }
}
