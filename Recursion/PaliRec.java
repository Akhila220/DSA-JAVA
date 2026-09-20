 class PaliRec {
   private static String revrec(String s,String r,int i) {
        if(i<0) return r;
        r=r+s.charAt(i);
        return revrec(s, r, i-1);
   } 
   public static boolean palindrome(String s){
        String rev=revrec(s, "", s.length()-1);
        return s.equals(rev);
   }
   public static void main(String[]args){
    String s="MADAM";
    System.out.println("The given is palindrome: "+palindrome(s));
   }
}
