public class sequence {

    public static void subseq_print(String s, int n, String newString){

        if(n==s.length()){
            System.out.println(newString);
            return;
        }

        char currChar = s.charAt(n);
        subseq_print(s, n+1, newString+currChar);
        subseq_print(s, n+1, newString);
    }
    public static void main(String[] args) {
        String s = "abcd";
        subseq_print(s, 0, "");
    }
    
}
