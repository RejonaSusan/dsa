public class remove_dupes{

    public static boolean[] map = new boolean[26];

    public static void dupes(String s, int n, String newString){
        if(n==s.length()){
            System.out.println(newString);
            return;
        }

        char currChar = s.charAt(n);
        if (map[currChar - 'a']){
            dupes(s, n+1, newString);
        }
        else{
            newString += currChar;
            map[currChar - 'a'] = true;
            dupes(s, n+1, newString);
        }
    }

    public static void main(String[] args) {
        String s = "aabbdssbi";
        dupes(s, 0, "");
    }
}