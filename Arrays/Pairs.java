public class Pairs {

    public static void pairOfNumber(int number[]) {
        int n = number.length;
        for(int i=0; i<n; i++) {
            int curr = number[i];
            for(int j=i; j<n; j++) {
                System.out.print("("+curr+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         int number[] = {1, 2, 3, 4, 5};
         pairOfNumber(number);
    }
}
