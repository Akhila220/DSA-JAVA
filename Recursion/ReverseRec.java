class ReverseRec{
    public static int rev(int n,int r){
        if(n==0) return r;
        r=r * 10 + ( n%10 );
        return rev(n/10,r);
    }
    public static void main(String[]args){
        int n=342;
        int r=0;
       System.out.print( rev(n,r));
    }
}