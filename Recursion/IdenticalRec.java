public class IdenticalRec {
    public static boolean identical(String s1,String s2,int i){
        if(i==s1.length()) return true;
        if(s1.length()!=s2.length()) return false;
        if(s1.charAt(i)!=s2.charAt(i)) return false;
        return identical(s1,s2,i+1);
    }
    public static void main(String[]args){
        System.out.println( identical("akhila", "akhila", 0));
        // Without declarition the passing the variables via the arguments is possible so no need to declare them
    }
}
