public class sumofarrelm {
    public static void printsum(int[] arr, int sumission) {
        
        for (int i = 0; i < arr.length; i++) {
            sumission += arr[i];  
            if (i == arr.length-1) {
                System.out.println(sumission);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,2,3};
        printsum(arr , 0);
    }
}
