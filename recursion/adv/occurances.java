public class occurances {

    public static int first = -1;
    public static int last = -1;

    public static void findoccurances(String s, int n, char ele){

        if(n == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (s.charAt(n) == ele){
            if (first == -1){
                first = n;
            }
            else{
            last = n;
            }
        }
        

        findoccurances(s, n+1, ele);
    }
    public static void main(String[] args) {
        String s = "aanhfwoihrajirhj";
        findoccurances(s, 0, 'a');
    }
    
}
