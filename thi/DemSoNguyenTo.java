package thi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DemSoNguyenTo {
    static final int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX + 1];
    static int[] primeCount = new int[MAX + 1];

    public static void sieve(){
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(long i=2; i*i<=MAX;i++){
            if(isPrime[(int)i]){
                for(long j=i*i ; j<= MAX ; j+=i){
                    isPrime[(int)j] = false;
                }
            }
        }

        for(int i =1; i<= MAX;i++){
            if(isPrime[(int)i]){
                primeCount[i] = primeCount[i-1] + 1;
            }
            else{
                primeCount[i] = primeCount[i-1];
            }
        }
        
    }
    public static void main(String[] args) {
        sieve();          // Tiền xử lý một lần

        Scanner sc = new Scanner(System.in);
        
        int Q = sc.nextInt();

        for (int q = 0; q < Q; q++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            
            int ans;
            
            if (L == 1) {
                ans = primeCount[R];                    // Từ 1 đến R
            } else {
                ans = primeCount[R] - primeCount[L - 1];    // Từ L đến R
            }
            
            System.out.print(ans + " ");
        }
        System.out.println();
        }
}
