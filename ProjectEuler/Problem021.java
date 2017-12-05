import java.util.*;

/*
    Let d(n) be defined as the sum of proper divisors of n (numbers less than
    n which divide evenly into n).
    If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair
    and each of and b are called amicable numbers.

    For example the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
    therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

    Evaluate the sum of all the amicable numbers under 10_000.
*/

public class Problem021 {
    public static void main(String[] args) {
        for (int i=1;i<300;i++) {
            Set<Integer> divisors = findDivisors(i);
            int sumOfDivisors = sum(divisors);
            Set<Integer> divisorsOfSum = findDivisors(sumOfDivisors);
            int sumOfDivisorsOfSum = sum(divisorsOfSum);
            if (sumOfDivisorsOfSum == i) System.out.println("Amicable pair: " + i + " and " + sumOfDivisors);
        }
    }

    static Set<Integer> findDivisors(int n) {
        Set<Integer> divisors = new HashSet<>();
        divisors.add(1);
        int root = (int) Math.sqrt(n);
        for (int i=2;i<=root;i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);   
            }
        }
        return divisors;
    }

    static int sum(Collection<Integer> coll) {
        int sum = 0;
        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext())
            sum += iterator.next();
        return sum;
    }
}