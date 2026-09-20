public class SearchRec {
  private static int linear(int[]arr,int target,int i){
        if(i>=arr.length) return -1;
        if(arr[i]==target) return i;
        return linear(arr, target, i+1);
  }
  public static int findEle(int[]arr,int target){
     return linear(arr, target, 0);
  }
  public static void main(String[] args) {
      int[]arr={19,23,44,35,55,27};
      int target=23;
      System.err.println("The index is "+findEle(arr, target));
  }
}
