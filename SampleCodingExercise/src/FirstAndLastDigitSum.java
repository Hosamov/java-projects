public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1234));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastNum = number % 10;

        while (number > 9) {
            number /= 10;
        }

        return lastNum + number;
    }
}