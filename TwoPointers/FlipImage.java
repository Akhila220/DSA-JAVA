public class FlipImage {
    public static  int[][] flip(int[][]image){
        int left;
        int right;
        for(int[]row:image){
            left=0;
            right=row.length-1;
            while(left<=right){
                int temp=row[left];
                row[left]=1-row[right];
                row[right]=1-temp;
                left++;
                right--;
            }
        }
        return image;
    }
    public static void main(String[]args){
        int[][]image={
            {1,0,1},
            {1,1,1},
            {0,1,0}
        };
        int[][]result=flip(image);
        for(int[]row:result){
            for(int i=0;i<row.length;i++){
                System.out.print(row[i]+ " ");
            }
            System.out.println();
        }
    }
}
