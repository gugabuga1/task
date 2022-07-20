package task012;

public class task12 {
    public static void main (String[] args){
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            double squareRoot = Math.sqrt(n) + 2;
            int r = 2;
            while (r <= squareRoot && isPrime) {
                if (n % r == 0) isPrime = false;
                r++;
            }
            System.out.print(isPrime ? (n + " ") : "");
        }
    }

}
