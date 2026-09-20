public class RemCharRec {
    public static String remRec(String s,char ch){
        if(s.length()==0) return "";
        char first=s.charAt(0);
        String result=remRec(s.substring(1), ch);
        if(first==ch) return result;
        return first+result;
        // Tail Recursion
    } 

// Another form
// public static String remRec(String s,char ch){
//     if(s.length()==0) return "";
//     if(s.chartAt(0)==ch) 
//      return  remRec(s.substring(1),ch);
//     return s.charAt(0)+remRec(s.substring(1), ch);
    // Recursion
public static void main(String[] args){
    String s="akhilaaa";
    char ch='a';
    System.out.println(remRec(s,ch) );
}
}