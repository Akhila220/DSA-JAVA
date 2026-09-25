import java.util.*;
class SchoolarShip{
    public static int assign(int[]need,int[]amount){
        Arrays.sort(need);
        Arrays.sort(amount);
        int m=need.length;
        int n=amount.length;
        int count=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(need[i]<=amount[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int[]need={2,3,4};
        int[]amount={1,3,5};
        System.out.println("The count od students recived money are: "+assign(need, amount)); 
    }
}