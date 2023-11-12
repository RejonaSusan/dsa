import java.util.HashSet;

public class unique_sequences {

    public static void print_uni_seq(String s, int n, String newString, HashSet<String> set){
        if(n==s.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = s.charAt(n);
        print_uni_seq(s, n+1, newString+currChar, set);
        print_uni_seq(s, n+1, newString, set);

    }
    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        print_uni_seq(s, 0, "", set);
    }
    
}
