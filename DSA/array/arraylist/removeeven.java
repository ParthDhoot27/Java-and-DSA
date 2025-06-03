package arraylist;

import java.util.ArrayList;

public class removeeven {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(3);
        arr.add(6);
        arr.add(54);
        arr.add(7);
        arr.add(9);
        arr.add(0);
        arr.add(3);
        arr.add(2);
        System.out.println(arr);
        for (int i =arr.size()-1; i>=0; i--) {
            if(arr.get(i)%2==0){
                arr.remove(i);
            }
        }
        System.out.println("after removing the even terms--> " + arr);
    }
}
