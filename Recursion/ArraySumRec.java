 class ArraySumRec {
   /*  public static int sumArr(int[]arr,int i,int sum,int n){
        if(i==n) return sum;
        sum=sum+arr[i];
        return sumArr(arr,i+1,sum,n);
    }
        */
       public static int sumArr(int[]arr,int i,int sum) {
        if(i==arr.length) return sum;
        sum=sum+arr[i];
        return sumArr(arr,i+1,sum);
       }
    public static void main(String[] args) {
        int[]arr={22,16,6,23,19};
        int n=arr.length;
        int i=0;
        int sum=0;
        System.out.println( "The sum of numbers in array is: "+ sumArr(arr, i, sumSSS));

    }
    
}
