class Solution {

    static boolean isSym(int num, int half) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < half; i++) {
            sum1 += num % 10;
            num /= 10;
        }

        for (int i = 0; i < half; i++) {
            sum2 += num % 10;
            num /= 10;
        }

        return sum1 == sum2;
    }

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            int len = String.valueOf(i).length();

            if (len % 2 == 0 && isSym(i, len / 2)) {
                count++;
            }
        }

        return count;
    }
}