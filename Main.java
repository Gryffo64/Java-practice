import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[(int) n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long[] copyA = a.clone();

            Arrays.sort(copyA);

            if (Arrays.equals(copyA, a) || k > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}