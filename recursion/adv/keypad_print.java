
public class keypad_print {
    
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void comb(String s, int n, String Comb){

        if(n==s.length()){
            System.out.println(Comb);
            return;
        }
        char currChar = s.charAt(n);
        String mapping = keypad[currChar-'0'];

        for(int i = 0; i < mapping.length(); i++){
            comb(s, n+1, Comb+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "23";
        comb(s, 0, "");
    }
}
