 class CountDigRec {
    public static int countD(int n){
        if(n<10) return 1;
        return 1+countD(n/10);
    }
    public static void main(String[] args) {
        int n=345345;
        System.out.println("The no.of digits in the digits are: "+countD(n));
    }
    
}
