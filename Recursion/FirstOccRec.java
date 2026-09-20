public class FirstOccRec {
    public static int first(int[]arr,int key){
        return recfirst(arr,0,key);
    }
    private static int recfirst(int[]arr,int i,int key){
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        return recfirst(arr, i+1, key);
    }
    public static void main(String[] args) {
        int[]arr={12,23,23,34,25,54};
        int key=34;
        System.err.println("The key is found at the: "+first(arr, key));
    }
}
