package Apna_College;

public class arrayIsSorted {
    public static boolean CheckSorted(int []arr ,int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return CheckSorted(arr ,index+1);
        }
        else{
            return  false;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,4};
        System.out.println(CheckSorted(arr ,0));

    }
}
