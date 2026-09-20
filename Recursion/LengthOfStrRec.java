public class LengthOfStrRec {
    public static int Length(String s){
        if(s.isEmpty()) return 0;
        return 1+Length(s.substring(1));
    }
    public static void main(String[] args) {
        System.out.println( Length("Akhila"));
    }
}
