public class perm {


    public static void permutation(String str, String permuString){

        if(str.length() == 0){
            System.out.println(permuString);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, permuString+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
    
}
