class ContainerWithMostWater{
    public static int most(int[]height){
        int n =height.length;
        int width;
        int max=0;
        int currentcap=0;
        int minheight=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++ ){
                width=j-i;
                minheight=Math.min(height[i],height[j]);
                currentcap=width*minheight;
                max=Math.max(max,currentcap);

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]height={1,1};
        System.out.println("The maximum amount of water that container holds is: "+most(height));
    }
}