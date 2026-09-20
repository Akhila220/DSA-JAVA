class GcdRec{
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[]args){
        int a=36;
        int b=48;
        System.out.println("The gcd is: "+gcd(a,b));
    }
}