class PowerRec{
    public static int rec(int a,int b){
        if(b==0) return 1;
        return a*rec(a,b-1);    
    }
    public static void main(String []args){
        int a=2; int b=5;
        System.out.print (rec(a,b) );

    }
}