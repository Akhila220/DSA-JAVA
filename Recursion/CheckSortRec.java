public class  CheckSortRec {
    public static boolean sort(int[]arr,int i){
        if(i==arr.length) return true;
        if(arr[i]<arr[i-1]) return false;
        return sort(arr,i+1);
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,6,9};
        int[]arr1={2,1,3};
        System.out.println( sort(arr,1));
        System.out.println( sort(arr1,1));

    }
}