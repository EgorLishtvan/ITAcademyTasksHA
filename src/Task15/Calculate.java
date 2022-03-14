package Task15;

class Calculate {
    public long sumD2(long n) {
        long sum = 0;
        do {
            sum = sum + (n % 10);
        } while ((n /= 10) != 0);
        return sum;
    }
}