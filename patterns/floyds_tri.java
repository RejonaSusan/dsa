public class floyds_tri {

    public static void main(String[] args) {
        int n = 5;
        int num = 0;

        for (int i = 0; i<n;i++){
            for (int j=0; j<=i; j++){
                num++;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    
}
