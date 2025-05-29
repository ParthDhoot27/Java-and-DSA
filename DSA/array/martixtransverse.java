public class martixtransverse {
    public static void transverse(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j) {
                    break;
                }else{
                    int temp =  arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp; 
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        return; 
    }
    public static void main(String[] args) {
        int arr[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        transverse(arr);
    }
}
