public class rotatematrix {
    public static void  rotmatrix(int[][] arr, int[][] finalarr) {
        int n = arr.length ; 
        finalarr = new int[n][n];
        for (int i = 0; i < n; i++) { // rows

            // take row and make (n-i) column in new array
            for (int j = 0; j < n; j++) {
                finalarr[j][n-i-1]= arr[i][j];
            }
        }
        //print initital matrix
        System.out.println("initial matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        //print final matrix
        System.out.println("final matrix after a 90 degree rotation : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(finalarr[i][j]+ " ");
            }
            System.out.println();
        }
        return; 
    }
    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3, 7}, {4, 5, 6, 4}, {7, 8, 9, 8} ,{7, 8, 9, 8} }; 
        rotmatrix(arr , null);
    }
}
