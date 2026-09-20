public class CountOfElem {
    public static int countRec(int[]arr,int key){
        return count(arr, 0, 0, key);
    }
    private static int count(int[]arr,int i,int c,int key){
        if(i==arr.length) return c;
        if(arr[i]==key) {
            c++;
        }
        return count(arr,i+1,c,key);
    }
    public static void main(String[]args){
        int [] arr={23,34,23,45,23,54,55};
        int key=23;
        System.out.println("The count of key "+key+" is: "+countRec(arr, key));    
    }
    
}
