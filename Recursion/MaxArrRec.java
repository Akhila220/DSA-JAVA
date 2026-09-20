class MaxArrRec{
    public static int MaxNum (int[]arr,int i,int max,int n) {
        if(i==n){
            return max;
        }
        if(arr[i]>max){
            max=arr[i];
        }
        return MaxNum(arr, i+1, max, n);
    }
    public static void main(String[]args){
        int[]arr ={19,23,44,35};
        int max=0;
        int n=arr.length;
        int i=0;
        System.out.println("The max number in array is: "+ MaxNum(arr, i, max, n));
    }
}
