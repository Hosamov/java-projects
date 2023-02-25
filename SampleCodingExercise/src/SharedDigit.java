import java.sql.PseudoColumnUsage;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            return (num1 % 10 == num2 % 10) || (num1 / 10 == num2 / 10) || (num1 % 10 == num2 / 10)
                    || (num1 / 10 == num2 % 10);
        }

        return false;

    }
}
