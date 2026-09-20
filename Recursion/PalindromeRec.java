 class PalindromeRec {
    private static int reverse (int n,int r) {
        if(n==0) return r;
        r=r*10+(n%10);
        return reverse(n/10, r);
    } 
    public static boolean palindromeRec(int n){
        int rev=reverse(n,0 );
        return n==rev;
    }
    public static void main(String[] args) {
        int n=0;
        System.out.println(palindromeRec(n));
    }
}
