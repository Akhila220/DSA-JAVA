public class CountEleRec {
    public static int count(int[]arr,int i,int c,int key){
        if(i==arr.length) return c;
        if(arr[i]==key){
            c++;
        }
        return count(arr,i+1,c,key);
    }
    public static void main(String[] args) {
        int[]arr={12,43,23,23,34,23,45};
        int i=0;
        int c=0;
        int key=23;
        System.err.println("The no.of Occurences is "+count(arr, i, c, key));
    }
}
