 class LastOccRec {
    private static int last(int[]arr, int i, int key){
        if(i<0)  return -1;
        if(arr[i]==key) return i;
        return last(arr,i-1,key);
    }
    public static int lastRec(int[]arr,int key){
        return last(arr,arr.length-1, key);
    }
    public static void main(String[]args){
        int[]arr={12,23,45,23,45,23};
        int key=23;
        System.err.println("The last occurence of key "+key+" is: "+lastRec(arr, key));
    }
}
