class StringRevRec{
    private static String revrec(String s, String r,int i){
        if(i<0) return r;
        r=r+s.charAt(i);
        return revrec(s,r,i-1);
    }
    public static String rev(String s){
        return revrec(s," ",s.length()-1);
    }
    public static void main(String []args){
        String s="Akshay";
        System.out.println("The reverse of the string is: "+rev(s));
    }
}
    
