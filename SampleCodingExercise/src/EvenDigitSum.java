public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int lastNum = number % 10;
        int even = 0, odd = 0;

        int initializer = (lastNum % 2 == 0) ? (even += lastNum) : (odd += lastNum);

        while (number > 9) {
            number /= 10;
            lastNum = number % 10;

            if (lastNum % 2 == 0) {
                even += lastNum;
            } else {
                odd += lastNum;
            }

        }

        return even;
    }
}
