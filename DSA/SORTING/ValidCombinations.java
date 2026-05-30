import java.io.*;

public class ValidCombinations {
    static final int MOD = 998244353;
    static int[] fact;
    static int[] invFact;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());

        int out_ = ValidCombinations(A, B, C);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    // Fast modular exponentiation (base^exp % MOD)
    static int modPow(int base, int exp, int mod) {
        int result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) { // If exp is odd
                result = (int) ((long) result * base % mod);
            }
            base = (int) ((long) base * base % mod);
            exp >>= 1;
        }
        return result;
    }

    // Modular inverse using Fermat's theorem (x^(mod-2) % MOD)
    static int modInverse(int x, int mod) {
        return modPow(x, mod - 2, mod);
    }

    // Precompute factorials and inverse factorials up to limit
    static void precomputeFactorials(int limit) {
        fact = new int[limit + 1];
        invFact = new int[limit + 1];

        fact[0] = 1;
        for (int i = 1; i <= limit; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }

        invFact[limit] = modInverse(fact[limit], MOD);
        for (int i = limit - 1; i >= 0; i--) {
            invFact[i] = (int) ((long) invFact[i + 1] * (i + 1) % MOD);
        }
    }

    // Compute C(n, r) % MOD
    static int comb(int n, int r) {
        if (r > n || r < 0) return 0;
        return (int) ((long) fact[n] * invFact[r] % MOD * invFact[n - r] % MOD);
    }

    public static int ValidCombinations(int A, int B, int C) {
        if (C >= A || C < 0) {
            return 0;
        }

        // Precompute factorials up to A-1
        precomputeFactorials(A - 1);

        // Compute the result using the formula
        return (int) ((long) B * comb(A - 1, C) % MOD * modPow(B - 1, C, MOD) % MOD);
    }
}
