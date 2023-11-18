public class maze {

    public static int paths(int i, int j, int n, int m){

        if(i== n || j == m){
            return 0;
        }

        if(i == n-1 && j == m-1){
            return 1;
        }

        int downPath = paths(i+1, j, n, m);
        int rightPath = paths(i, j+1, n, m);

        return downPath + rightPath;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int path = paths(0, 0, n, m);
        System.out.println(path);
    }
    
}
