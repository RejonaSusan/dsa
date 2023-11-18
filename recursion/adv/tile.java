public class tile {

    public static int numTiles(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        
        int verPath = numTiles(n-m, m);
        int horPath = numTiles(n-1, m);
        return verPath + horPath;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        int num = numTiles(n, m);
        System.out.println(num);
    }
    
}
