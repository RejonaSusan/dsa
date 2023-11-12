public class chars_in_end {

    public static void printstr(String s, int n, int count, String newString){

        if(n==s.length()){
            for(int i=0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
                return;
        }
        char currChar = s.charAt(n);
        if (currChar == 'x'){
            count++;
            printstr(s, n+1, count, newString);
        }
        else{
            newString += currChar;
            printstr(s, n+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String s = "abxabbaaaxijooxxxjixxjo";
        printstr(s, 0, 0, "");
    }
    
}
